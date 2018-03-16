/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2016 Aaron Madlon-Kay
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.gui.preferences;

import org.omegat.util.OStrings;

/**
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class PreferencePanel extends javax.swing.JPanel {

    /**
     * Creates new form PreferencePanel
     */
    public PreferencePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        prefsViewPanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        messageTextArea = new javax.swing.JTextArea();
        bottomButtonsPanel = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        resetButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setLayout(new java.awt.BorderLayout());

        prefsViewPanel.setLayout(new java.awt.BorderLayout());
        add(prefsViewPanel, java.awt.BorderLayout.CENTER);

        bottomPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        bottomPanel.setLayout(new java.awt.BorderLayout());

        messageTextArea.setEditable(false);
        messageTextArea.setFont(jLabel1.getFont());
        messageTextArea.setLineWrap(true);
        messageTextArea.setWrapStyleWord(true);
        messageTextArea.setOpaque(false);
        bottomPanel.add(messageTextArea, java.awt.BorderLayout.CENTER);

        bottomButtonsPanel.setLayout(new javax.swing.BoxLayout(bottomButtonsPanel, javax.swing.BoxLayout.LINE_AXIS));
        bottomButtonsPanel.add(filler2);

        org.openide.awt.Mnemonics.setLocalizedText(resetButton, OStrings.getString("PREFERENCES_BUTTON_RESET")); // NOI18N
        bottomButtonsPanel.add(resetButton);

        org.openide.awt.Mnemonics.setLocalizedText(undoButton, OStrings.getString("PREFERENCES_BUTTON_UNDO")); // NOI18N
        bottomButtonsPanel.add(undoButton);
        bottomButtonsPanel.add(filler1);

        org.openide.awt.Mnemonics.setLocalizedText(okButton, OStrings.getString("BUTTON_OK")); // NOI18N
        bottomButtonsPanel.add(okButton);

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, OStrings.getString("BUTTON_CANCEL")); // NOI18N
        bottomButtonsPanel.add(cancelButton);

        bottomPanel.add(bottomButtonsPanel, java.awt.BorderLayout.EAST);

        add(bottomPanel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel bottomButtonsPanel;
    public javax.swing.JPanel bottomPanel;
    public javax.swing.JButton cancelButton;
    javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextArea messageTextArea;
    public javax.swing.JButton okButton;
    public javax.swing.JPanel prefsViewPanel;
    public javax.swing.JButton resetButton;
    public javax.swing.JButton undoButton;
    // End of variables declaration//GEN-END:variables
}
