public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10, 11, 12};

        System.out.println("Iniciamos el main");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Antes de llamar al método test");
        test(edad);
        System.out.println("Finaliza el main con");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }
    }

    public static void test(int[] edadArr) {
        System.out.println("Iniciamos el método test");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] += 20;
        }
        System.out.println("Finaliza el método test");
    }
}
