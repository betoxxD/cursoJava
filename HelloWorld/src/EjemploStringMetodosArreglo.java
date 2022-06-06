public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        System.out.println("trabalenguas.split(\"lengu\") = " + trabalenguas.split("lengu"));
        String[] arreglo2 = trabalenguas.split("lengu");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println(arreglo2[i]);
        }

        String nombreArchivo = "andamosdfasdf.pdf";
        String[] archivoArr = nombreArchivo.split("\\.");
        for (int i = 0; i < archivoArr.length; i++) {
            System.out.println(archivoArr[i]);
        }
        System.out.println("archivoArr[archivoArr.length - 1] = " + archivoArr[archivoArr.length - 1]);
    }
}
