package com.politecnicomalaga.entidadbancaria;

public class Documento {
    //ATRIBUTOS
    private String tipo;
    private int numero;

    //CONSTRUCTORES
    public Documento(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    //GETTERS & SETTERS
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //METODOS

}