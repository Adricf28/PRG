import java.util.Scanner;

public class Problemas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar=true, control1, control2;
        String opcion;

        while (continuar) {
            System.out.println("¿Funciona?");
            System.out.print("Responde SI/NO: ");
            opcion = sc.nextLine();
            //¿FUNCIONA?
            if (opcion.compareToIgnoreCase("si") == 0) { //SI FUNCIONA
                System.out.println("¡No lo toques!");
                System.out.println("Sin problemas");
                continuar = false;
            }
            else if (opcion.compareToIgnoreCase("no") == 0) { //NO FUNCIONA
                System.out.println("¿Lo tocaste?");
                System.out.print("Responde SI/NO: ");
                opcion = sc.nextLine();

                //¿LO TOCASTE?
                if (opcion.compareToIgnoreCase("si") == 0) { //SI LO TOCASTE
                    System.out.println("¡La cagaste!");
                    System.out.println("¿Lo sabe alguien?");
                    System.out.print("Responde SI/NO: ");
                    opcion = sc.nextLine();

                    //¿LO SABE ALGUIEN?
                    if (opcion.compareToIgnoreCase("si") == 0) { //SI LO SABE ALGUIEN
                        control1 = true;
                        while (control1) {
                            System.out.println("¡Pobre imbecil!");
                            System.out.println("¿Puedes culpar a alguien?");
                            System.out.print("Responde SI/NO: ");
                            opcion = sc.nextLine();

                            //¿PUEDES CULPAR A ALGUIEN?
                            if (opcion.compareToIgnoreCase("si") == 0) { //SI PUEDES CULPAR A ALGUIEN
                                System.out.println("Sin problemas");
                                continuar = false;
                                control1 = false;
                            }
                        }
                    }
                    else if (opcion.compareToIgnoreCase("no") == 0) { //NO LO SABE NADIE
                        System.out.println("¡Escondelo!");
                        System.out.println("Sin problemas");
                        continuar = false;
                    }
                    else {
                        System.out.println("DEBES responder con SI o NO");
                    }
                }
                else if (opcion.compareToIgnoreCase("no") == 0) { //NO LO TOCASTE
                    System.out.println("¿Tendras problemas?");
                    System.out.print("Responde SI/NO: ");
                    opcion = sc.nextLine();

                    //¿TENDRAS PROBLEMAS?
                    if (opcion.compareToIgnoreCase("si") == 0) { //SI TENDRAS PROBLEMAS
                        control2 = true;
                        while (control2) {
                            System.out.println("¡Pobre imbecil!");
                            System.out.println("¿Puedes culpar a alguien?");
                            System.out.print("Responde SI/NO: ");
                            opcion = sc.nextLine();

                            //¿PUEDES CULPAR A ALGUIEN?
                            if (opcion.compareToIgnoreCase("si") == 0) { //SI PUEDES CULPAR A ALGUIEN
                                System.out.println("Sin problemas");
                                continuar = false;
                                control2 = false;
                            }
                        }
                    }
                    else if (opcion.compareToIgnoreCase("no") == 0) { //NO TENDRAS PROBLEMAS
                        System.out.println("Olvidate del tema");
                        System.out.println("Sin problemas");
                        continuar = false;
                        control2 = false;
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
