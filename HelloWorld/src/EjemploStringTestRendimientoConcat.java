public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder(a);

        for (int i = 0; i < 1000; i++) {
            //c = c.concat(a).concat(b).concat(System.lineSeparator());
            //c = c + a + b + System.lineSeparator();
            sb.append(a).append(b).append(System.lineSeparator());
        }

        long fin = System.currentTimeMillis();
        System.out.println("sb = " + sb.toString());
        System.out.println(fin - inicio + " ms");
    }
}
