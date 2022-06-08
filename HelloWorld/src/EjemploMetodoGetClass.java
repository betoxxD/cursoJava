import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Holi";

        Class str = texto.getClass();
        System.out.println("str.getName() = " + str.getName());
        System.out.println("str.getName() = " + str.getSimpleName());
        System.out.println("str.getName() = " + str.getPackage());
        System.out.println("str = " + str);

        for (Method metodo : str.getMethods()) {
            System.out.println("metodo = " + metodo.getName());
        }

        Integer numero = 234;
        Class intClass = numero.getClass();
        System.out.println("intClass = " + intClass);
    }
}
