import java.util.Scanner;

public class Semaforo2 {
    static int verde=0, amarillo=0, rojo=0, negro=0;
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Teclee a/b/c segun las siguientes opciones:\na) Realizar triaje\nb) Mostrar estadisticas\nPara salir, presione 'c' o cualquier otra tecla.");
            System.out.print("Seleccion: ");
            opcion = sc.nextLine();
            //REALIZAR TRIAJE
            if (opcion.compareToIgnoreCase("a") == 0) {
                triaje();
            }
            //MOSTRAR ESTADISTICAS
            else if (opcion.compareToIgnoreCase("b") == 0) {
                estadisticas();
            }
            //SALIR
            else {
                continuar = false;
            }
        }

        System.out.println("Finalizando el programa...");
    }

    public static void triaje() {
        String respuesta;

        System.out.println("Responda a las siguientes preguntas con SI/NO (cualquier cosa distinta a SI se considerara NO).");
        System.out.println("¿Puede el paciente caminar?");
        respuesta = sc.nextLine();
        //¿PUEDE CAMINAR?
        if (respuesta.compareToIgnoreCase("si") == 0) { //PUEDE CAMINAR
            verde++;
            System.out.println("Triaje VERDE, prioridad baja. Tiempo de espera: entre 60 minutos y 2 horas.\n");
        }
        else { //NO PUEDE CAMINAR
            System.out.println("¿Puede el paciente respirar?");
            respuesta = sc.nextLine();
            //¿PUEDE RESPIRAR?
            if (respuesta.compareToIgnoreCase("si") == 0) { //PUEDE RESPIRAR
                System.out.println("¿Es su frecuencia respiratoria mayor a 30 veces por minuto?");
                respuesta = sc.nextLine();
                //¿FR MAYOR A 30?
                if (respuesta.compareToIgnoreCase("si") == 0) { //FR MAYOR A 30
                    rojo++;
                    System.out.println("Triaje ROJO, prioridad alta. Tiempo de espera: le atenderemos inmediatamente.\n");
                }
                else { //FR MENOR A 30
                    System.out.println("¿Tiene pulso radial?");
                    respuesta = sc.nextLine();
                    //¿PULSO RADIAL?
                    if (respuesta.compareToIgnoreCase("si") == 0) { //PULSO RADIAL
                        System.out.println("¿Esta su pulso orientado?");
                        respuesta = sc.nextLine();
                        //¿PULSO ORIENTADO?
                        if (respuesta.compareToIgnoreCase("si") == 0) { //PULSO ORIENTADO
                            amarillo++;
                            System.out.println("Triaje AMARILLO, prioridad media. Tiempo de espera: entre 10 y 60 minutos.\n");
                        }
                        else { //PULSO NO ORIENTADO
                            rojo++;
                            System.out.println("Triaje ROJO, prioridad alta. Tiempo de espera: le atenderemos inmediatamente.\n");
                        }
                    }
                    else { //PULSO NO RADIAL
                        rojo++;
                        System.out.println("Controle la hemorragia mientras llega el medico.\nTriaje ROJO, prioridad alta. Tiempo de espera: le atenderemos inmediatamente.\n");
                    }
                }
            }
            else { //NO PUEDE RESPIRAR
                System.out.println("¿Respira si hace maniobras de reposicion?");
                respuesta = sc.nextLine();
                //¿AL REPOSICIONAR RESPIRA?
                if (respuesta.compareToIgnoreCase("si") == 0) { //AL REPOSICIONAR RESPIRA
                    rojo++;
                    System.out.println("Triaje ROJO, prioridad alta. Tiempo de espera: le atenderemos inmediatamente.\n");
                }
                else { //AL REPOSICIONAR NO RESPIRA
                    negro++;
                    System.out.println("Triaje NEGRO, prioridad nula. Tiempo de espera: indefinido.\n");
                }
            }
        }
    }

    public static void estadisticas() {
        System.out.println("La siguiente tabla muestra la cantidad de pacientes que han realizado un triaje de cada color.");
        System.out.printf("- Verde: %d\n- Amarillo: %d\n- Rojo: %d\n- Negro: %d\n\n", verde, amarillo, rojo, negro);
    }
}