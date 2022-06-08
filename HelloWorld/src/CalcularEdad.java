import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu fecha de nacimiento yyyy-MM-dd");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sf2 = new SimpleDateFormat("SSSS");
        try {
            Date fechaNacimiento = sf.parse(sc.nextLine());
            Date fechaActual = new Date();
            long diferencia = fechaActual.getTime() - fechaNacimiento.getTime();
            double edad = diferencia / 1000 / 60 / 60 / 24 / 365.25;
            System.out.println("edad = " + edad);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
