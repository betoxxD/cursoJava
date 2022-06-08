import java.util.Scanner;

public class BuscarMinimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números a introducir");
        int cant = sc.nextInt();
        int numero = 0;
        int min = 0;
        for (int i = 0; i < cant; i++) {
            numero = sc.nextInt();
            if (min == 0) {
                min = numero;
                continue;
            }
            if (numero < min) {
                min = numero;
            }
        }
        System.out.println("min = " + min);
        System.out.println(min < 10 ? "El número es menor que 10!" : "El número menor es mayor o igual a 10");
    }
}
