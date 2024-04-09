import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jugador=0, android=0, empate=0;
        boolean continuar=true, jugar;
        String opcion;

        while (continuar) {
            System.out.println("PROGRAMACION ALGORITMICA");
            System.out.println("a)Realizar juego\nb)Estadisticas\ncualquier otra tecla)Salir");
            opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("a")) {
                jugar = true;
                while (jugar) {
                    System.out.println("Turno jugador\nComprobar fichas");
                    System.out.println("¿Existen dos fichas alineadas?");
                    opcion = sc.nextLine();

                    //¿DOS FICHAS ALINEADAS?
                    if (opcion.equalsIgnoreCase("j")) { //DEL JUGADOR
                        System.out.println("Pongo en el tercer hueco para evitar perder");
                        System.out.println("¿Ha ganado el jugador?");
                        opcion = sc.nextLine();

                        //¿HA GANADO EL JUGADOR?
                        if (opcion.equalsIgnoreCase("s")) { //HA GANADO EL JUGADOR
                            System.out.println("Gana jugador\n");
                            jugador++;
                            jugar = false;
                        } else { //NO HA GANADO EL JUGADOR
                            System.out.println("¿Esta todo el tablero ocupado?");
                            opcion = sc.nextLine();

                            //¿ESTA EL TABLERO OCUPADO ENTERO?
                            if (opcion.equalsIgnoreCase("s")) { //EL TABLERO ESTA OCUPADO ENTERO
                                System.out.println("Empate\n");
                                empate++;
                                jugar = false;
                            }
                        }
                    } else if (opcion.equalsIgnoreCase("a")) { //DE ANDROID
                        System.out.println("Pongo en el tercer hueco para ganar");
                        System.out.println("Gana android\n");
                        android++;
                        jugar = false;
                    } else { //NO HAY DOS FICHAS ALINEADAS
                        System.out.println("Pongo en un espacio vacio");
                        System.out.println("¿Esta todo el tablero ocupado?");
                        opcion = sc.nextLine();

                        //¿ESTA EL TABLERO OCUPADO ENTERO?
                        if (opcion.equalsIgnoreCase("s")) { //SI ESTA ENTERO OCUPADO
                            System.out.println("Empate\n");
                            empate++;
                            jugar = false;
                        }
                    }
                }
            } else if (opcion.equalsIgnoreCase("b")) {
                System.out.printf("Jugador: %d\nAndroid: %d\nEmpates: %d\n\n", jugador, android, empate);
            } else {
                System.out.println("Finalizando el programa...");
                continuar = false;
            }
        }
    }
}