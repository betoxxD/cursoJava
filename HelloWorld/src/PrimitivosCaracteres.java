public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter = " + (decimal == caracter));

        System.out.println("Información sobre el tipo de datos char");
        System.out.println("Tipo char corresponde a " + Character.BYTES + " bytes");
        System.out.println("Tipo char corresponde a " + Character.SIZE + " bits");
        System.out.println("Valor máximo de un char: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un char: " + Character.MIN_VALUE);
        System.out.println("_______________________________________________________");

        System.out.println("Caracteres especiales");
        char espacio = ' ';
        char espacioUnicode = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        // Para utilizar el caracter adecuado para el sistema
        System.getProperty("line.separator");
        System.lineSeparator();
    }
}
