public class PrimitivosEnteros {
    public static void main(String[] args) {
        System.out.println("_______________________________________________________");
        System.out.println("Información sobre el tipo de datos byte");
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde a " + Byte.BYTES + " bytes");
        System.out.println("Tipo byte corresponde a " + Byte.SIZE + " bits");
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);
        System.out.println("_______________________________________________________");

        System.out.println("Información sobre el tipo de datos short");
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde a " + Short.BYTES + " bytes");
        System.out.println("Tipo short corresponde a " + Short.SIZE + " bits");
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);
        System.out.println("_______________________________________________________");

        System.out.println("Información sobre el tipo de datos int");
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde a " + Integer.BYTES + " bytes");
        System.out.println("Tipo int corresponde a " + Integer.SIZE + " bits");
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);
        System.out.println("_______________________________________________________");

        System.out.println("Información sobre el tipo de datos long (Para agregar un valor mayor al int es necesario colocar una \"l\" al número)");
        long numeroLong = 9223372036854775807l;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde a " + Long.BYTES + " bytes");
        System.out.println("Tipo long corresponde a " + Long.SIZE + " bits");
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);
        System.out.println("_______________________________________________________");

        System.out.println("Información sobre el tipo de datos var");
        var numeroVar = 2147483647;
        System.out.println("Por defecto en valores numéricos utiliza el integer a menos que se indique algo diferente en su valor");
        System.out.println("_______________________________________________________");


    }
}
