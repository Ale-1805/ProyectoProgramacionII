package ec.edu.uce.Util;

import java.util.Date;

public class ValidacionEmpleado {
    public static boolean validarNombre(String nombre) {
        return nombre != null && nombre.matches("[a-zA-Z\\s]{3,50}");
    }

    public static boolean validarFechaIngreso(Date fechaIngreso) {
        return fechaIngreso != null && fechaIngreso.before(new Date());
    }

    public static boolean validarFechaSalida(Date fechaSalida, Date fechaIngreso) {
        return fechaSalida == null || (fechaIngreso != null && fechaSalida.after(fechaIngreso));
    }

    public static boolean validarEstado(String estado) {
        return estado != null && (estado.equalsIgnoreCase("Activo") || estado.equalsIgnoreCase("Inactivo"));
    }

}
