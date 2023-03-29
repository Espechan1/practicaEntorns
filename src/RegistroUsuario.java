import java.util.Scanner;

public class RegistroUsuario {
    String nombreUsuario;
    String eMail;
    String password;

    public static void main(String[] args) {

        boolean correcto = true;

        RegistroUsuario ru = new RegistroUsuario();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de usuario:");
        ru.nombreUsuario = sc.nextLine();
        if (!ValidarCampos.validarNombre(ru.nombreUsuario)) correcto = false;
        System.out.println("Introduce el email:");
        if (ValidarCampos.validarEmail(ru.eMail = sc.nextLine())) correcto = false;
        System.out.println("Introduce la contraseña:");
        ru.password = sc.nextLine();
        if (ValidarCampos.validarPass(ru.password)) correcto = false;
        if (!ValidarCampos.validarCodigo()) correcto = false;

        if (correcto) {
            System.out.println(ru.nombreUsuario);
            System.out.println(ru.eMail);
            System.out.println(ru.password);
            System.out.println("El registro se ha realizado con exito.");
        } else {
            System.out.println("Registro incorrecto, datos no válidos.");
        }
    }
}
