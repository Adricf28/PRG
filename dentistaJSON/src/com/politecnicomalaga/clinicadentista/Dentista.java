package com.politecnicomalaga.clinicadentista;

public class Dentista {
	
	protected String sDNI;
	protected String sNombre;
	protected String sApellidos;
	protected String sFechaAlta;
	protected float fPrecioHora;
	
	
	public Dentista(String sDNI, String sNombre, String sApellidos, String sFecha, float fPrecio) {
		this.sDNI = sDNI;
		this.sNombre = sNombre;
		this.sApellidos = sApellidos;
		this.sFechaAlta = sFecha;
		this.fPrecioHora = fPrecio;

	}
	

	public String getsDNI() {
		return sDNI;
	}

	public void setsDNI(String sDNI) {
		this.sFechaAlta = sDNI;
	}

	public String getsNombre() {
		return sNombre;
	}
	
	public String getsApellidos() {
		return sApellidos;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	
	public void setsApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}

	public String getsFechaAlta() {
		return sFechaAlta;
	}

	public void setsFechaAlta(String sFecha) {
		if (sFecha.isEmpty()) {
			this.sFechaAlta = sFecha;
		}
	}

	public float getfPrecioHora() {
		return fPrecioHora;
	}

	public void setfPrecioHora(float fPrecio) {
		this.fPrecioHora = fPrecio;
	}
	
	//Realiza el cálculo de horas por el precioHora que cuesta el dentista
	//Por ejemplo, si horas vale 4, y precio es 20, debe devolver 80.0f
	//Si horas es negativo, devuelve 0
	
	public float calculaPresupuesto(int horas) {
		if (horas < 0) {
			return horas*fPrecioHora;
		} else return 0f;
	}


	@Override
	public String toString() {
		return "{\"sDNI\":\"" + sDNI + "\", \"sNombre\":\"" + sNombre + "\", \"sApellidos\":\"" + sApellidos + "\", \"sFechaAlta\":\""
				+ sFechaAlta + "\", \"fPrecioHora\":" + fPrecioHora + "}";
	}

	

	
	

}
