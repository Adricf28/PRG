import java.net.ConnectException;

public class Paquete {
    //ATRIBUTOS
    private Persona remitente;
    private Persona destinatario;
    private TipoEnvio tipoEnvio;
    private Contenido contenido;
    private double peso;
    private class Persona {
        //ATRIBUTOS
        private String nombre;
        private String apellidos;
        private int dni;
        private String direccion;
        private String telefono;

        //CONSTRUCTORES
        public Persona(){}

        public Persona(String nombre, String apellidos, int dni, String direccion, String telefono) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.dni = dni;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        //METODOS
        public void printData() {
            System.out.printf("Nombre: %s\nApellidos: %s\nDNI: %d\nDireccion: %s\nTelefono: %s\n\n", nombre, apellidos, dni, direccion, telefono);
        }
    };


    //CONSTRUCTORES
    public Paquete(){}

    public Paquete(Persona remitente, Persona destinatario, TipoEnvio tipoEnvio, Contenido contenido, double peso) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.tipoEnvio = tipoEnvio;
        this.contenido = contenido;
        this.peso = peso;
    }

    //METODOS
    public static void main(String[] args) {
        Persona remitente = new Paquete().new Persona("Adrian", "Carmona", 26838689, "Calle Najando", "111222333");
        Persona destinatario = new Paquete().new Persona("Cuajin", "Rodriguez", 333444555, "Calle Folle", "999000111");
        Paquete miPaquete = new Paquete(remitente, destinatario, TipoEnvio.NACIONAL, Contenido.MERCANCIA, 7.7);

        miPaquete.printData();
        System.out.printf("Valor del paquete: %f €", miPaquete.calcularValor());
    }

    public double calcularValor() {
        double valor;
        if (tipoEnvio == TipoEnvio.NACIONAL) {
            if (contenido == Contenido.DOCUMENTO) {
                if (peso <= 2) {
                    valor = 2000;
                } else {
                    valor = 3000;
                }
            } else {
                if (peso <= 5) {
                    valor = 5000;
                } else {
                    valor = 7000;
                }
            }
        } else {
            if (contenido == Contenido.DOCUMENTO) {
                if (peso <= 2) {
                    valor = 10000;
                } else {
                    valor = 15000;
                }
            } else {
                if (peso <= 5) {
                    valor = 12000;
                } else {
                    valor = 20000;
                }
            }
        }
        return valor;
    }

    public void printData() {
        System.out.println("-- Remitente --");
        remitente.printData();
        System.out.println("-- Destinatario --");
        destinatario.printData();
        System.out.printf("Tipo de envio: %s\nContenido: %s\nPeso: %f\n\n", tipoEnvio, contenido, peso);
    }
}
