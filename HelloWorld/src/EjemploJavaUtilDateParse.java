import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingresa una fecha con formato yyyy-MM-dd");
        try {
            Date fecha = format.parse(sc.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            if (fecha.after(fecha2)) {
                System.out.println("Fecha del usuario es después que la fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es antes de la fecha actual");
            } else {
                System.out.println("La fecha ingresada por el usuario es anterior que la fecha actual");
            }

            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha del usuario es después que la fecha actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha del usuario es antes de la fecha actual");
            } else {
                System.out.println("La fecha ingresada por el usuario es anterior que la fecha actual");
            }
        } catch (ParseException e) {
        }
    }
}
