package com.politecnicomalaga.entidadbancaria;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	private String ccc;
	private float saldo;
	private String fechaApertura;
	private Cliente miCliente;
	private List<Operacion> miOperacion;
	
	
	public Cuenta(String ccc, float saldo, String fechaApertura) {
		super();
		this.ccc = ccc;
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
		this.miOperacion = new ArrayList<>();
		this.miCliente = null;
	}

	public String getCcc() {
		return ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	public float getSaldo() {
		return saldo;
	}

	public List<Operacion> getMiOperacion() {
		return miOperacion;
	}

	public void setMiOperacion(List<Operacion> miOperacion) {
		this.miOperacion = miOperacion;
	}

	public Cliente getMiCliente() {
		return miCliente;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void setMiCliente(Cliente miCliente) {
		this.miCliente = miCliente;
	}


	public String getFechaApertura() {
		return fechaApertura;
	}


	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	
	public boolean isActiva() {
		return saldo>0;
	}
	
	public boolean retirarEfectivo(float cantidad, String fecha) {
		if (cantidad <= 0) return false;
		if (cantidad <= saldo) {
			saldo -= cantidad;
			Operacion op = new Operacion(fecha, -cantidad);
			miOperacion.add(op);
			return true;
		}
		return false;
	}

	public boolean ingresarEfectivo(float cantidad, String fecha) {
		if (cantidad <= 0) return false;
		saldo += cantidad;
		Operacion op = new Operacion(fecha, cantidad);
		miOperacion.add(op);
		return true;
	}

	@Override
	public String toString() {
		return "Cuenta{" +
				"ccc='" + ccc + "';" +
				"saldo=" + saldo + ";" +
				"fechaApertura='" + fechaApertura + "';\n" +
				"miCliente=" + miCliente + ";\n" +
				"miOperacion=" + miOperacion + ";\n";
	}
}
