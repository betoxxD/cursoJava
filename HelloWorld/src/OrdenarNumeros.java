import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa un número");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa otro número");
        int numero2 = sc.nextInt();
        System.out.println("El número mayor es " + (numero1>numero2? numero1 + ">" + numero2: numero2 + ">" + numero1));
    }
}
