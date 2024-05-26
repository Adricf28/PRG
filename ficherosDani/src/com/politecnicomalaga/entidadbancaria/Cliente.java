package com.politecnicomalaga.entidadbancaria;

public class Cliente {

    private String nombre;
    private String apellidos;
    private String mail;
    private Documento miDocumento;

    public Cliente(String nombre, String apellidos, String mail) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mail = mail;
        this.miDocumento = null;
    }

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

    public Documento getMiDocumento() {
        return miDocumento;
    }

    public void setMiDocumento(Documento miDocumento) {
        this.miDocumento = miDocumento;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + "';" +
                "apellidos='" + apellidos + "';" +
                "mail='" + mail + "';" +
                "miDocumento=" + miDocumento + ";\n";
    }
}
