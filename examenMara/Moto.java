
public class Moto extends Vehiculo {
	
	//Atributos

	private int precioHora;

	//Constructor
	public Moto(String matricula, String modelo, String nombre, String apellidos, String dni, String fechaEntrada,
			String horaEntrada) {
		super(matricula, modelo, nombre, apellidos, dni, fechaEntrada, horaEntrada);
		this.precioHora = 20;
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
