import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Taller {
	
	//Atributos
	
	//Composición
	
	Map<String, Cliente> mapaClientes;
	List<Vehiculo> listaVehiculos;
	
	//Constructor
	public Taller() {
		
		mapaClientes = new HashMap<>();
		listaVehiculos = new ArrayList<>();
	}
	
	//CRUD de clientes
	
	//Añadir cliente
	
	public boolean addCliente(Cliente c) {
		
		if(!mapaClientes.containsValue(c)) {
			mapaClientes.put(c.getDni(), c);
			return true;
		}
		
		return false;
	}
	
	//Buscar un cliente a partir del dni
	
	public Cliente buscarCliente(String dni) {
		
		return mapaClientes.get(dni);
		
	}
	
	//Listar todos los clientes
	
	public Cliente[] listarClientes() {
		
		return mapaClientes.values().toArray(new Cliente[0]);
		
	}
	
	//Eliminar cliente???
	
	//CRUD de Vehiculo
	
	//Añadir vehiculos
	
	public boolean addVehiculo(Vehiculo v) {
		if(v != null && buscarVehiculoMatricula(v.getMatricula())==null) {
			if(v instanceof Coche) {
				listaVehiculos.add((Coche) v);
				return true;
			}else if(v instanceof Moto) {
				listaVehiculos.add((Moto) v);
				return true;
			}else if (v instanceof Furgon) {
				listaVehiculos.add((Furgon) v);
				return true;
			}else {
				listaVehiculos.add((Camion) v);
				return true;
			}
		}
		return false;
	}
	
	//Buscar vehiculo por la matricula
	
	public Vehiculo buscarVehiculoMatricula(String matricula) {
		
		for(Vehiculo v:listaVehiculos) {
			if(v.getMatricula().equals(matricula)) {
				return v;
			}
		}
		return null;
	}
	
	//Buscar todos los coches
	
	public Coche[] listarCoches() {
		
		ArrayList<Coche> listaCoches = new ArrayList<>();
		
		for(Vehiculo v: listaVehiculos) {
			if(v instanceof Coche) {
				listaCoches.add((Coche) v);
			}
		}
		
		return listaCoches.toArray(new Coche[listaCoches.size()]);
	}
	
	//Buscar todos los furgones
	
	public Furgon[] listarFurgones() {
		
		ArrayList<Furgon> listaFurgones = new ArrayList<>();
		
		for(Vehiculo v: listaVehiculos) {
			if(v instanceof Furgon) {
				listaFurgones.add((Furgon) v);
			}
		}
		
		return listaFurgones.toArray(new Furgon[listaFurgones.size()]);
	}
			
	//Buscar todas las motos
	
	public Moto[] listarMotos() {
		
		ArrayList<Moto> listaMotos = new ArrayList<>();
		
		for(Vehiculo v: listaVehiculos) {
			if(v instanceof Moto) {
				listaMotos.add((Moto) v);
			}
		}
		
		return listaMotos.toArray(new Moto[listaMotos.size()]);
	}
			
	//Buscar todos los camiones
	
	public Camion[] listarCamiones() {
		
		ArrayList<Camion> listaCamiones = new ArrayList<>();
		
		for(Vehiculo v: listaVehiculos) {
			if(v instanceof Camion) {
				listaCamiones.add((Camion) v);
			}
		}
		
		return listaCamiones.toArray(new Camion[listaCamiones.size()]);
	}
	
	//Realizar cobro a un vehiculo con x matricula
	
	public float realizarCobro(String matricula, float horasReales) {
		return buscarVehiculoMatricula(matricula).calcularCobro(horasReales);
	}
	
	//Asignar una reparación a un vehiculo
	
	public boolean addReparacion(String matricula, TrabajoTaller tt) {
		
		return buscarVehiculoMatricula(matricula).addReparacion(tt);
		
	}
	

}
