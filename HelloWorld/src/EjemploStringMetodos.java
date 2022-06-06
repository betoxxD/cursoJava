public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Alberto";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Alberto\") = " + nombre.equals("Alberto"));
        System.out.println("nombre.equals(\"alberto\") = " + nombre.equals("alberto"));
        System.out.println("nombre.equalsIgnoreCase(\"alberto\") = " + nombre.equalsIgnoreCase("alberto"));
        System.out.println("nombre.compareTo(\"Alberto\") = " + nombre.compareTo("Alberto"));
        System.out.println("nombre.compareTo(\"Juan\") = " + nombre.compareTo("Juan"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace('a','.'));
        System.out.println("trabalenguas.indexOf(\"l\") = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.lastIndexOf(\"z\") = " + trabalenguas.lastIndexOf('z'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println(" trabalenguas   ");
        System.out.println(" trabalenguas   ".trim());
    }
}
