import static

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
}
