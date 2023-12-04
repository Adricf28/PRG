import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op, nombreHotel;
        Cliente cliente1;
        Hotel hotel1;

        while(true) {
            System.out.println("a) Definir hotel\nb) Añadir cliente\nc) Eliminar cliente\nd) Buscar cliente\n cualquier otra) Salir");
            System.out.print("Seleccion: ");
            op = sc.nextLine();

            if (op.equalsIgnoreCase("a")) {
                System.out.print("Escribe el nombre del hotel: ");
                nombreHotel = sc.nextLine();
                hotel1 = new Hotel();
            } else if (op.equalsIgnoreCase("b")) {

            } else if (op.equalsIgnoreCase("c")) {

            } else if (op.equalsIgnoreCase("d")) {

            } else {
                break;
            }
        }
    }
}
