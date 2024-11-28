package ec.edu.uce.Dominio;

public class Usuario {
    // Atributos
    private String nombre;
    private String contrasena;

    // Constructor
    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Metodo toString para mostrar los datos del usuario
    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + nombre + '\'' +
                ", Contraseña='" + contrasena + '\'' +
                '}';
    }
}