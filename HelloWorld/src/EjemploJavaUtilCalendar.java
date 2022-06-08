import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        //        calendario.set(2020, Calendar.SEPTEMBER, 25, 0, 0, 10);
        calendario.set(Calendar.YEAR, 2021);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 10);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.AM);
        calendario.set(Calendar.MINUTE, 12);
        calendario.set(Calendar.SECOND, 12);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat sf = new SimpleDateFormat("yyy-MM-dd hh:ss:mm:SSS a");
        String fechaStr = sf.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
    }
}
