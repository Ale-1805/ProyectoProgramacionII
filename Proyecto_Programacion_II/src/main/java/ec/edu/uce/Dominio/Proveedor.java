package ec.edu.uce.Dominio;

public class Proveedor {
    //Atributos
    private int id;
    private String nombre;
    private String contacto;

    // Constructor
    public Proveedor() {
        // Inicializar con valores vacíos
        this.id = 1;
        this.nombre = "S/N";
        this.contacto = "S/N";
    }
    public Proveedor(int id, String nombre, String contacto){
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
    }
    // Getter y Setter para ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>=0) {
            this.id = id;
        }
    }

    // Getter y Setter para Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
            this.nombre = nombre;
    }

    // Getter y Setter para Contacto
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
            this.contacto = contacto;
    }

    // Metodo para mostrar los datos del proveedor
    public String mostrarProveedor() {
        return "Proveedor{" +
                "ID=" + getId() +
                ", Nombre='" + getNombre() + '\'' +
                ", Contacto='" + getContacto() + '\'' +
                '}';
    }

}
