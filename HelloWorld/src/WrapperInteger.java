public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 34123;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer untObjeto2 = 23412;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        int num2 = intObjeto.intValue();
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObject = intObjeto.longValue();
        System.out.println("longObject = " + longObject);
    }
}
