package ec.edu.uce.Util;


    public class ValidacionProducto {
        public static boolean validarNombre(String nombre) {
            return nombre.matches("[a-zA-Z\\s]+");
        }
        public static boolean validarId(int id){
            return String.valueOf(id).matches("\\d+");
        }
        public static boolean validarPrecio(double precio) {
            return String.valueOf(precio).matches("\\d+(\\.\\d+)?");
        }
        public static boolean validarCantidad(int cantidad){
            return String.valueOf(cantidad).matches("\\d+");
        }
    }
