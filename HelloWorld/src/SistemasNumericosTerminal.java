import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textoBinario = "Número binario: ";
        String textoOctal = "Número octal: ";
        String textoHexadecimal = "Número hexadecimal: ";
        int numeroDecimal = 0;
        try {
            numeroDecimal = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Solamente números");
            main(args);
            System.exit(0);
        }

        String mensajeSalida = "Numero ingresado: " + numeroDecimal + System.lineSeparator();
        mensajeSalida += textoBinario + Integer.toBinaryString(numeroDecimal) + System.lineSeparator();
        mensajeSalida += textoOctal + Integer.toOctalString(numeroDecimal) + System.lineSeparator();
        mensajeSalida += textoHexadecimal + Integer.toHexString(numeroDecimal) + System.lineSeparator();

        System.out.println(mensajeSalida);
    }
}
