import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número");
        int num1 = sc.nextInt();
        System.out.println("Ingresa otro");
        int num2 = sc.nextInt();
        System.out.println("Ingresa uno más");
        int num3 = sc.nextInt();

        max = (num1 > num2)? num1: num2;
        max = (max>num3)? max: num3;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("max = " + max);
    }
}
