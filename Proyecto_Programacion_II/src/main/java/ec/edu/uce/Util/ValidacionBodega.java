package ec.edu.uce.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionBodega {
    // Validar Nombre: solo letras y espacios
    public static boolean validarNombre(String nombre) {
        if (nombre == null) return false;
        Matcher matcher = Pattern.compile("^[a-zA-Z\\s]+$").matcher(nombre);
        return matcher.matches();
    }

    // Validar Ubicación: letras, números, guiones y espacios
    public static boolean validarUbicacion(String ubicacion) {
        if (ubicacion == null) return false;
        Matcher matcher = Pattern.compile("^[a-zA-Z0-9\\-\\s]+$").matcher(ubicacion);
        return matcher.matches();
    }

    // Validar Productos: solo letras y espacios
    public static boolean validarProductos(String productos) {
        if (productos == null) return false;
        Matcher matcher = Pattern.compile("^[a-zA-Z\\s]+$").matcher(productos);
        return matcher.matches();
    }

    // Validar Usuarios: solo letras y números
    public static boolean validarUsuarios(String usuarios) {
        if (usuarios == null) return false;
        Matcher matcher = Pattern.compile("^[a-zA-Z0-9]+$").matcher(usuarios);
        return matcher.matches();
    }
}
