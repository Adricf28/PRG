
public class TrabajoTaller {

	//Atributos
	private String codigo;
	private String descripcion, solucion, fechaEntrada, horaEntrada;
	private float horasPrevistas, horasReales;
	private boolean terminado, cobrado;
	
	//Constructor
	public TrabajoTaller(String descripcion, String solucion, String fechaEntrada, String horaEntrada, float horasPrevistas) {
		this.descripcion = descripcion;
		this.solucion = solucion;
		this.fechaEntrada = fechaEntrada;
		this.horaEntrada = horaEntrada;
		this.horasPrevistas = horasPrevistas;
		this.horasReales = 0;
		this.terminado = false;
		this.cobrado = false;
		this.codigo = fechaEntrada + "_" + horaEntrada;
	}
	
	//getters y setters

	public String getDescripcion() {
		return descripcion;
	}

	public boolean isTerminado() {
		return terminado;
	}

	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public float getHorasPrevistas() {
		return horasPrevistas;
	}

	public void setHorasPrevistas(float horasPrevistas) {
		this.horasPrevistas = horasPrevistas;
	}

	public float getHorasReales() {
		return horasReales;
	}

	public void setHorasReales(float horasReales) {
		this.horasReales = horasReales;
	}

	public boolean isCobrado() {
		return cobrado;
	}

	public void setCobrado(boolean cobrado) {
		this.cobrado = cobrado;
	}
		
}