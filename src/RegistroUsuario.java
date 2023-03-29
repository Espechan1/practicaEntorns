import java.util.Scanner;

public class RegistroUsuario {
    String nombreUsuario;
    String eMail;
    String password;
    String codigo;

    public static void main(String[] args) {
        RegistroUsuario ru = new RegistroUsuario();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de usuario:");
        ru.nombreUsuario = sc.nextLine();
        System.out.println("Introduce el email:");
        ru.eMail = sc.nextLine();
        System.out.println("Introduce la contraseña:");
        ru.password = sc.nextLine();


    }
}
