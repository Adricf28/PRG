
public class Camion extends Vehiculo {

	//Atributos
	
	private int precioHora, precioFijo;

	//Constructor
	public Camion(String matricula, String modelo, String nombre, String apellidos, String dni, String fechaEntrada,
			String horaEntrada) {
		super(matricula, modelo, nombre, apellidos, dni, fechaEntrada, horaEntrada);
		this.precioHora = 40;
		this.precioFijo = 50;
	}

	//Resto de métodos
	
	@Override
	public float calcularCobro(float horasReales) {
		if(!listaReparaciones.isEmpty()) {
			TrabajoTaller tt = listaReparaciones.get(listaReparaciones.size()-1);
			
			tt.setHorasReales(horasReales);
			tt.setTerminado(true);
			
			return listaReparaciones.get(listaReparaciones.size()-1).getHorasReales() * precioHora;
		}
		return 0;
	}
}
