
public class Cliente {

	//Atributos
	private String nombre, apellidos, tfno, dni;

	//Constructor
	public Cliente(String nombre, String apellidos, String tfno, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tfno = tfno;
		this.dni = dni;
	}
	
	//getters y setters

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

	public String getTfno() {
		return tfno;
	}

	public void setTfno(String tfno) {
		this.tfno = tfno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
		
}
