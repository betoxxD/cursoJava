import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreFactura = sc.nextLine();
        double precio1, precio2;
        precio1 = sc.nextDouble();
        precio2 = sc.nextDouble();
        double bruto = precio1 + precio2;
        double impuesto = bruto * 0.19;
        String mensajeSalida = "La factura " + nombreFactura + " tiene un total bruto de " + bruto + ",";
        mensajeSalida += "con un impuesto de " + impuesto + " y el monto después del impuesto es de " + (bruto + impuesto);
        System.out.println(mensajeSalida);
    }
}
