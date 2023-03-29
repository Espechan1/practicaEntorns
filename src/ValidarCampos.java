import java.util.Scanner;

public class ValidarCampos {
    public static boolean validarPass(String pass){
        if(pass.length()<8){
            return false;
        }
        if(!Character.isUpperCase(pass.charAt(0))){
            return false;
        }
        int ce = 0;
        for (int i = 0; i < pass.length(); i++) {
            if(pass.charAt(i) == '@' || pass.charAt(i) == '_' || pass.charAt(i) == '-' || pass.charAt(i) == '#'){
                ce++;
            }
        }
        if(ce < 1){
            return false;
        }
        if(!Character.isDigit(pass.charAt(pass.length()-1)) || !Character.isDigit(pass.charAt(pass.length()-2))){
            return false;
        }
        return true;
    }

    public static boolean validarCodigo() {
        String codigo = "";
        for (int i = 0; i < 8; i++) {
            codigo += (char) ((int) (Math.random() * 90) +47);
        }
        System.out.println("Introduce el siguiente código de seguridad:");
        System.out.println(codigo);
        Scanner scan = new Scanner(System.in);
        if(!scan.nextLine().equals(codigo)){
            System.out.println("Los codigos no coinciden");
            return false;
        }
        return true;
    }
}
