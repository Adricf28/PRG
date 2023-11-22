import java.util.Scanner;

public class Semaforo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        boolean continuar = true;
        int verde=0, amarillo=0, rojo=0, negro=0;

        while (continuar) {
            System.out.println("Teclee a/b/c segun las siguientes opciones:\na) Realizar triaje\nb) Mostrar estadisticas\nPara salir, presione 'c' o cualquier otra tecla.");
            System.out.print("Seleccion: ");
            opcion = sc.nextLine();
            //REALIZAR TRIAJE
            if (opcion.compareToIgnoreCase("a") == 0) {
                System.out.println("Se le van a realizar varias preguntas que debe responder con SI/NO.");
                System.out.println("¿Puede el paciente caminar?");
                opcion = sc.nextLine();
                //¿PUEDE CAMINAR?
                if (opcion.compareToIgnoreCase("si") == 0) { //PUEDE CAMINAR
                    verde++;
                    System.out.println("Triaje VERDE, prioridad baja. Tiempo de espera: entre 60 minutos y 2 horas.\n");
                }
                else if (opcion.compareToIgnoreCase("no") == 0) { //NO PUEDE CAMINAR
                    System.out.println("¿Puede el paciente respirar?");
                    opcion = sc.nextLine();
                    //¿PUEDE RESPIRAR?
                    if (opcion.compareToIgnoreCase("si") == 0) { //PUEDE RESPIRAR
                        System.out.println("¿Es su frecuencia respiratoria mayor a 30 veces por minuto?");
                        opcion = sc.nextLine();
                        //¿FR MAYOR A 30?
                        if (opcion.compareToIgnoreCase("si") == 0) { //FR MAYOR A 30
                            rojo++;
                            System.out.println("Triaje ROJO, prioridad alta. Tiempo de espera: le atenderemos inmediatamente.\n");
                        }
                        else if (opcion.compareToIgnoreCase("no") == 0) { //FR MENOR A 30
                            System.out.println("¿Tiene pulso radial?");
                            opcion = sc.nextLine();
                            //¿PULSO RADIAL?
                            if (opcion.compareToIgnoreCase("si") == 0) { //PULSO RADIAL
                                System.out.println("¿Esta su pulso orientado?");
                                opcion = sc.nextLine();
                                //¿PULSO ORIENTADO?
                                if (opcion.compareToIgnoreCase("si") == 0) { //PULSO ORIENTADO
                                    amarillo++;
                                    System.out.println("Triaje AMARILLO, prioridad media. Tiempo de espera: entre 10 y 60 minutos.\n");
                                }
                                else if (opcion.compareToIgnoreCase("no") == 0) { //PULSO NO ORIENTADO
                                    rojo++;
                                    System.out.println("Triaje ROJO, prioridad alta. Tiempo de espera: le atenderemos inmediatamente.\n");
                                }
                                else {
                                    System.out.println("Debe responder SI/NO.\n");
                                }
                            }
                            else if (opcion.compareToIgnoreCase("no") == 0) { //PULSO NO RADIAL
                                rojo++;
                                System.out.println("Controle la hemorragia mientras llega el medico.\nTriaje ROJO, prioridad alta. Tiempo de espera: le atenderemos inmediatamente.\n");
                            }
                            else {
                                System.out.println("Debe responder SI/NO.\n");
                            }
                        }
                        else {
                            System.out.println("Debe responder SI/NO.\n");
                        }
                    }
                    else if (opcion.compareToIgnoreCase("no") == 0) { //NO PUEDE RESPIRAR
                        System.out.println("¿Respira si hace maniobras de reposicion?");
                        opcion = sc.nextLine();
                        //¿AL REPOSICIONAR RESPIRA?
                        if (opcion.compareToIgnoreCase("si") == 0) { //AL REPOSICIONAR RESPIRA
                            rojo++;
                            System.out.println("Triaje ROJO, prioridad alta. Tiempo de espera: le atenderemos inmediatamente.\n");
                        }
                        else if (opcion.compareToIgnoreCase("no") == 0) { //AL REPOSICIONAR NO RESPIRA
                            negro++;
                            System.out.println("Triaje NEGRO, prioridad nula. Tiempo de espera: indefinido.\n");
                        }
                        else {
                            System.out.println("Debe responder SI/NO.\n");
                        }
                    }
                    else {
                        System.out.println("Debe responder SI/NO.\n");
                    }
                }
                else {
                    System.out.println("Debe responder SI/NO.\n");
                }
            }
            //MOSTRAR ESTADISTICAS
            else if (opcion.compareToIgnoreCase("b") == 0) {
                System.out.println("La siguiente tabla muestra la cantidad de pacientes que han realizado un triaje de cada color.");
                System.out.printf("- Verde: %d\n- Amarillo: %d\n- Rojo: %d\n- Negro: %d\n\n", verde, amarillo, rojo, negro);
            }
            //SALIR
            else {
                continuar = false;
            }
        }

        System.out.println("Finalizando el programa...");
    }
}