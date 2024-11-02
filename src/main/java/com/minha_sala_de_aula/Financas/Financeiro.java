package com.minha_sala_de_aula.Financas;

import com.minha_sala_de_aula.Turmas.Turma;
import java.util.List;

public class Financeiro {
    //ATRIBUTOS
    private List<Turma> turmas;
    private double metaFinanceira;
    
    //GETTERS AND SETTERS
    public List<Turma> getTurmas() {
        return turmas;
    }

    public void addTurmas(Turma turma) {
        this.turmas.add(turma);
    }

    public double getMetaFinanceira() {
        return metaFinanceira;
    }

    public void setMetaFinanceira(double metaFinanceira) {
        this.metaFinanceira = metaFinanceira;
    }
        
}
