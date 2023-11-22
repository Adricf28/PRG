import java.util.Scanner;

public class Informatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean control1=true, control2;
        String opcion;

        while (control1) {
            System.out.println("Busca una opcion de menu o boton que parezca relacionado con lo que quieres hacer");
            System.out.print("¿Lo encuentras? (SI/NO): ");
            opcion = sc.nextLine();

            //¿ENCUENTRAS UN BOTON?
            if (opcion.compareToIgnoreCase("si") == 0) { //SI LO ENCUENTRO
                System.out.println("Pulsalo");
                System.out.print("¿Ha funcionado? (SI/NO): ");
                opcion = sc.nextLine();

                //¿HA FUNCIONADO?
                if (opcion.compareToIgnoreCase("si") == 0) { //SI HA FUNCIONADO
                    System.out.println("¡Hecho!");
                    control1 = false;
                }
                else if (opcion.compareToIgnoreCase("no") == 0) { //NO HA FUNCIONADO
                    System.out.print("¿LLevas mas de media hora con esto? (SI/NO): ");
                    opcion = sc.nextLine();

                    //¿LLEVAS MAS DE MEDIA HORA CON ESTO?
                    if (opcion.compareToIgnoreCase("si") == 0) {
                        System.out.println("Pedir ayuda a alguien o rendirse");
                        control1 = false;
                    }
                }
                else {
                    System.out.println("DEBES responder con SI o NO");
                }
            }
            else if (opcion.compareToIgnoreCase("no") == 0) { //NO LO ENCUENTRO
                System.out.print("¿Puedes elegir uno al azar? (SI/NO): ");
                opcion = sc.nextLine();

                //¿PUEDES ELEGIR UNO AL AZAR?
                if (opcion.compareToIgnoreCase("si") == 0) { //SI PUEDO ELEGIR UNO AL AZAR
                    System.out.println("Pulsalo");
                    System.out.print("¿Ha funcionado? (SI/NO): ");
                    opcion = sc.nextLine();

                    //¿HA FUNCIONADO?
                    if (opcion.compareToIgnoreCase("si") == 0) { //SI HA FUNCIONADO
                        System.out.println("¡Hecho!");
                        control1 = false;
                    }
                    else if (opcion.compareToIgnoreCase("no") == 0) { //NO HA FUNCIONADO
                        System.out.print("¿LLevas mas de media hora con esto? (SI/NO): ");
                        opcion = sc.nextLine();

                        //¿LLEVAS MAS DE MEDIA HORA CON ESTO?
                        if (opcion.compareToIgnoreCase("si") == 0) {
                            System.out.println("Pedir ayuda a alguien o rendirse");
                            control1 = false;
                        }
                    }
                    else {
                        System.out.println("DEBES responder con SI o NO");
                    }
                }
                else if (opcion.compareToIgnoreCase("no") == 0) { //NO PUEDO ELEGIR UNO AL AZAR
                    System.out.print("¿Ha funcionado? (SI/NO): ");
                    opcion = sc.nextLine();

                    //¿HA FUNCIONADO?
                    if (opcion.compareToIgnoreCase("si") == 0) { //SI HA FUNCIONADO
                        System.out.println("¡Hecho!");
                        control1 = false;
                    }
                    else if (opcion.compareToIgnoreCase("no") == 0) { //NO HA FUNCIONADO
                        System.out.print("¿LLevas mas de media hora con esto? (SI/NO): ");
                        opcion = sc.nextLine();

                        //¿LLEVAS MAS DE MEDIA HORA CON ESTO?
                        if (opcion.compareToIgnoreCase("si") == 0) {
                            System.out.println("Pedir ayuda a alguien o rendirse");
                            control1 = false;
                        }
                    }
                    else {
                        System.out.println("DEBES responder con SI o NO");
                    }
                }
                else {
                    System.out.println("DEBES responder con SI o NO");
                }
            }
            else {
                System.out.println("DEBES responder con SI o NO");
            }
        }
    }
}