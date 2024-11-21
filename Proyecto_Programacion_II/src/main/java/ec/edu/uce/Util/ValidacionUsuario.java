package ec.edu.uce.Util;


public class ValidacionUsuario {
    // Metodo de validación para el ID (debe ser alfanumérico)
    public static boolean validarId(String id) {
        return id.matches("[a-zA-Z0-9]+");
    }

    // Metodo de validación para la Contraseña (debe tener al menos 6 caracteres)
    public static boolean validarPassword(String password) {
        return password.length()>=6;
    }


}
