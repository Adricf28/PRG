import java.util.Scanner;

public class Registros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean control1=true, control2, control3;
        String opcion;

        System.out.println("Habilitar Inte. por TMR0 GIE = T0IE = 1");
        System.out.println("Cargar registro auxiliar Reg1 con d'45'");

        while (control1) {
            System.out.println("Cargar registro auxiliar Reg2 con d'100'");

            control2 = true;
            while (control2) {
                System.out.println("Cargar TMR0 con d'216'");

                control3 = true;
                while (control3) {
                    System.out.println("---TMR0 Bit7 = 0?---");
                    System.out.print("---Responde SI/NO: ");
                    opcion = sc.nextLine();

                    if (opcion.compareToIgnoreCase("si") == 0) {
                        System.out.println("Hace Reg2 - 1");
                        System.out.println("---Reg2 = 0?---");
                        System.out.print("---Responde SI/NO: ");
                        opcion = sc.nextLine();

                        if (opcion.compareToIgnoreCase("si") == 0) {
                            System.out.println("Hace Reg1 - 1");
                            System.out.println("---Reg1 = 0?---");
                            System.out.print("---Responde SI/NO: ");
                            opcion = sc.nextLine();

                            if (opcion.compareToIgnoreCase("si") == 0) {
                                System.out.println("Continua con el programa principal");
                                System.out.println("-----FIN-----");
                                control1 = false;
                                control2 = false;
                                control3 = false;
                            }
                            else if (opcion.compareToIgnoreCase("no") == 0) {
                                control2 = false;
                                control3 = false;
                            }
                            else {
                                System.out.println("DEBES responder con SI o NO");
                            }
                        }
                        else if (opcion.compareToIgnoreCase("no") == 0) {
                            control3 = false;
                        }
                        else {
                            System.out.println("DEBES responder con SI o NO");
                        }
                    }
                }
            }
        }
    }
}
