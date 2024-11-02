/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.minha_sala_de_aula.GUI;

import com.minha_sala_de_aula.Fabrica.PanelAulasHorarios;

/**
 *
 * @author tomazaudio
 */
public class PanelCalendario extends javax.swing.JPanel {

    /*public static void atualizarSelecao(){
        for (Object comp: pnAulas.getComponents()){
            PanelAulasHorarios aula = (PanelAulasHorarios) comp;
            aula.getPanelDados().setSelecionado(false);
            aula.repaint();
        }
    }*/
    public PanelCalendario() {
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

        scrlPainel = new javax.swing.JScrollPane();
        pnAulas = new javax.swing.JPanel();
        separador = new javax.swing.JSeparator();
        lbHorarios = new javax.swing.JLabel();
        calendario1 = new com.minha_sala_de_aula.Calendario.Calendario();

        scrlPainel.setOpaque(false);

        pnAulas.setLayout(new java.awt.GridLayout(50, 1));
        scrlPainel.setViewportView(pnAulas);

        separador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbHorarios.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        lbHorarios.setForeground(new java.awt.Color(0, 0, 0));
        lbHorarios.setText("Quadro de Horários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calendario1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrlPainel)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(lbHorarios)
                        .addGap(201, 201, 201))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbHorarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrlPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(calendario1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.minha_sala_de_aula.Calendario.Calendario calendario1;
    private javax.swing.JLabel lbHorarios;
    private static javax.swing.JPanel pnAulas;
    private javax.swing.JScrollPane scrlPainel;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}