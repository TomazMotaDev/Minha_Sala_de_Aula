/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.minha_sala_de_aula.Turmas;

/**
 *
 * @author tomazaudio
 */
public class GuiPlanejamento extends javax.swing.JFrame {

    /**
     * Creates new form GuiPlanejamento
     */
    public GuiPlanejamento() {
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
        lbTitulo = new javax.swing.JLabel();
        lbObjetivos = new javax.swing.JLabel();
        lbConteudos = new javax.swing.JLabel();
        lbMetodologia = new javax.swing.JLabel();
        lbRecursos = new javax.swing.JLabel();
        scrpnObjetivo = new javax.swing.JScrollPane();
        lbObTexto = new javax.swing.JLabel();
        scrlpnConteudo = new javax.swing.JScrollPane();
        lbContTexto = new javax.swing.JLabel();
        scrlpnMetodologia = new javax.swing.JScrollPane();
        lbMetoTexto = new javax.swing.JLabel();
        scrlpnRecursos = new javax.swing.JScrollPane();
        lbRecTexto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 561, 554));

        lbTitulo.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo.setText("Planejamento de Aula");

        lbObjetivos.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        lbObjetivos.setForeground(new java.awt.Color(0, 0, 0));
        lbObjetivos.setText("Objetivo(s)");

        lbConteudos.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        lbConteudos.setForeground(new java.awt.Color(0, 0, 0));
        lbConteudos.setText("Conteúdo(s)");

        lbMetodologia.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        lbMetodologia.setForeground(new java.awt.Color(0, 0, 0));
        lbMetodologia.setText("Metodologia");

        lbRecursos.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        lbRecursos.setForeground(new java.awt.Color(0, 0, 0));
        lbRecursos.setText("Recursos Didáticos");

        scrpnObjetivo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrpnObjetivo.setOpaque(false);

        lbObTexto.setForeground(new java.awt.Color(0, 0, 0));
        lbObTexto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        scrpnObjetivo.setViewportView(lbObTexto);

        lbContTexto.setForeground(new java.awt.Color(0, 0, 0));
        lbContTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbContTexto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        scrlpnConteudo.setViewportView(lbContTexto);

        lbMetoTexto.setForeground(new java.awt.Color(0, 0, 0));
        lbMetoTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbMetoTexto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        scrlpnMetodologia.setViewportView(lbMetoTexto);

        lbRecTexto.setForeground(new java.awt.Color(0, 0, 0));
        lbRecTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbRecTexto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        scrlpnRecursos.setViewportView(lbRecTexto);

        jButton1.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/resources/icon/Botao_Confirmar.png")); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/resources/icon/Botao_Confirmar_Pressed.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFolhas1Layout = new javax.swing.GroupLayout(panelFolhas1);
        panelFolhas1.setLayout(panelFolhas1Layout);
        panelFolhas1Layout.setHorizontalGroup(
            panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFolhas1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(scrpnObjetivo)
                        .addComponent(scrlpnConteudo)
                        .addComponent(scrlpnMetodologia)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFolhas1Layout.createSequentialGroup()
                            .addComponent(lbMetodologia)
                            .addGap(369, 369, 369))
                        .addComponent(scrlpnRecursos)
                        .addComponent(lbConteudos)
                        .addComponent(lbObjetivos)
                        .addGroup(panelFolhas1Layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addComponent(lbTitulo))
                        .addComponent(lbRecursos)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelFolhas1Layout.setVerticalGroup(
            panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFolhas1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTitulo)
                .addGap(13, 13, 13)
                .addComponent(lbObjetivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrpnObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbConteudos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlpnConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMetodologia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlpnMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRecursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlpnRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(GuiPlanejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPlanejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPlanejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPlanejamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPlanejamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbContTexto;
    private javax.swing.JLabel lbConteudos;
    private javax.swing.JLabel lbMetoTexto;
    private javax.swing.JLabel lbMetodologia;
    private javax.swing.JLabel lbObTexto;
    private javax.swing.JLabel lbObjetivos;
    private javax.swing.JLabel lbRecTexto;
    private javax.swing.JLabel lbRecursos;
    private javax.swing.JLabel lbTitulo;
    private com.minha_sala_de_aula.Fabrica.PanelDegradeAzul panelDegradeAzul1;
    private com.minha_sala_de_aula.Fabrica.PanelFolhas panelFolhas1;
    private javax.swing.JScrollPane scrlpnConteudo;
    private javax.swing.JScrollPane scrlpnMetodologia;
    private javax.swing.JScrollPane scrlpnRecursos;
    private javax.swing.JScrollPane scrpnObjetivo;
    // End of variables declaration//GEN-END:variables
}
