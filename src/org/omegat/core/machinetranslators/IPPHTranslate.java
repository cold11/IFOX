package org.omegat.core.machinetranslators;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.omegat.core.Core;
import org.omegat.filters2.html2.HTMLUtils;
import org.omegat.gui.exttrans.MTConfigDialog;
import org.omegat.tokenizer.ITokenizer;
import org.omegat.util.DeNormalize;
import org.omegat.util.Language;
import org.omegat.util.OStrings;
import org.omegat.util.Preferences;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IPPHTranslate extends BaseTranslate {

    private static final String PROPERTY_MOSES_URL = "moses.server.url";

    @Override
    protected String getPreferenceName() {
        return Preferences.ALLOW_MOSES_TRANSLATE;
    }

    public String getName() {
        return OStrings.getString("MT_ENGINE_MOSES");
    }

    @Override
    protected String translate(Language sLang, Language tLang, String text) throws Exception {

        String server = getServerUrl();

        if (server == null) {
            return OStrings.getString("MT_ENGINE_MOSES_URL_NOTFOUND");
        }

        XmlRpcClient client = getClient(new URL(server));

        Map<String, String> mosesParams = new HashMap<>();
        mosesParams.put("text", mosesPreprocess(text, sLang.getLocale()));

        Object[] xmlRpcParams = { mosesParams };

        try {
            HashMap<?, ?> response = (HashMap<?, ?>) client.execute("translate", xmlRpcParams);
            return mosesPostprocess((String) response.get("text"), tLang);
        } catch (XmlRpcException e) {
            return e.getLocalizedMessage();
        }
    }

    private XmlRpcClient getClient(URL url) {
        XmlRpcClient client = new XmlRpcClient();
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(url);
        client.setConfig(config);
        return client;
    }

    private String getServerUrl() {
        return System.getProperty(PROPERTY_MOSES_URL, Preferences.getPreference(PROPERTY_MOSES_URL));
    }

    private String mosesPreprocess(String text, Locale locale) {
        ITokenizer tokenizer = Core.getProject().getSourceTokenizer();
        StringBuilder sb = new StringBuilder();
        for (String t : tokenizer.tokenizeVerbatimToStrings(text)) {
            sb.append(t);
            sb.append(" ");
        }
        String result = sb.toString();
        return result.toLowerCase(locale);
    }

    private String mosesPostprocess(String text, Language targetLanguage) {
        String result = HTMLUtils.entitiesToChars(text);

        result = DeNormalize.processSingleLine(result).replaceAll("\\s+", " ").trim();

        if (!targetLanguage.isSpaceDelimited()) {
            result = result.replaceAll("(?<=[\u3001-\u9fa0])\\s+(?=[\u3001-\u9fa0])", "");
        }

        return cleanSpacesAroundTags(result, text);
    }

    @Override
    public boolean isConfigurable() {
        return true;
    }

    @Override
    public void showConfigurationUI(Window parent) {
        MTConfigDialog dialog = new MTConfigDialog(parent, getName()) {
            @Override
            protected void onConfirm() {
                String url = panel.valueField1.getText().trim();
                System.setProperty(PROPERTY_MOSES_URL, url);
                Preferences.setPreference(PROPERTY_MOSES_URL, url);
            }
        };

        JLabel messageLabel = new JLabel();
        JButton testButton = new JButton(OStrings.getString("MT_ENGINE_MOSES_TEST_BUTTON"));
        testButton.addActionListener(e -> {
            messageLabel.setText(OStrings.getString("MT_ENGINE_MOSES_TEST_TESTING"));
            String url = dialog.panel.valueField1.getText().trim();
            new SwingWorker<String, Void>() {
                @Override
                protected String doInBackground() throws Exception {
                    XmlRpcClient client = getClient(new URL(url));
                    Object response = client.execute("system.listMethods", (Object[]) null);
                    if (Arrays.asList(((Object[]) response)).contains("translate")) {
                        return OStrings.getString("MT_ENGINE_MOSES_TEST_RESULT_OK");
                    } else {
                        return OStrings.getString("MT_ENGINE_MOSES_TEST_RESULT_NO_TRANSLATE");
                    }
                }

                @Override
                protected void done() {
                    String message = null;
                    try {
                        message = get();
                    } catch (ExecutionException e) {
                        message = e.getCause().getLocalizedMessage();
                        Logger.getLogger(getClass().getName()).log(Level.SEVERE, message, e);
                    } catch (Exception e) {
                        message = e.getLocalizedMessage();
                        Logger.getLogger(getClass().getName()).log(Level.SEVERE, message, e);
                    }
                    messageLabel.setText(message);
                }
            }.execute();

        });
        JPanel testPanel = new JPanel();
        testPanel.setLayout(new BoxLayout(testPanel, BoxLayout.LINE_AXIS));
        testPanel.add(testButton);
        testPanel.add(messageLabel);
        testPanel.setAlignmentX(0);
        dialog.panel.itemsPanel.add(testPanel);

        dialog.panel.valueLabel1.setText(OStrings.getString("MT_ENGINE_MOSES_URL_LABEL"));
        dialog.panel.valueField1.setText(getServerUrl());
        dialog.panel.valueField1.setColumns(20);

        dialog.panel.valueLabel2.setVisible(false);
        dialog.panel.valueField2.setVisible(false);

        dialog.panel.temporaryCheckBox.setVisible(false);

        dialog.show();
    }
}