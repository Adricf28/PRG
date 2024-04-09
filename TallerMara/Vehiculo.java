import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {

	//Atributos
	
	protected String matricula, modelo, nombre, apellidos, dni, fechaEntrada, horaEntrada;
	
	protected List<TrabajoTaller> listaReparaciones;

	//Constructor
	public Vehiculo(String matricula, String modelo, String nombre, String apellidos, String dni, String fechaEntrada,
			String horaEntrada) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaEntrada = fechaEntrada;
		this.horaEntrada = horaEntrada;
		this.listaReparaciones = new ArrayList<>();
	}
	
	//getters y setters

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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
	
	//Resto de métodos 
	public abstract float calcularCobro(float horasReales);
	
	//CRUD de trabajos
	
	//Añadir un trabajo
	
	public boolean addReparacion(TrabajoTaller tt) {
		
		if(tt != null && buscarReparacion(tt.getCodigo())==null) {
			listaReparaciones.add(tt);
			return true;
		}
		
		return false;
		
	}
	
	//Buscar un trabajo
	
	public TrabajoTaller buscarReparacion(String codigo) {
		for(TrabajoTaller tt: listaReparaciones) {
			if(tt.getCodigo().equals(codigo)) {
				return tt;
			}
		}
		return null;
	}
	
	//Finalizar reparacion
	
	//Se realiza junto al cobro?? sí
	
}
