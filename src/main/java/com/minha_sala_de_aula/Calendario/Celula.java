package com.minha_sala_de_aula.Calendario;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Celula extends JButton {
    private Date data;
    boolean eHoje;
    private boolean temAula;
    private boolean selecionado = false;
    
    public void setSelecionado(boolean selecionado){
        this.selecionado = selecionado;
    }
    
    public Celula() {
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);
        setBorder(new LineBorder(new Color(0, 0, 0, 0), 4, true));
        
        this.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                setBorder(new LineBorder(new Color(188, 172, 29), 2, true));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
            }
            
        });
        
    }
    
    public void setData(Date data){
        this.data = data;
    }
    
    public boolean getTemAula(){
        return temAula;
    }
    
    public void setTemAula(boolean temAula){
        this.temAula = temAula;
    }
    
    public void mesAtual(boolean act) {
        if (act) {
            setForeground(new Color(0, 0, 0)); 
        } else {
            setForeground(new Color(115, 110, 110)); 
        }
    }
    
    public void setComoHoje(){
        eHoje = true;
        setForeground(Color.WHITE);
    }
    
    public boolean validarData(){
        return getText().matches("[0-9]{1,2}");
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        
        if (eHoje) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(188, 172, 29)); //BCAC1D
            g2.fillRoundRect(4, 4, getWidth()-8, getHeight()-8, 8, 8);
        }
        if(temAula){
            if(eHoje){
                grphcs.setColor(new Color(255, 255, 55)); //FFFFFF
                grphcs.fillOval(getWidth()/2 - 2, 8, 4, 4);
            }else{
                grphcs.setColor(new Color(238, 12, 12)); //EE0C0C
                grphcs.fillOval(getWidth()/2 - 2, 8, 4, 4);
            }
        }
        if(selecionado){
            grphcs.setColor(Color.yellow);
            grphcs.fillRect(0, 0, getWidth(), getHeight());
        }
        super.paintComponent(grphcs);
    }

}
