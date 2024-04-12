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


        //METODOS
    };


    //CONSTRUCTOR
    public Paquete(Persona remitente, Persona destinatario, TipoEnvio tipoEnvio, Contenido contenido, double peso) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.tipoEnvio = tipoEnvio;
        this.contenido = contenido;
        this.peso = peso;
    }

    //METODOS
    public double calcularValor() {
        if (tipoEnvio == TipoEnvio.NACIONAL) {
            if (contenido == Contenido.DOCUMENTO) {
                if (peso <= )
            }
        }
    }
}
