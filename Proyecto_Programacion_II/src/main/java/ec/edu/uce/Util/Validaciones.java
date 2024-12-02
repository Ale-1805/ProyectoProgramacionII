package ec.edu.uce.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z\\s]+");
    }

    // Validar que el precio sea un número positivo, con o sin decimales
    public static boolean validarPrecio(double precio) {
        return precio > 0 && String.valueOf(precio).matches("\\d+(\\.\\d+)?");
    }

    public static boolean validarCantidad(int cantidad){
        return String.valueOf(cantidad).matches("\\d+");
    }

    // Validar que el ID sea un número entero positivo
    public static boolean validarId(int id) {
        String idString = String.valueOf(id); // Convertir el ID a cadena
        return idString.matches("\\d{1,6}"); // Verificar que tiene entre 1 y 6 dígitos
    }

    public static boolean validarEstadoPedido(String estado) {
        return estado != null && (estado.equalsIgnoreCase("Entregado") || estado.equalsIgnoreCase("En Camino"));
    }

    public static boolean validarEstadoEmpleado(String estado) {
        return estado != null && (estado.equalsIgnoreCase("Activo") || estado.equalsIgnoreCase("Inactivo"));
    }

    public static boolean validarUbicacion(String ubicacion) {
        if (ubicacion == null) return false;
        Matcher matcher = Pattern.compile("^[a-zA-Z0-9\\-\\s]+$").matcher(ubicacion);
        return matcher.matches();
    }

    // Metodo de validación para el ID (debe ser alfanumérico)
    public static boolean validarUsuario(String usuario) {
        return usuario.matches("[a-zA-Z0-9]+");
    }

    // Metodo de validación para la Contraseña (debe tener al menos 6 caracteres)
    public static boolean validarPassword(String password) {
        return password.length()>=6 && !password.contains(" ");
    }

    public static boolean validarContacto(String contacto) {
        // Validar números de teléfono ecuatorianos (9 dígitos y que empiece con 09 o 02)
        // El número de teléfono debe empezar con 09 (móviles) o 02 (fijos) seguido de 7 dígitos
        return contacto.matches("(0[2-3])\\d{7}|09\\d{8}");  // Validación del formato de teléfono
    }

    public static boolean validarRazonDevolucion(String razonDevolucion) {
        return razonDevolucion != null && !razonDevolucion.trim().isEmpty() && razonDevolucion.matches("[a-zA-Z0-9\\s]+");
    }

    // Validar que las observaciones no estén vacías
    public static boolean validarObservaciones(String observaciones) {
        return observaciones != null && !observaciones.trim().isEmpty();
    }

    // Validar Productos: solo letras y espacios
    public static boolean validarProducto(String productos) {
        if (productos == null) return false;
        Matcher matcher = Pattern.compile("^[a-zA-Z\\s]+$").matcher(productos);
        return matcher.matches();
    }

    public static boolean validarEstadoDevolucion(String estado) {
        return estado != null &&
                (estado.equalsIgnoreCase("Pendiente") || estado.equalsIgnoreCase("Aprobado"));
    }

    // Validar que la fecha siga el formato dd/MM/yyyy
    public static boolean validarFecha(String fecha) {
        if (fecha == null || fecha.isEmpty()) {
            return false;
        }
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);
        try {
            formato.parse(fecha);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean validarItemPedido(String itemPedido) {
        return itemPedido != null && !itemPedido.trim().isEmpty();
    }
}
