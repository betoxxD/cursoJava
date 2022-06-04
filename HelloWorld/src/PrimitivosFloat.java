public class PrimitivosFloat {

    public static void main(String[] args) {
        System.out.println("Información sobre el tipo de datos float");
        float realFloat = 1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float corresponde a " + Float.BYTES + " bytes");
        System.out.println("Tipo float corresponde a " + Float.SIZE + " bits");
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);
        System.out.println("_______________________________________________________");

        System.out.println("Información sobre el tipo de datos float");
        double realDouble = 3.1416151115;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde a " + Double.BYTES + " bytes");
        System.out.println("Tipo double corresponde a " + Double.SIZE + " bits");
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE);
        System.out.println("_______________________________________________________");
    }
}
