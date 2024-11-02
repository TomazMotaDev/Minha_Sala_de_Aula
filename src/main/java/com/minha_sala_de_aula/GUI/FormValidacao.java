package com.minha_sala_de_aula.GUI;

import javax.swing.JTextField;

public interface FormValidacao {
    public void mudarVermelho(JTextField tf);
    public void mudarPadrao(JTextField tf);
    public void mudarCor();
    public boolean validarCampos();
    public boolean camposVazios();
}
