import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre1, nombre2, nombre3;
        nombre1 = sc.nextLine();
        nombre2 = sc.nextLine();
        nombre3 = sc.nextLine();
        String resultado = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length() - 2) + "_";
        resultado += nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length() - 2) + "_";
        resultado += nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length() - 2);
        System.out.println("resultado = " + resultado);
    }
}
