package com.politecnicomalaga.trabajoTaller.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EmpresaTaller {
    //ATRIBUTOS
    protected String nombre;
    protected String direccion;
    protected String email;
    protected String telefono;

    //Estructura para almacenar los vehiculos
    protected Map<String, Vehiculo> misV;

    //CONSTRUCTOR
    public EmpresaTaller(String nombre, String direccion, String email, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.misV = new HashMap<String, Vehiculo>();
    }

    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Map<String, Vehiculo> getMisV() {
        return misV;
    }

    public void setMisV(Map<String, Vehiculo> misV) {
        this.misV = misV;
    }

    //CRUD Vehiculo

    //Dar de alta vehiculo
    public boolean altaVehiculo(Vehiculo v) {
        if(misV.containsKey(v.getMatricula())) {
            return false;
        }
        misV.put(v.getMatricula(), v);
        return true;
    }

    //Buscar un vehiculo
    public boolean estaVehiculo(Vehiculo v) {
        if(misV.containsKey(v.getMatricula())) {
            return true;
        }
        return false;
    }

    //Buscar y devolver un vehiculo
    public Vehiculo buscarVehiculo(String matricula) {
        return misV.get(matricula);
    }

    //Listar todos los vehiculos
    public Vehiculo[] listarTodosVehiculos() {
        return misV.values().toArray(new Vehiculo[0]);
    }

    //Buscar muchos vehiculos dado un atributo
    public List<Vehiculo> buscarVehiculos(String dni) {
        LinkedList<Vehiculo> resultado = new LinkedList<>();

        for (Vehiculo v:misV.values()) {
            if (v.getDni().equals(dni)) {
                resultado.add(v);
            }
        }

        return resultado;
    }
}
