public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = "    ";//"Programación Java";
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);
        boolean esVacio2 = curso.isEmpty();
        boolean esVacio3 = curso.isBlank();
        if (!esVacio3) {
            System.out.println("curso = " + curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        }
    }
}
