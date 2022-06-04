import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String textoBinario = "Número binario: ";
        String textoOctal = "Número octal: ";
        String textoHexadecimal = "Número hexadecimal: ";
        String numeroStr = JOptionPane.showInputDialog(null, "Hola, ingresa un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Solamente valores numéricos");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeSalida = "Numero ingresado: " + numeroDecimal + System.lineSeparator();
        mensajeSalida += textoBinario + Integer.toBinaryString(numeroDecimal) + System.lineSeparator();
        mensajeSalida += textoOctal + Integer.toOctalString(numeroDecimal) + System.lineSeparator();
        mensajeSalida += textoHexadecimal + Integer.toHexString(numeroDecimal) + System.lineSeparator();
        JOptionPane.showMessageDialog(null, mensajeSalida);

        // Convertir a binario
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        // Representación de un número binario (Se agrega 0b como prefijo)
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        //Convertir a octal
        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        // Representación de un número octal (Se agrega 0 como prefijo)
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        // Convertir a hexadecimal
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        // Representación de un número binario (Se agrega 0x como prefijo)
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
    }
}
