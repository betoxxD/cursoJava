import java.util.Scanner;

public class Gasolinera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la medida actual del tanque");
        double medida = sc.nextDouble();
        if(medida >= 70)
            System.out.println("Estanque lleno");
        else if(medida>= 60)
            System.out.println("Estanque casi lleno");
        else if(medida >= 40)
            System.out.println("Estanque 3/4");
        else if (medida >=35)
            System.out.println("Medio estanque");
        else if (medida >= 20)
            System.out.println("Suficiente");
        else if (medida>=1)
            System.out.println("Insuficiente");
    }
}
