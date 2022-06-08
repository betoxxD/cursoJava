class Persona {
    private String nombre;

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}

public class PasarPorReferenciaPropia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Alberto");

        System.out.println("Iniciamos el main");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Finaliza el main con");
        System.out.println("persona.getNombre() = " + persona.getNombre());
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");
        persona.setNombre("Juan");
        System.out.println("Finaliza el método test");
    }
}
