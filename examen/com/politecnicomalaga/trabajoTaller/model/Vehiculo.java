package com.politecnicomalaga.trabajoTaller.model;

import java.util.LinkedList;
import java.util.List;

public class Vehiculo {
    //ATRIBUTOS
    protected String matricula;
    protected String dni; //DNI dueño
    protected String modelo;
    protected String nombre;
    protected String apellidos;
    protected String fechaEntrada;
    protected int horaEntrada;
    protected List<TrabajoTaller> misReparaciones;

    //Estructura de almacenamiento de los trabajos a realizar/realizados


    //CONSTRUCTOR
    public Vehiculo(String matricula, String dni, String modelo, String nombre, String apellidos, String fechaEntrada, int horaEntrada) {
        this.matricula = matricula;
        this.dni = dni;
        this.modelo = modelo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.misReparaciones = new LinkedList<>();
    }

    //GETTERS & SETTERS
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    //CRUD Reparaciones

    //Crear reparacion
    public boolean altaTrabajoTaller(TrabajoTaller tt) {
        if (estaReparacion(tt.getFechaEntrada(), tt.getHoraEntrada())) {
            return false;
        }
        misReparaciones.add(tt);
        return true;
    }

    //Buscar reparacion
    public boolean estaReparacion(String fechaEntrada, int horaEntrada) {
        for (TrabajoTaller untt:misReparaciones) {
            if (untt.getFechaEntrada().equals(fechaEntrada) && untt.getHoraEntrada()==horaEntrada) {
                return true;
            }
        }
        return false;
    }
}
