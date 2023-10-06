package utils;

public class ValidadorCorreo {
    public static boolean validarCorreo(String correo){
        if(correo.contains("@")&&correo.contains(".")){
            return true;
        }
        else{
            return false;
        }
    }
}
