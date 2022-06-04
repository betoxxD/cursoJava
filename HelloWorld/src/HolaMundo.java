public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola mundo desde java";
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());

        Integer numero = 10;
        System.out.println("numero = " + numero);
        boolean valor = true;

        int numero2 = 5;
        if (valor) {
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        // Funciona como en JavaScript, toma el tipo de dato correspondiente al valor que se le asigna
        var numero3 = 15;

        String nombre;

        nombre = "Andrés";

        if (numero > 10)
            nombre = "Juan";
        System.out.println("nombre = " + nombre);
    }
}
