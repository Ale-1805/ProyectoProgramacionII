package ec.edu.uce.Util;

import ec.edu.uce.Dominio.Proveedor;

public class ValidacionProveedor {
    // Metodo para validar el ID (solo números)
    public static boolean validarId(int id) {
        return id > 0;  // El ID debe ser mayor a cero
    }

    // Metodo para validar el nombre (solo letras y espacios)
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z\\s]+");  // Solo letras y espacios
    }

    public static boolean validarContacto(String contacto) {
        // Validar números de teléfono ecuatorianos (9 dígitos y que empiece con 09 o 02)
        // El número de teléfono debe empezar con 09 (móviles) o 02 (fijos) seguido de 7 dígitos
        return contacto.matches("^(09|02)\\d{7}$");  // Validación del formato de teléfono
    }
}
