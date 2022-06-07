import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String variable = 7 == 7 ? "Si es verdadero" : "Andamos mal";
        System.out.println("variable = " + variable);

        String estado = "";
        System.out.println("Ingresa la nota de matemáticas");
        double matematicas = sc.nextDouble();
        System.out.println("Ingresa la nota de ciencias");
        double ciencias = sc.nextDouble();
        System.out.println("Ingresa la nota de historia");
        double historia = sc.nextDouble();
        double promedio = (matematicas + historia + ciencias) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio > 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);
    }
}
