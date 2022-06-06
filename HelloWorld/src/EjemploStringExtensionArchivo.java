public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "Cualquiernombre.jpg";
        System.out.println("archivo.length() = " + archivo.length());
        int dotPosition = archivo.lastIndexOf('.');
        String extension = archivo.substring(dotPosition + 1);
        System.out.println("extension = " + extension);
    }
}
