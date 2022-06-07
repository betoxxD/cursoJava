import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
       /*String[] usernames = new String[100];
        String[] passwords = new String[100];

        usernames[0] = "alberto";
        passwords[0] = "alberto";
        usernames[1] = "admin";
        passwords[1] = "admin";
        */

        String[] usernames = {"alberto", "admin"};
        String[] passwords = {"alberto", "admin"};


        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa el username");
        String usuario = sc.nextLine();

        System.out.println("Ingresa la contraseña");
        String contra = sc.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usuario.equals(usernames[i]) && contra.equals(passwords[i])) ? true : esAutenticado;
            /*if (usuario.equals(usernames[i]) && contra.equals(passwords[i])) {
                esAutenticado = true;
                break;
            }*/

        }

        /*if (esAutenticado) {
            System.out.println("Bienvenido " + usuario);
        } else {
            System.out.println("Usuario y/o contraseña incorrectas");
        })*/
        String mensaje = esAutenticado? "Bienvenido usuario ".concat(usuario) : "Usuario o contraseña incorrectos";
        System.out.println("mensaje = " + mensaje);
    }
}
