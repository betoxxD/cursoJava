import javax.swing.*;

public class OperadoresAritmetico {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i-j) = " + (i - j));
        
        int multi = i * j;
        System.out.println("multi = " + multi);

        double div = (double)i/ j;
        System.out.println("div = " + div);
        
        int resto = i % j;
        System.out.println("resto = " + resto);

        resto = 8%5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
        if(numero % 2 == 0)
            System.out.println("numero par = " + numero);
        else
            System.out.println("numero impar = " + numero);
    }
}
