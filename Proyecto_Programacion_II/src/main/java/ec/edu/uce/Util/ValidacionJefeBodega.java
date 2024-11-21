package ec.edu.uce.Util;

public class ValidacionJefeBodega {

    // Metodo de validación para el Nombre (solo letras y espacios)
    public static boolean validarNombre (String nombre){
        return nombre.matches("[a-zA-Z\\s]+");
    }

    // Metodo de validación para la Fecha de Ingreso (formato dd/MM/yyyy)
    public static boolean validarFecha (String fecha){
        return fecha.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    // Metodo de validación para el Turno (mañana o noche)
    public static boolean validarTurno (String turno){
        return turno.equalsIgnoreCase("mañana") || turno.equalsIgnoreCase("noche");
    }
}