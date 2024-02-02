package com.politecnicomalaga.hotel.model;

public class Cliente {
    //ATRIBUTOS
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String email;
    protected String telefono;
    protected float modificadorPrecio;

    //CONSTRUCTORES
    public Cliente() {
        this.modificadorPrecio = 1;
    }

    public Cliente(String nombre, String apellidos, String dni, String email, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.modificadorPrecio = 1;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getModificadorPrecio() {
        return modificadorPrecio;
    }

    public void setModificadorPrecio(float modificadorPrecio) {
        this.modificadorPrecio = modificadorPrecio;
    }

    //METODOS

}
