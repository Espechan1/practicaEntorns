import java.util.Scanner;

public class ValidarCampos {

    public static boolean validarEmail(String email) {
        int arrobas = 0;
        int puntos = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                arrobas++;
            }
            if (email.charAt(i) == '.') {
                puntos++;
            }
        }
        if (arrobas != 1 || puntos != 1) {
            return false;
        }
        String[] a = email.split("@\\.");
        if (!a[2].matches("com") || !a[2].matches("es") || !a[2].matches("cat")) {
            return false;
        }
        if (!a[1].matches("yahoo") || !a[1].matches("gmail") || !a[1].matches("hotmail") || !a[1].matches("paucasesnovescifp")) {
            return false;
        }
        return true;
    }

    public static boolean validarPass(String pass) {
        if (pass.length() < 8) {
            return false;
        }
        if (!Character.isUpperCase(pass.charAt(0))) {
            return false;
        }
        int ce = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) == '@' || pass.charAt(i) == '_' || pass.charAt(i) == '-' || pass.charAt(i) == '#') {
                ce++;
            }
        }
        if (ce < 1) {
            return false;
        }
        if (!Character.isDigit(pass.charAt(pass.length() - 1)) || !Character.isDigit(pass.charAt(pass.length() - 2))) {
            return false;
        }
        return true;
    }

    private static boolean validarNombre(String nombre) {
        String[] bdNombres = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        if (nombre.length() > 16) {
            return false;
        }
        for (int i = 0; i < bdNombres.length; i++) {
            if (nombre.equals(bdNombres[i])) {
                return false;
            }
        }
        if (!Character.isUpperCase(nombre.charAt(0))) {
            return false;
        }
        int guiones = 0;
        for (int i = 1; i < nombre.length() - 3; i++) {
            if (nombre.charAt(i) == '_' || nombre.charAt(i) == '-') {
                guiones++;
            }
            if (Character.isAlphabetic(nombre.charAt(i))) {
                if (Character.isUpperCase(nombre.charAt(i))) {
                    return false;
                }
            }
        }
        if (guiones != 1) {
            return false;
        }
        for (int i = nombre.length() - 3; i < nombre.length(); i++) {
            if (!Character.isDigit(nombre.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean validarCodigo() {
        String codigo = "";
        for (int i = 0; i < 8; i++) {
            codigo += (char) ((int) (Math.random() * 90) + 47);
        }
        System.out.println("Introduce el siguiente código de seguridad:");
        System.out.println(codigo);
        Scanner scan = new Scanner(System.in);
        if (!scan.nextLine().equals(codigo)) {
            System.out.println("Los codigos no coinciden");
            return false;
        }
        return true;
    }
}
