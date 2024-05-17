package com.politecnicomalaga.entidadbancaria;

import java.util.ArrayList;

public class Cuenta {
	//ATRIBUTOS
	private String ccc; //Código de la cuenta
	private float saldo;
	private String fechaApertura;
	private ArrayList<Operacion> operaciones;
	private Cliente clienteCuenta;
	
	//CONSTRUCTORES
	public Cuenta(String ccc, float saldo, String fechaApertura, Cliente clienteCuenta) {
		super();
		this.ccc = ccc;
		this.saldo = saldo < 0 ? 0 : saldo;
		this.fechaApertura = fechaApertura;
		this.operaciones = new ArrayList<>();
		this.clienteCuenta = clienteCuenta;
	}

	//GETTERS & SETTERS
	public String getCcc() {
		return ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo < 0 ? 0 : saldo;
	}

	public String getFechaApertura() {
		return fechaApertura;
	}


	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public ArrayList<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(ArrayList<Operacion> operaciones) {
		this.operaciones = operaciones;
	}

	public Cliente getClienteCuenta() {
		return clienteCuenta;
	}

	public void setClienteCuenta(Cliente clienteCuenta) {
		this.clienteCuenta = clienteCuenta;
	}

	//METODOS
	public boolean isActiva() {
		return saldo>0;
	}
	
	public boolean retirarEfectivo(float cantidad, String fecha) {
		if (cantidad <= 0) return false;
		if (cantidad <= saldo) {
			saldo -= cantidad;

			operaciones.add(new Operacion(generarNuevoCodigo(), fecha, -cantidad));

			return true;
		}
		return false;
	}

	public boolean ingresarEfectivo(float cantidad, String fecha) {
		if (cantidad <= 0) return false;
		saldo += cantidad;

		operaciones.add(new Operacion(generarNuevoCodigo(), fecha, cantidad));

		return true;
	}

	public long generarNuevoCodigo() {
		long newCode = Math.round(Math.random() * 1000000);

		for (Operacion i:operaciones) {
			if (newCode == i.getCodigo()) {
				newCode = generarNuevoCodigo();
			}
		}

		return newCode;
	}

}
