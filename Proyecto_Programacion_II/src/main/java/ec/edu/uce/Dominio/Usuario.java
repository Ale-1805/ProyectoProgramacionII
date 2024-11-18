package ec.edu.uce.Dominio;

public class Usuario {
    private String id;
    private String password;
    public Usuario(String id, String password) {
        this.id = id;
        this.password = password;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + getId());
        System.out.println("Contraseña: " + getPassword());
    }
}