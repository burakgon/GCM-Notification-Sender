/*
 * Copyright 2015 burakgon.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.burakgon.gcmsender;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONObject;

/**
 *
 * @author burakgon
 */
public class GCMSenderUI extends javax.swing.JFrame {

    /**
     * Creates new form GCMSenderUI
     */
    public GCMSenderUI() {
        initComponents();
    }
    
    private String getFromClipboad(){
        try {
            String data = (String) Toolkit.getDefaultToolkit() 
                    .getSystemClipboard().getData(DataFlavor.stringFlavor);
            return data;
        } catch (UnsupportedFlavorException | IOException ex) {
            Logger.getLogger(GCMSenderUI.class.getName()).log(Level.SEVERE, null, ex);
                        return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        toDevice = new javax.swing.JTextPane();
        toText = new javax.swing.JLabel();
        toText1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultText = new javax.swing.JTextPane();
        toText2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        notificationMessageText = new javax.swing.JTextArea();
        toText3 = new javax.swing.JLabel();
        pasteButton = new javax.swing.JButton();
        toText4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        gcmAPIText = new javax.swing.JTextPane();
        pasteButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        notificationTitleText = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GCM Notification Sender (burakgon)");

        sendButton.setText("SEND NOTIFICATION");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(toDevice);

        toText.setText("TO (DEVICE REG ID):");

        toText1.setText("NOTIFICATION TITLE:");

        jScrollPane2.setBackground(new java.awt.Color(219, 219, 219));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setHorizontalScrollBar(null);

        resultText.setEditable(false);
        resultText.setBackground(new java.awt.Color(219, 219, 219));
        resultText.setToolTipText("");
        jScrollPane2.setViewportView(resultText);

        toText2.setText("NOTIFICATION MESSAGE:");

        jScrollPane3.setToolTipText("");
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        notificationMessageText.setColumns(20);
        notificationMessageText.setRows(5);
        jScrollPane3.setViewportView(notificationMessageText);

        toText3.setText("RESULT:");

        pasteButton.setText("PASTE");
        pasteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteButtonActionPerformed(evt);
            }
        });

        toText4.setText("GCM API KEY");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setViewportView(gcmAPIText);

        pasteButton1.setText("PASTE");
        pasteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteButton1ActionPerformed(evt);
            }
        });

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setToolTipText("");
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane6.setHorizontalScrollBar(null);

        notificationTitleText.setToolTipText("");
        jScrollPane6.setViewportView(notificationTitleText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toText3)
                    .addComponent(toText4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pasteButton1)
                            .addComponent(pasteButton)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sendButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(toText1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(toText2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(toText4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pasteButton))
                .addGap(25, 25, 25)
                .addComponent(toText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pasteButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toText1)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendButton)
                .addGap(18, 18, 18)
                .addComponent(toText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:
         CloseableHttpClient httpClient = HttpClientBuilder.create().build(); //Use this instead

        try {
            HttpPost request = new HttpPost("https://gcm-http.googleapis.com/gcm/send");
            JSONObject json = new JSONObject();    
            StringEntity params =new StringEntity("{ \"notification\": { \"title\":"+"\""+notificationTitleText.getText()+"\""+", \"text\":"+"\""+notificationMessageText.getText()+"\""+"}, \"to\" :"+"\""+toDevice.getText()+"\""+"}");


            request.addHeader("content-type", "application/json");
            request.addHeader("authorization","key="+gcmAPIText.getText());

            
            StringEntity se = new StringEntity(json.toString());
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);
            
            resultText.setText(response.getStatusLine().toString());
            // handle response here...
        } catch (Exception ex) {
            // handle exception here
            Logger.getLogger(GCMSenderUI.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                httpClient.close();
            } catch (IOException ex) {
                Logger.getLogger(GCMSenderUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
        
    }//GEN-LAST:event_sendButtonActionPerformed

    private void pasteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteButtonActionPerformed
        // TODO add your handling code here:
        gcmAPIText.setText(getFromClipboad());
    }//GEN-LAST:event_pasteButtonActionPerformed

    private void pasteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteButton1ActionPerformed
        // TODO add your handling code here:
                toDevice.setText(getFromClipboad());

    }//GEN-LAST:event_pasteButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GCMSenderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GCMSenderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GCMSenderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GCMSenderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GCMSenderUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane gcmAPIText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea notificationMessageText;
    private javax.swing.JTextPane notificationTitleText;
    private javax.swing.JButton pasteButton;
    private javax.swing.JButton pasteButton1;
    private javax.swing.JTextPane resultText;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextPane toDevice;
    private javax.swing.JLabel toText;
    private javax.swing.JLabel toText1;
    private javax.swing.JLabel toText2;
    private javax.swing.JLabel toText3;
    private javax.swing.JLabel toText4;
    // End of variables declaration//GEN-END:variables
}
