package com.minha_sala_de_aula.Calendario;

public class Hoje {
    
    private int dia;
    private int mes;
    private int ano;

    public Hoje(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDay() {
        return dia;
    }

    public void setDay(int day) {
        this.dia = day;
    }

    public int getMonth() {
        return mes;
    }

    public void setMonth(int month) {
        this.mes = month;
    }

    public int getYear() {
        return ano;
    }

    public void setYear(int year) {
        this.ano = year;
    }
    
    public boolean eHoje(Hoje date) {
        return dia == date.getDay() && mes == date.getMonth() && ano == date.getYear();
    }
    
}
