public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "trigoTres tristes tigres tragaban trigotrigotrigo en un trigal";
        int cantidad = 0;
        String palabra = "trigo";
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        int k;
        buscar:
        for (int i = 0; i < maxFrase; i++) {
            k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            i = k - 1;
            cantidad++;
        }
        System.out.println("Encontrado: " + cantidad + " veces la palabra '" + palabra + "' en la frase");
    }
}
