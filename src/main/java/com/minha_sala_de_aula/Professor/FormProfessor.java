/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.minha_sala_de_aula.Professor;

import com.minha_sala_de_aula.GUI.FormValidacao;
import com.minha_sala_de_aula.GUI.GUI_Principal;
import com.minha_sala_de_aula.GUI.PanelProfessor;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author tomazaudio
 */
public class FormProfessor extends javax.swing.JFrame implements FormValidacao{
    
    public javax.swing.JButton getBtCancelar(){
        return btCancelar;
    }
    /**
     * Creates new form FormProfessor
     */
    public FormProfessor() {
        initComponents();
    }
    
    public FormProfessor(Professor profEdit) {
        initComponents();
        
        tfNome.setText(profEdit.getNome());
        tfContato.setText(profEdit.getContato());
        tfEmail.setText(profEdit.getEmail());
        taBio.setText(profEdit.getApresentacao().getBio());
        taMetodologia.setText(profEdit.getApresentacao().getMetodologia());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        panelDegradeAzul1 = new com.minha_sala_de_aula.Fabrica.PanelDegradeAzul();
        panelFolhas1 = new com.minha_sala_de_aula.Fabrica.PanelFolhas();
        pnProfessor = new javax.swing.JPanel();
        lbProfessor = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbBio = new javax.swing.JLabel();
        lbMetodologia = new javax.swing.JLabel();
        lbContato = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfContato = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        scrlpnBio = new javax.swing.JScrollPane();
        taBio = new javax.swing.JTextArea();
        scrlpnMetodologia = new javax.swing.JScrollPane();
        taMetodologia = new javax.swing.JTextArea();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnProfessor.setOpaque(false);

        lbProfessor.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbProfessor.setForeground(new java.awt.Color(0, 0, 0));
        lbProfessor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProfessor.setText("Professor");

        lbNome.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbNome.setForeground(new java.awt.Color(0, 0, 0));
        lbNome.setText("Nome");

        lbBio.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbBio.setForeground(new java.awt.Color(0, 0, 0));
        lbBio.setText("Bio - Escreva um pouco sobre você");

        lbMetodologia.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbMetodologia.setForeground(new java.awt.Color(0, 0, 0));
        lbMetodologia.setText("Metodologia - Escreva como são suas aulas");

        lbContato.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbContato.setForeground(new java.awt.Color(0, 0, 0));
        lbContato.setText("Contato");

        lbEmail.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 0, 0));
        lbEmail.setText("E-mail");

        tfNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));

        tfContato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));
        tfContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContatoActionPerformed(evt);
            }
        });

        tfEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));

        scrlpnBio.setPreferredSize(new java.awt.Dimension(292, 70));

        taBio.setColumns(20);
        taBio.setLineWrap(true);
        taBio.setRows(3);
        taBio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));
        scrlpnBio.setViewportView(taBio);

        scrlpnMetodologia.setPreferredSize(new java.awt.Dimension(292, 70));

        taMetodologia.setColumns(20);
        taMetodologia.setLineWrap(true);
        taMetodologia.setRows(3);
        taMetodologia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));
        scrlpnMetodologia.setViewportView(taMetodologia);

        javax.swing.GroupLayout pnProfessorLayout = new javax.swing.GroupLayout(pnProfessor);
        pnProfessor.setLayout(pnProfessorLayout);
        pnProfessorLayout.setHorizontalGroup(
            pnProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnProfessorLayout.createSequentialGroup()
                .addGroup(pnProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProfessorLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBio)
                            .addGroup(pnProfessorLayout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnProfessorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMetodologia)
                            .addComponent(scrlpnBio, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrlpnMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnProfessorLayout.createSequentialGroup()
                                .addComponent(lbContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfEmail)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnProfessorLayout.setVerticalGroup(
            pnProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbProfessor)
                .addGap(3, 3, 3)
                .addGroup(pnProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbBio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlpnBio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMetodologia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlpnMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(lbContato)
                    .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btCancelar.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Botao_Cancelar.png")); // NOI18N
        btCancelar.setBorderPainted(false);
        btCancelar.setContentAreaFilled(false);
        btCancelar.setPressedIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Botao_Cancelar_Pressed.png")); // NOI18N
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btConfirmar.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Botao_Confirmar.png")); // NOI18N
        btConfirmar.setBorderPainted(false);
        btConfirmar.setContentAreaFilled(false);
        btConfirmar.setPressedIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Botao_Confirmar_Pressed.png")); // NOI18N
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFolhas1Layout = new javax.swing.GroupLayout(panelFolhas1);
        panelFolhas1.setLayout(panelFolhas1Layout);
        panelFolhas1Layout.setHorizontalGroup(
            panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFolhas1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConfirmar)
                .addGap(25, 25, 25))
        );
        panelFolhas1Layout.setVerticalGroup(
            panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFolhas1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pnProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCancelar)
                    .addComponent(btConfirmar))
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addComponent(panelFolhas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tfContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContatoActionPerformed
        
    }//GEN-LAST:event_tfContatoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        mudarCor();
        if(camposVazios()){
            JOptionPane.showMessageDialog(null, "Verifique se todos os campos estão preenchidos corretamente.");
        }else{
            if(validarCampos()){
                mudarCor();
                JOptionPane.showMessageDialog(null, "Favor verificar se os campos foram preechidos corretamente.");
            }else {
                ProfessorJPA profJPA = new ProfessorJPA();
                
                if(GUI_Principal.getProfessor() == null){//cadastrar Professor
                    
                    GUI_Principal.ProfessorInicial();
                    Apresentacao apresentacao = new Apresentacao();

                    GUI_Principal.getProfessor().setNome(tfNome.getText());
                    apresentacao.setBio(taBio.getText());
                    apresentacao.setMetodologia(taMetodologia.getText());
                    GUI_Principal.getProfessor().setApresentacao(apresentacao);
                    GUI_Principal.getProfessor().setContato(tfContato.getText());
                    GUI_Principal.getProfessor().setEmail(tfEmail.getText());

                    profJPA.cadastrar(GUI_Principal.getProfessor());
                }else{//Editar Professor
                    GUI_Principal.getProfessor().setNome(tfNome.getText());
                    GUI_Principal.getProfessor().getApresentacao().setBio(taBio.getText());
                    GUI_Principal.getProfessor().getApresentacao().setMetodologia(taMetodologia.getText());
                    GUI_Principal.getProfessor().setContato(tfContato.getText());
                    GUI_Principal.getProfessor().setEmail(tfEmail.getText());
                    
                    profJPA.editar(GUI_Principal.getProfessor());
                }
                
                GUI_Principal.atualizarProf();
                PanelProfessor.infoProf();
                
                dispose();
            }
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel lbBio;
    private javax.swing.JLabel lbContato;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbMetodologia;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbProfessor;
    private com.minha_sala_de_aula.Fabrica.PanelDegradeAzul panelDegradeAzul1;
    private com.minha_sala_de_aula.Fabrica.PanelFolhas panelFolhas1;
    private javax.swing.JPanel pnProfessor;
    private javax.swing.JScrollPane scrlpnBio;
    private javax.swing.JScrollPane scrlpnMetodologia;
    private javax.swing.JTextArea taBio;
    private javax.swing.JTextArea taMetodologia;
    private javax.swing.JTextField tfContato;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    public boolean validarNome(){
        return tfNome.getText().matches("[\\w\\W\\s]+");
    }
    
    public boolean validarBio(){
        return taBio.getText().matches("[\\w\\W\\s]+");
    } 
    
    public boolean validarMetodologia(){
        return taMetodologia.getText().matches("[\\w\\W\\s]+");
    }
    
    public boolean validarContato(){
        return tfContato.getText().matches("[0-9]{11}|[(][0-9]{2}[)][\\s][0-9]{5}[-][0-9]{4}|[0-9]{2}[\\s][0-9]{9}|[0-9]{2}[\\s][0-9]{5}[-][0-9]{4}");
    }
    
    public boolean validarEmail(){
        return tfEmail.getText().matches("[\\w]+[@][\\w]+[.][\\w\\W]+");
    }
    
    @Override
    public boolean camposVazios(){
        return tfNome.getText().isEmpty() || tfContato.getText().isEmpty();
    }
    
    @Override
    public boolean validarCampos(){
        return !validarNome() || !validarBio() || !validarContato() || !validarMetodologia() || !validarEmail();
    }

    @Override
    public void mudarVermelho(JTextField tf) {
        tf.setBorder(BorderFactory.createLineBorder(new Color(175, 0 , 0)));
    }

    @Override
    public void mudarPadrao(JTextField tf) {
        tf.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 153)));
    }
    
    public void mudarVermelhoTA(JTextArea ta){
        ta.setBorder(BorderFactory.createLineBorder(new Color(175, 0 , 0)));
    }
    
    public void mudarPadraoTA(JTextArea ta){
        ta.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 153)));
    }

    @Override
    public void mudarCor() {
        if (!validarNome()){
            mudarVermelho(tfNome);
        }else{            
            mudarPadrao(tfNome);
        }
        
        
        if (!validarBio()){
            mudarVermelhoTA(taBio);
        }else{            
            mudarPadraoTA(taBio);
        }
        
        
        if (!validarMetodologia()){
            mudarVermelhoTA(taMetodologia);
        }else{            
            mudarPadraoTA(taMetodologia);
        }
        
        
        if (!validarContato()){
            mudarVermelho(tfContato);
        }else{
            mudarPadrao(tfContato);
        }
        
        if (!validarEmail()){
            mudarVermelho(tfEmail);
        }else{
            mudarPadrao(tfEmail);
        }
    }

}
