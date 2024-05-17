package com.politecnicomalaga.entidadbancaria;

public class Cliente {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private String mail;
    private Documento doc;

    //CONSTRUCTORES
    public Cliente(String nombre, String apellidos, String mail, Documento doc) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mail = mail;
        this.doc = doc;
    }

    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }

    //METODOS

}
