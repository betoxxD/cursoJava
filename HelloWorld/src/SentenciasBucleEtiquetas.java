public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        // La etiqueta se define de la siguiente manera, funciona para while y for
        bucle1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
            }
            System.out.println("i = " + i);
        }
    }
}
