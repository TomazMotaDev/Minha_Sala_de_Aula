package com.minha_sala_de_aula.Fabrica;

import java.awt.Color;

public class CorModelo {
    
    private Color cor;
    private float posicao;
    
    public CorModelo(Color color, float position) {
        this.cor = color;
        this.posicao = position;
    }

    public CorModelo() {
    }
    
    public Color getColor() {
        return cor;
    }

    public void setColor(Color color) {
        this.cor = color;
    }

    public float getPosition() {
        return posicao;
    }

    public void setPosition(float position) {
        this.posicao = position;
    }

}
