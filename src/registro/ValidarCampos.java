package registro;

import java.util.Arrays;
import java.util.Scanner;

public class ValidarCampos {
    static int arrobas;

    public static int getArrobas() {
        return arrobas;
    }

    public static void setArrobas(int arrobas) {
        ValidarCampos.arrobas = arrobas;
    }

    public static int getPuntos() {
        return puntos;
    }

    public static void setPuntos(int puntos) {
        ValidarCampos.puntos = puntos;
    }

    static int puntos;

    public ValidarCampos(int arrobas) {
    }

    public ValidarCampos() {

    }

    public static boolean validarEmail(String email) {
arrobas = 0;
puntos = 0;
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
        String[] a = email.split("@");
        String[] b = a[1].split("\\.");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if (b[1].equals("com") || b[1].equals("es") || b[1].equals("cat")) {
            if (b[0].equals("yahoo") || b[0].equals("gmail") || b[0].equals("hotmail") || b[0].equals("paucasesnovescifp")) {
                return true;
            }
        }

        return false;
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

    public static boolean validarNombre(String[] usuarios, String nombre) {
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
