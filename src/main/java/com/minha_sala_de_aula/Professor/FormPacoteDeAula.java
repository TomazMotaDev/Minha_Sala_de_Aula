package com.minha_sala_de_aula.Professor;

import com.minha_sala_de_aula.GUI.FormValidacao;
import com.minha_sala_de_aula.GUI.GUI_Principal;
import com.minha_sala_de_aula.GUI.PanelProfessor;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormPacoteDeAula extends javax.swing.JFrame implements FormValidacao {

    private PacoteDeAula pacoteEdit;
    
    public FormPacoteDeAula() {
        initComponents();
        pacoteEdit = null;
    }
    
    public FormPacoteDeAula(PacoteDeAula pacoteEdit) {
        initComponents();
        this.pacoteEdit = pacoteEdit;
        
        tfNome.setText(pacoteEdit.getInfoPacote().getNome());
        taDescricao.setText(pacoteEdit.getInfoPacote().getDescricao());
        tfDurAula.setText(String.valueOf(pacoteEdit.getInfoPacote().getDuracaoAula()));
        tfDurPacote.setText(String.valueOf(pacoteEdit.getDuracaoPacote()));
        tfRecoSemanal.setText(String.valueOf(pacoteEdit.getRecorrenciaSemanal()));
        
        String valorEdit = pacoteEdit.getValor().substring(3);
        
        tfValor.setText(valorEdit);
        cbxTipo.setSelectedItem(pacoteEdit.getInfoPacote().getTipo());
        cbxPerfil.setSelectedItem(pacoteEdit.getInfoPacote().getPerfil());
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
        lbNome = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbPerfil = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        lbDuracaoAula = new javax.swing.JLabel();
        lbDuracaoPacote = new javax.swing.JLabel();
        lbRecoSemanal = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfDurAula = new javax.swing.JTextField();
        tfDurPacote = new javax.swing.JTextField();
        tfRecoSemanal = new javax.swing.JTextField();
        tfValor = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        cbxPerfil = new javax.swing.JComboBox<>();
        scrpnDescricao = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        btCancelar = new javax.swing.JButton();
        brConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Pacote de Aula");

        lbNome.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbNome.setForeground(new java.awt.Color(0, 0, 0));
        lbNome.setText("Nome");

        lbDescricao.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbDescricao.setForeground(new java.awt.Color(0, 0, 0));
        lbDescricao.setText("Descrição");
        lbDescricao.setToolTipText("");

        lbPerfil.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbPerfil.setForeground(new java.awt.Color(0, 0, 0));
        lbPerfil.setText("Perfil");

        lbTipo.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbTipo.setForeground(new java.awt.Color(0, 0, 0));
        lbTipo.setText("Tipo");

        lbDuracaoAula.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbDuracaoAula.setForeground(new java.awt.Color(0, 0, 0));
        lbDuracaoAula.setText("Duração da Aula");
        lbDuracaoAula.setToolTipText("Duração da Aula");

        lbDuracaoPacote.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbDuracaoPacote.setForeground(new java.awt.Color(0, 0, 0));
        lbDuracaoPacote.setText("Duração do Pacote");

        lbRecoSemanal.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbRecoSemanal.setForeground(new java.awt.Color(0, 0, 0));
        lbRecoSemanal.setText("Recorrência Semanal");
        lbRecoSemanal.setToolTipText("");

        lbValor.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbValor.setForeground(new java.awt.Color(0, 0, 0));
        lbValor.setText("Valor do Pacote");

        tfNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfDurAula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));

        tfDurPacote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));

        tfRecoSemanal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));

        tfValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presencial", "Remota" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        cbxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Grupo" }));
        cbxPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPerfilActionPerformed(evt);
            }
        });

        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        scrpnDescricao.setViewportView(taDescricao);

        btCancelar.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Botao_Cancelar.png")); // NOI18N
        btCancelar.setContentAreaFilled(false);
        btCancelar.setPressedIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Botao_Cancelar_Pressed.png")); // NOI18N
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        brConfirmar.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Botao_Confirmar.png")); // NOI18N
        brConfirmar.setBorderPainted(false);
        brConfirmar.setContentAreaFilled(false);
        brConfirmar.setPressedIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Botao_Confirmar_Pressed.png")); // NOI18N
        brConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFolhas1Layout = new javax.swing.GroupLayout(panelFolhas1);
        panelFolhas1.setLayout(panelFolhas1Layout);
        panelFolhas1Layout.setHorizontalGroup(
            panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFolhas1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFolhas1Layout.createSequentialGroup()
                        .addComponent(lbTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbDescricao)
                    .addComponent(scrpnDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFolhas1Layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome))
                    .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelFolhas1Layout.createSequentialGroup()
                            .addComponent(btCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(brConfirmar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFolhas1Layout.createSequentialGroup()
                            .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelFolhas1Layout.createSequentialGroup()
                                    .addComponent(lbDuracaoAula)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfDurAula))
                                .addGroup(panelFolhas1Layout.createSequentialGroup()
                                    .addComponent(lbRecoSemanal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfRecoSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFolhas1Layout.createSequentialGroup()
                                    .addComponent(lbDuracaoPacote)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfDurPacote, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelFolhas1Layout.createSequentialGroup()
                                    .addComponent(lbValor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfValor))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelFolhas1Layout.setVerticalGroup(
            panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFolhas1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrpnDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipo)
                    .addComponent(lbPerfil)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDurAula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbDuracaoAula)
                        .addComponent(lbDuracaoPacote)
                        .addComponent(tfDurPacote, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRecoSemanal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfRecoSemanal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfValor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(panelFolhas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brConfirmar)
                    .addComponent(btCancelar))
                .addGap(25, 25, 25))
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

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void cbxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPerfilActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void brConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brConfirmarActionPerformed
        mudarCor();
        if(camposVazios()){
            JOptionPane.showMessageDialog(null, """
                                                        Falta pouco para concluir o cadastro do Pacote de Aula
                                                
                                                Verifique se o Tipo e Perfil foram selecionados corretamte e se todos
                                                os campos obrigatórios estão preenchidos corretamente.
                                                
                                                    - Nome
                                                    - Duração da Aula
                                                    - Duração do Pacote
                                                    - Valor
                                                """);
        }else{
            if(validarCampos()){
                JOptionPane.showMessageDialog(null, """
                                                        Falta pouco para concluir o cadastro do Pacote de Aula
                                                
                                                    Verifique se o Tipo e Perfil foram selecionados corretamte e se os demais
                                                    campos foram preenchidos corretamente.

                                                        Nome, materia, descrição, - apenas letras ou números
                                                        Demais campos são apenas números:
                                                            - Duração da Aula - de 1 a 3 digítos
                                                            - Duração do Pacote - de 1 a 2 digítos
                                                            - Recforrência Semanal - de 1 a 2 digítos
                                                            - Valor do Pacote - de R$ 0,00 a R$ 99999,99 (decimais com virgula)
                                                    """);
                mudarCor();
            }else{
                PacoteDeAulaJPA pctJPA = new PacoteDeAulaJPA();
                
                if(pacoteEdit == null){//cadastro de um novo pacote
                    PacoteDeAula pct = new PacoteDeAula();
                    InfoPacote info = new InfoPacote();

                    info.setNome(tfNome.getText());
                    info.setDescricao(taDescricao.getText());
                    info.setDuracaoAula(Byte.parseByte(tfDurAula.getText()));
                    info.setTipo(String.valueOf(cbxTipo.getSelectedItem()).toLowerCase());
                    info.setPerfil(String.valueOf(cbxPerfil.getSelectedItem()).toLowerCase());
                    pct.setDuracaoPacote(Byte.parseByte(tfDurPacote.getText()));
                    pct.setInfoPacote(info);
                    pct.setRecorrenciaSemanal(Byte.parseByte(tfRecoSemanal.getText()));
                    pct.setValor("R$ "+tfValor.getText());
                    pct.setId_professor(GUI_Principal.getProfessor());

                    pctJPA.cadastrar(pct);
                }else{//edição de um pacote selecionado
                    
                    pacoteEdit.getInfoPacote().setNome(tfNome.getText());
                    pacoteEdit.getInfoPacote().setDescricao(taDescricao.getText());
                    pacoteEdit.getInfoPacote().setTipo(String.valueOf(cbxTipo.getSelectedItem()));
                    pacoteEdit.getInfoPacote().setPerfil(String.valueOf(cbxPerfil.getSelectedItem()));
                    pacoteEdit.getInfoPacote().setDuracaoAula(Byte.parseByte(tfDurAula.getText()));
                    pacoteEdit.setDuracaoPacote(Byte.parseByte(tfDurPacote.getText()));
                    pacoteEdit.setRecorrenciaSemanal(Byte.parseByte(tfRecoSemanal.getText()));
                    pacoteEdit.setValor("R$ "+tfValor.getText());
                    pacoteEdit.setId_professor(GUI_Principal.getProfessor());
                    
                    pctJPA.editar(pacoteEdit);
                }
                
                dispose();
                
                PanelProfessor.preencherPacotes();
            }
        }
    }//GEN-LAST:event_brConfirmarActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

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
            java.util.logging.Logger.getLogger(FormPacoteDeAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPacoteDeAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPacoteDeAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPacoteDeAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPacoteDeAula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brConfirmar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JComboBox<String> cbxPerfil;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbDuracaoAula;
    private javax.swing.JLabel lbDuracaoPacote;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPerfil;
    private javax.swing.JLabel lbRecoSemanal;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbValor;
    private com.minha_sala_de_aula.Fabrica.PanelDegradeAzul panelDegradeAzul1;
    private com.minha_sala_de_aula.Fabrica.PanelFolhas panelFolhas1;
    private javax.swing.JScrollPane scrpnDescricao;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTextField tfDurAula;
    private javax.swing.JTextField tfDurPacote;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRecoSemanal;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mudarVermelho(JTextField tf) {
        tf.setBorder(BorderFactory.createLineBorder(new Color(175, 0 , 0)));
    }

    @Override
    public void mudarPadrao(JTextField tf) {
        tf.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 153)));
    }

    @Override
    public void mudarCor() {
        if (!validarNome()){
            mudarVermelho(tfNome);
        }else{            
            mudarPadrao(tfNome);
        }
        
        
        if (!validarDurAula()){
            mudarVermelho(tfDurAula);
        }else{            
            mudarPadrao(tfDurAula);
        }
        
        
        if (!validarDurPacote()){
            mudarVermelho(tfDurPacote);
        }else{
            mudarPadrao(tfDurPacote);
        }
        
        if (!validarRecoSemanal()){
            mudarVermelho(tfRecoSemanal);
        }else{
            mudarPadrao(tfRecoSemanal);
        }
        
        if (!validarDescricao()){
            mudarVermelhoTA(taDescricao);
        }else{
            mudarPadraoTA(taDescricao);
        }
        
        if (!validarValor()){
            mudarVermelho(tfValor);
        }else{
            mudarPadrao(tfValor);
        }
    }

    @Override
    public boolean validarCampos() {
        return !validarNome() || !validarDurAula() || !validarDurPacote() || !validarRecoSemanal() || !validarDescricao() || !validarValor();
    }

    @Override
    public boolean camposVazios() {
        return tfNome.getText().isEmpty() || tfDurAula.getText().isEmpty() || tfDurPacote.getText().isEmpty() || tfValor.getText().isEmpty();
    }

    private boolean validarNome() {
        return tfNome.getText().matches("[\\w\\W\\s]+");
    }

    private boolean validarDurAula() {
        return tfDurAula.getText().matches("[0-9]{1,3}");
    }

    private boolean validarDurPacote() {
        return tfDurPacote.getText().matches("[\\d]{1,2}");
    }

    private boolean validarRecoSemanal() {
        return tfRecoSemanal.getText().matches("[\\d]{1,2}");
    }

    private boolean validarDescricao() {
        return taDescricao.getText().matches("[\\w\\W\\s]+");
    }

    private boolean validarValor() {
        return tfValor.getText().matches("[\\d]{1,5}[,][\\d]{2}");
    }

    private void mudarVermelhoTA(JTextArea ta) {
        ta.setBorder(BorderFactory.createLineBorder(new Color(175, 0 , 0)));
    }

    private void mudarPadraoTA(JTextArea ta) {
        ta.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 153)));
    }
}