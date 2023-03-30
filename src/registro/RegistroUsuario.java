package registro;

import java.util.Scanner;

public class RegistroUsuario {
    String usuario;
    String eMail;
    String password;

    public static void main(String[] args) {
        int variableLocal = 0;
        RegistroUsuario ru = new RegistroUsuario();
        if (init(ru)) {
            System.out.println(ru.usuario);
            System.out.println(ru.eMail);
            System.out.println(ru.password);
            System.out.println("El registro se ha realizado con exito.");
        } else {
            System.out.println("Registro incorrecto, datos no válidos.");
        }
    }

    private static boolean init(RegistroUsuario ru) {
        boolean correcto = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de usuario:");
        ru.usuario = sc.nextLine();
        if (!ValidarCampos.validarNombre(new String[]{}, ru.usuario)) correcto = false;
        System.out.println("Introduce el email:");
        if (ValidarCampos.validarEmail(ru.eMail = sc.nextLine())) correcto = false;
        System.out.println("Introduce la contraseña:");
        ru.password = sc.nextLine();
        if (ValidarCampos.validarPass(ru.password)) correcto = false;
        if (!ValidarCampos.validarCodigo()) correcto = false;
        return correcto;
    }
}
