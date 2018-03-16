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

package org.omegat.gui.align;

import org.omegat.util.OStrings;

/**
 * Frame with menu for AlignPanel.
 * <p>
 * THIS MUST BE EDITED IN NETBEANS GUI BUILDER.
 *
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class AlignMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form AlignMenuFrame
     */
    public AlignMenuFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveItem = new javax.swing.JMenuItem();
        resetItem = new javax.swing.JMenuItem();
        reloadItem = new javax.swing.JMenuItem();
        closeItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        moveUpItem = new javax.swing.JMenuItem();
        moveDownItem = new javax.swing.JMenuItem();
        splitItem = new javax.swing.JMenuItem();
        mergeItem = new javax.swing.JMenuItem();
        editItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        markAcceptedItem = new javax.swing.JMenuItem();
        markNeedsReviewItem = new javax.swing.JMenuItem();
        clearMarkItem = new javax.swing.JMenuItem();
        realignPendingItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        keepAllItem = new javax.swing.JMenuItem();
        keepNoneItem = new javax.swing.JMenuItem();
        toggleSelectedItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        pinpointAlignStartItem = new javax.swing.JMenuItem();
        pinpointAlignEndItem = new javax.swing.JMenuItem();
        pinpointAlignCancelItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        highlightItem = new javax.swing.JCheckBoxMenuItem();
        highlightPatternItem = new javax.swing.JMenuItem();
        optionsMenu = new javax.swing.JMenu();
        removeTagsItem = new javax.swing.JCheckBoxMenuItem();
        segmentingItem = new javax.swing.JCheckBoxMenuItem();
        segmentingRulesItem = new javax.swing.JMenuItem();
        fileFilterSettingsItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        org.openide.awt.Mnemonics.setLocalizedText(fileMenu, OStrings.getString("ALIGNER_MENU_FILE")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(saveItem, OStrings.getString("ALIGNER_MENU_FILE_SAVE")); // NOI18N
        fileMenu.add(saveItem);

        org.openide.awt.Mnemonics.setLocalizedText(resetItem, OStrings.getString("ALIGNER_MENU_FILE_RESET")); // NOI18N
        fileMenu.add(resetItem);

        org.openide.awt.Mnemonics.setLocalizedText(reloadItem, OStrings.getString("ALIGNER_MENU_FILE_RELOAD")); // NOI18N
        fileMenu.add(reloadItem);

        org.openide.awt.Mnemonics.setLocalizedText(closeItem, OStrings.getString("ALIGNER_MENU_FILE_CLOSE")); // NOI18N
        fileMenu.add(closeItem);

        menuBar.add(fileMenu);

        org.openide.awt.Mnemonics.setLocalizedText(editMenu, OStrings.getString("ALIGNER_MENU_EDIT")); // NOI18N

        moveUpItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, 0));
        org.openide.awt.Mnemonics.setLocalizedText(moveUpItem, OStrings.getString("ALIGNER_MENU_EDIT_MOVEUP")); // NOI18N
        editMenu.add(moveUpItem);

        moveDownItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
        org.openide.awt.Mnemonics.setLocalizedText(moveDownItem, OStrings.getString("ALIGNER_MENU_EDIT_MOVEDOWN")); // NOI18N
        editMenu.add(moveDownItem);

        splitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        org.openide.awt.Mnemonics.setLocalizedText(splitItem, OStrings.getString("ALIGNER_MENU_EDIT_SPLIT")); // NOI18N
        editMenu.add(splitItem);

        mergeItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        org.openide.awt.Mnemonics.setLocalizedText(mergeItem, OStrings.getString("ALIGNER_MENU_EDIT_MERGE")); // NOI18N
        editMenu.add(mergeItem);

        editItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        org.openide.awt.Mnemonics.setLocalizedText(editItem, OStrings.getString("ALIGNER_MENU_EDIT_EDIT")); // NOI18N
        editMenu.add(editItem);
        editMenu.add(jSeparator1);

        markAcceptedItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        org.openide.awt.Mnemonics.setLocalizedText(markAcceptedItem, OStrings.getString("ALIGNER_MENU_EDIT_MARKACCEPTED")); // NOI18N
        editMenu.add(markAcceptedItem);

        markNeedsReviewItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        org.openide.awt.Mnemonics.setLocalizedText(markNeedsReviewItem, OStrings.getString("ALIGNER_MENU_EDIT_MARKNEEDSREVIEW")); // NOI18N
        editMenu.add(markNeedsReviewItem);

        clearMarkItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        org.openide.awt.Mnemonics.setLocalizedText(clearMarkItem, OStrings.getString("ALIGNER_MENU_EDIT_CLEARMARK")); // NOI18N
        editMenu.add(clearMarkItem);

        org.openide.awt.Mnemonics.setLocalizedText(realignPendingItem, OStrings.getString("ALIGNER_MENU_EDIT_REALIGN")); // NOI18N
        editMenu.add(realignPendingItem);
        editMenu.add(jSeparator2);

        org.openide.awt.Mnemonics.setLocalizedText(keepAllItem, OStrings.getString("ALIGNER_MENU_EDIT_KEEPALL")); // NOI18N
        editMenu.add(keepAllItem);

        org.openide.awt.Mnemonics.setLocalizedText(keepNoneItem, OStrings.getString("ALIGNER_MENU_EDIT_KEEPNONE")); // NOI18N
        editMenu.add(keepNoneItem);

        toggleSelectedItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, 0));
        org.openide.awt.Mnemonics.setLocalizedText(toggleSelectedItem, OStrings.getString("ALIGNER_MENU_EDIT_TOGGLESELECTED")); // NOI18N
        editMenu.add(toggleSelectedItem);
        editMenu.add(jSeparator3);

        pinpointAlignStartItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, 0));
        org.openide.awt.Mnemonics.setLocalizedText(pinpointAlignStartItem, OStrings.getString("ALIGNER_MENU_EDIT_PINPOINTALIGNSTART")); // NOI18N
        editMenu.add(pinpointAlignStartItem);

        pinpointAlignEndItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, 0));
        org.openide.awt.Mnemonics.setLocalizedText(pinpointAlignEndItem, OStrings.getString("ALIGNER_MENU_EDIT_PINPOINTALIGNEND")); // NOI18N
        editMenu.add(pinpointAlignEndItem);

        pinpointAlignCancelItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        org.openide.awt.Mnemonics.setLocalizedText(pinpointAlignCancelItem, OStrings.getString("ALIGNER_MENU_EDIT_PINPOINTALIGNCANCEL")); // NOI18N
        editMenu.add(pinpointAlignCancelItem);

        menuBar.add(editMenu);

        org.openide.awt.Mnemonics.setLocalizedText(viewMenu, OStrings.getString("ALIGNER_MENU_VIEW")); // NOI18N

        highlightItem.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(highlightItem, OStrings.getString("ALIGNER_MENU_VIEW_HIGHLIGHT")); // NOI18N
        viewMenu.add(highlightItem);

        org.openide.awt.Mnemonics.setLocalizedText(highlightPatternItem, OStrings.getString("ALIGNER_MENU_VIEW_HIGHLIGHTPATTERN")); // NOI18N
        viewMenu.add(highlightPatternItem);

        menuBar.add(viewMenu);

        org.openide.awt.Mnemonics.setLocalizedText(optionsMenu, OStrings.getString("ALIGNER_MENU_OPTIONS")); // NOI18N

        removeTagsItem.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(removeTagsItem, OStrings.getString("ALIGNER_MENU_OPTIONS_REMOVETAGS")); // NOI18N
        optionsMenu.add(removeTagsItem);

        segmentingItem.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(segmentingItem, OStrings.getString("ALIGNER_MENU_OPTIONS_SEGMENT")); // NOI18N
        optionsMenu.add(segmentingItem);

        org.openide.awt.Mnemonics.setLocalizedText(segmentingRulesItem, OStrings.getString("ALIGNER_MENU_OPTIONS_SEGMENTATIONRULES")); // NOI18N
        optionsMenu.add(segmentingRulesItem);

        org.openide.awt.Mnemonics.setLocalizedText(fileFilterSettingsItem, OStrings.getString("ALIGNER_MENU_OPTIONS_FILEFILTERS")); // NOI18N
        optionsMenu.add(fileFilterSettingsItem);

        menuBar.add(optionsMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem clearMarkItem;
    public javax.swing.JMenuItem closeItem;
    public javax.swing.JMenuItem editItem;
    public javax.swing.JMenu editMenu;
    public javax.swing.JMenuItem fileFilterSettingsItem;
    public javax.swing.JMenu fileMenu;
    public javax.swing.JCheckBoxMenuItem highlightItem;
    public javax.swing.JMenuItem highlightPatternItem;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    public javax.swing.JMenuItem keepAllItem;
    public javax.swing.JMenuItem keepNoneItem;
    public javax.swing.JMenuItem markAcceptedItem;
    public javax.swing.JMenuItem markNeedsReviewItem;
    private javax.swing.JMenuBar menuBar;
    public javax.swing.JMenuItem mergeItem;
    public javax.swing.JMenuItem moveDownItem;
    public javax.swing.JMenuItem moveUpItem;
    public javax.swing.JMenu optionsMenu;
    public javax.swing.JMenuItem pinpointAlignCancelItem;
    public javax.swing.JMenuItem pinpointAlignEndItem;
    public javax.swing.JMenuItem pinpointAlignStartItem;
    public javax.swing.JMenuItem realignPendingItem;
    public javax.swing.JMenuItem reloadItem;
    public javax.swing.JCheckBoxMenuItem removeTagsItem;
    public javax.swing.JMenuItem resetItem;
    public javax.swing.JMenuItem saveItem;
    public javax.swing.JCheckBoxMenuItem segmentingItem;
    public javax.swing.JMenuItem segmentingRulesItem;
    public javax.swing.JMenuItem splitItem;
    public javax.swing.JMenuItem toggleSelectedItem;
    public javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables
}
