public class Medicamento {
    //ATRIBUTOS
    private String nombre;
    private String fabricante;
    private String viaAdmin;
    private class Posologia {
        //ATRIBUTOS
        private String usuarios;
        private double dosis;
        private String tiempo;
        private String recomendaciones;

        //CONSTRUCTORES
        public Posologia() {}

        public Posologia(String usuarios, double dosis, String tiempo, String recomendaciones) {
            this.usuarios = usuarios;
            this.dosis = dosis;
            this.tiempo = tiempo;
            this.recomendaciones = recomendaciones;
        }

        //METODOS
        public void printData() {
            System.out.printf("Usuarios: %s\nDosis: %f mg\nTiempo medicacion: %s\nRecomendaciones: %s\n\n", usuarios, dosis, tiempo, recomendaciones);
        }
    }

    //CONSTRUCTORES
    public Medicamento() {}

    public Medicamento(String nombre, String fabricante, String viaAdmin) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.viaAdmin = viaAdmin;
    }

    //METODOS
    public static void main(String[] args) {
        Medicamento ibuprofeno = new Medicamento("Ibuprofeno", "Kern Pharma", "Bucal");
        Posologia ibPos = ibuprofeno.new Posologia("Malitos", 10, "Una semana", "Tomar cada 6 horas");

        ibuprofeno.printData();
        ibPos.printData();
    }

    public void printData() {
        System.out.printf("Nombre: %s\nFabricante: %s\nVia de administracion: %s\n\n", nombre, fabricante, viaAdmin);
    }
}
