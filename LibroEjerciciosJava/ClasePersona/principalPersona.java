public class principalPersona {
    public static void main(String[] args) {
        Persona adrian = new Persona("Adrian", "Carmona", "26838689-N", 2000, "España", 'H');
        Persona paco = new Persona("Francisco", "Carmona", "33394592-H", 1971, "España", 'H');

        adrian.printValues();
        paco.printValues();
    }
}
