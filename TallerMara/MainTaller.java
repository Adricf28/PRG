import java.util.Scanner;

public class MainTaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taller t = new Taller();
		
		Scanner sc = new Scanner(System.in);
		
		String resp;
		
		boolean salirMenu = false;
		
		do {
			
			System.out.println("------------ MENU ------------");
			System.out.println("Elije una opción:");
			System.out.println("1) Dar de alta a un vehiculo");
			System.out.println("2) Dar de alta a un cliente");
			System.out.println("3) Mostrar vehiculos");
			System.out.println("4) Asignar reparacion");
			System.out.println("5) Realizar cobro");
			System.out.println("Otra tecla para salir...");
			
			resp = sc.nextLine();
			
			if(resp.compareTo("1")==0) {
				
				if(addVehiculo(t)) {
					System.out.println("Vehiculo añadido correctamente");
				}else {
					System.out.println("Error al añadir vehículo");
				}
				
			}else if(resp.compareTo("2")==0) {
				
				if(addCliente(t)) {
					System.out.println("Cliente añadido correctamente");
				}else {
					System.out.println("Error al añadir cliente");
				}
				
			}else if(resp.compareTo("3")==0) {
				
				menuListarVehiculos(t);
				
			}else if(resp.compareTo("4")==0) {
				
				if(addReparacion(t)) {
					System.out.println("Operación completada");
				}else {
					System.out.println("Error en la operación");
				}
				
			}else if(resp.compareTo("5")==0) {
				
				realizarCobro(t);
				
			}else {
				salirMenu = true;
			}
			
			
		}while(!salirMenu);

	}
	
	//Dar de alta a un vehículo
	
	private static boolean addVehiculo(Taller t) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Tipo de vehículo que quiere dar de alta:");
		System.out.println("1. Coche");
		System.out.println("2. Moto");
		System.out.println("3. Furgoneta");
		System.out.println("4. Camión");
		
		String tipoV = sc.nextLine();
		
		System.out.println("\n Introduzca los datos del vehículo:");
		System.out.println("Matrícula");
		String matricula = sc.nextLine();
		System.out.println("Modelo");
		String modelo = sc.nextLine();
		System.out.println("Nombre del dueño");
		String nombre = sc.nextLine();
		System.out.println("Apellidos del dueño");
		String apellidos = sc.nextLine();
		System.out.println("DNI del dueño");
		String dni = sc.nextLine();
		System.out.println("Fecha de entrada");
		String fechaEntrada = sc.nextLine();
		System.out.println("Hora de entrada");
		String horaEntrada = sc.nextLine();
		
		if(tipoV.compareTo("1")==0) {
			return t.addVehiculo(new Coche(matricula, modelo, nombre, apellidos, dni, fechaEntrada, horaEntrada));
		}else if(tipoV.compareTo("2")==0) {
			return t.addVehiculo(new Moto(matricula, modelo, nombre, apellidos, dni, fechaEntrada, horaEntrada));
		}else if(tipoV.compareTo("3")==0) {
			return t.addVehiculo(new Furgon(matricula, modelo, nombre, apellidos, dni, fechaEntrada, horaEntrada));
		}else if(tipoV.compareTo("4")==0) {
			return t.addVehiculo(new Camion(matricula, modelo, nombre, apellidos, dni, fechaEntrada, horaEntrada));
		}else {
			System.out.println("Elije un tipo de vehiculo disponible, por favor");
			return false;
		}
		
	}
	
	//Dar de alta a un cliente
	
	private static boolean addCliente(Taller t) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\n Introduzca los datos del cliente:");
		System.out.println("Nombre");
		String nombre = sc.nextLine();
		System.out.println("Apellidos");
		String apellidos = sc.nextLine();
		System.out.println("Teléfono");
		String tfno = sc.nextLine();
		System.out.println("DNI");
		String dni = sc.nextLine();
		
		return t.addCliente(new Cliente(nombre, apellidos, tfno, dni));
	}
	
	//Mostrar los vehículos registrados
	
	private static void menuListarVehiculos(Taller t) {
		Scanner sc= new Scanner(System.in);
		String opcion;
		
		System.out.println("Tipo de vehículo a buscar:");
		System.out.println("1. Coche");
		System.out.println("2. Moto");
		System.out.println("3. Furgoneta");
		System.out.println("4. Camión");
		
		opcion = sc.nextLine();
		
		if(opcion.compareTo("1")==0) {
			listarCoches(t);
		}else if (opcion.compareTo("2")== 0){
			listarMotos(t);
		}else if(opcion.compareTo("3")==0) {
			listarFurgones(t);
		}else if(opcion.compareTo("4")==0) {
			listarCamiones(t);
		}else {
			System.out.println("Elije una opción disponible, por favor");
		}
	}
	
	private static void listarCoches(Taller t) {
		Coche[] lista = t.listarCoches();
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println("---------------------" +
					  "\n Matrícula: " + lista[i].getMatricula() + 
					  "\n Modelo: " + lista[i].getModelo() + 
					  "\n Nombre del dueño: " + lista[i].getNombre() + 
					  "\n Apellidos del dueño: " + lista[i].getApellidos() + 
					  "\n DNI del dueño: " + lista[i].getDni() + 
					  "\n Fecha de entrada: " + lista[i].getFechaEntrada() + 
					  "\n Hora de entrada: " + lista[i].getHoraEntrada());
		}
	}
	
	private static void listarMotos(Taller t) {
		Moto[] lista = t.listarMotos();
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println("---------------------" +
					  "\n Matrícula: " + lista[i].getMatricula() + 
					  "\n Modelo: " + lista[i].getModelo() + 
					  "\n Nombre del dueño: " + lista[i].getNombre() + 
					  "\n Apellidos del dueño: " + lista[i].getApellidos() + 
					  "\n DNI del dueño: " + lista[i].getDni() + 
					  "\n Fecha de entrada: " + lista[i].getFechaEntrada() + 
					  "\n Hora de entrada: " + lista[i].getHoraEntrada());
		}
	}
	
	private static void listarFurgones(Taller t) {
		Furgon[] lista = t.listarFurgones();
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println("---------------------" +
					  "\n Matrícula: " + lista[i].getMatricula() + 
					  "\n Modelo: " + lista[i].getModelo() + 
					  "\n Nombre del dueño: " + lista[i].getNombre() + 
					  "\n Apellidos del dueño: " + lista[i].getApellidos() + 
					  "\n DNI del dueño: " + lista[i].getDni() + 
					  "\n Fecha de entrada: " + lista[i].getFechaEntrada() + 
					  "\n Hora de entrada: " + lista[i].getHoraEntrada());
		}
	}
	
	private static void listarCamiones(Taller t) {
		Camion[] lista = t.listarCamiones();
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println("---------------------" +
					  "\n Matrícula: " + lista[i].getMatricula() + 
					  "\n Modelo: " + lista[i].getModelo() + 
					  "\n Nombre del dueño: " + lista[i].getNombre() + 
					  "\n Apellidos del dueño: " + lista[i].getApellidos() + 
					  "\n DNI del dueño: " + lista[i].getDni() + 
					  "\n Fecha de entrada: " + lista[i].getFechaEntrada() + 
					  "\n Hora de entrada: " + lista[i].getHoraEntrada());
		}
	}
	
	//Asignar una reparacion a un vehiculo
	
	private static boolean addReparacion(Taller t) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\n Introduzca los siguientes datos:");
		System.out.println("Descripción del problema");
		String descripcion = sc.nextLine();
		System.out.println("Solución al problema");
		String solucion = sc.nextLine();
		System.out.println("Fecha de entrega");
		String fechaEntrega = sc.nextLine();
		System.out.println("Hora de entrega");
		String horaEntrega = sc.nextLine();
		System.out.println("Horas previstas");
		int horasPrevistas = Integer.valueOf(sc.nextLine());
		System.out.println("Matrícula del vehiculo");
		String matricula = sc.nextLine();
		
		return t.addReparacion(matricula, new TrabajoTaller(descripcion, solucion, fechaEntrega, horaEntrega, horasPrevistas));		
		
	}
	
	//Realizar cobro de un vehículo
	
	private static void realizarCobro(Taller t) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Introduzca los siguientes datos:");
		System.out.println("Matrícula del vehículo");
		String matricula = sc.nextLine();
		System.out.println("Horas reales");
		float horas = Float.valueOf(sc.nextLine());
		
		float precio = t.realizarCobro(matricula, horas);
		
		if(precio == 0) {
			System.out.println("Compruebe que tenga reparaciones asignadas. El precio es 0€");
		}else {
			System.out.println("El precio es: " + precio);
		}
		
	}

}
