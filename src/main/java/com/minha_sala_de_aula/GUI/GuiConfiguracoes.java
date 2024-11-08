/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.minha_sala_de_aula.GUI;

/**
 *
 * @author tomazaudio
 */
public class GuiConfiguracoes extends javax.swing.JFrame {

    /**
     * Creates new form GuiConfiguracoes
     */
    public GuiConfiguracoes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDegradeAzul1 = new com.minha_sala_de_aula.Fabrica.PanelDegradeAzul();
        panelFolhas1 = new com.minha_sala_de_aula.Fabrica.PanelFolhas();
        lbConfig = new javax.swing.JLabel();
        lbGeral = new javax.swing.JLabel();
        lbResolucao = new javax.swing.JLabel();
        lbAcess = new javax.swing.JLabel();
        lbTamFonte = new javax.swing.JLabel();
        lbContraste = new javax.swing.JLabel();
        lbTeclasSonorizadas = new javax.swing.JLabel();
        slTmFonte = new javax.swing.JSlider();
        lbFontePequeana = new javax.swing.JLabel();
        lbFonteGrande = new javax.swing.JLabel();
        chkbContraste = new javax.swing.JCheckBox();
        chkbTcSonorizadas = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        lbAtalho = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbConfig.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbConfig.setForeground(new java.awt.Color(0, 0, 0));
        lbConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConfig.setText("Configurações");

        lbGeral.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        lbGeral.setForeground(new java.awt.Color(0, 0, 0));
        lbGeral.setText("Geral");

        lbResolucao.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbResolucao.setForeground(new java.awt.Color(0, 0, 0));
        lbResolucao.setText("Resolução da Tela");

        lbAcess.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        lbAcess.setForeground(new java.awt.Color(0, 0, 0));
        lbAcess.setText("Acessibilidade");

        lbTamFonte.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbTamFonte.setForeground(new java.awt.Color(0, 0, 0));
        lbTamFonte.setText("Tamanho da Fonte");

        lbContraste.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbContraste.setForeground(new java.awt.Color(0, 0, 0));
        lbContraste.setText("Alto Contraste");

        lbTeclasSonorizadas.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbTeclasSonorizadas.setForeground(new java.awt.Color(0, 0, 0));
        lbTeclasSonorizadas.setText("Teclas Sonorizadas");
        lbTeclasSonorizadas.setToolTipText("");

        lbFontePequeana.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        lbFontePequeana.setForeground(new java.awt.Color(0, 0, 0));
        lbFontePequeana.setText("A");

        lbFonteGrande.setForeground(new java.awt.Color(0, 0, 0));
        lbFonteGrande.setText("A");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbAtalho.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        lbAtalho.setForeground(new java.awt.Color(0, 0, 0));
        lbAtalho.setText("Atalhos");

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane1.setText("Ctrl+S\nCtrl+M\nCtrl+1\nCtrl+2\nCtrl+3\nCtrl+4");
        jTextPane1.setOpaque(false);
        jScrollPane1.setViewportView(jTextPane1);

        jTextPane2.setEditable(false);
        jTextPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane2.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane2.setText("Salva todas as modificações no banco de dados\nPonteiro do mouse vibra facilitando sua visualização e localização\nDireciona a tela para a aba Calendario\nDireciona a tela para a aba Professor(a/e)\nDireciona a tela para a aba Turmas\nDireciona a tela para a aba Finanças");
        jScrollPane2.setViewportView(jTextPane2);

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);

        javax.swing.GroupLayout panelFolhas1Layout = new javax.swing.GroupLayout(panelFolhas1);
        panelFolhas1.setLayout(panelFolhas1Layout);
        panelFolhas1Layout.setHorizontalGroup(
            panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbConfig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFolhas1Layout.createSequentialGroup()
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelFolhas1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFolhas1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbAtalho)
                            .addGroup(panelFolhas1Layout.createSequentialGroup()
                                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbResolucao)
                                        .addComponent(lbGeral)
                                        .addComponent(lbAcess))
                                    .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbContraste)
                                        .addComponent(lbTamFonte)
                                        .addComponent(lbTeclasSonorizadas)))
                                .addGap(36, 36, 36)
                                .addComponent(lbFonteGrande)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slTmFonte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbFontePequeana)
                                    .addComponent(chkbTcSonorizadas)
                                    .addComponent(chkbContraste)))
                            .addGroup(panelFolhas1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane2))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelFolhas1Layout.setVerticalGroup(
            panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFolhas1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbConfig)
                .addGap(18, 18, 18)
                .addComponent(lbGeral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbResolucao)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lbAcess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTamFonte)
                    .addComponent(slTmFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFontePequeana)
                    .addComponent(lbFonteGrande))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFolhas1Layout.createSequentialGroup()
                        .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContraste)
                            .addComponent(chkbContraste))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTeclasSonorizadas)
                            .addComponent(chkbTcSonorizadas))
                        .addGap(32, 32, 32)
                        .addComponent(lbAtalho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addGap(26, 26, 26)
                        .addComponent(jButton2))
                    .addComponent(jButton1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDegradeAzul1Layout = new javax.swing.GroupLayout(panelDegradeAzul1);
        panelDegradeAzul1.setLayout(panelDegradeAzul1Layout);
        panelDegradeAzul1Layout.setHorizontalGroup(
            panelDegradeAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDegradeAzul1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFolhas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDegradeAzul1Layout.setVerticalGroup(
            panelDegradeAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDegradeAzul1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFolhas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDegradeAzul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDegradeAzul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiConfiguracoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkbContraste;
    private javax.swing.JCheckBox chkbTcSonorizadas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel lbAcess;
    private javax.swing.JLabel lbAtalho;
    private javax.swing.JLabel lbConfig;
    private javax.swing.JLabel lbContraste;
    private javax.swing.JLabel lbFonteGrande;
    private javax.swing.JLabel lbFontePequeana;
    private javax.swing.JLabel lbGeral;
    private javax.swing.JLabel lbResolucao;
    private javax.swing.JLabel lbTamFonte;
    private javax.swing.JLabel lbTeclasSonorizadas;
    private com.minha_sala_de_aula.Fabrica.PanelDegradeAzul panelDegradeAzul1;
    private com.minha_sala_de_aula.Fabrica.PanelFolhas panelFolhas1;
    private javax.swing.JSlider slTmFonte;
    // End of variables declaration//GEN-END:variables
}
