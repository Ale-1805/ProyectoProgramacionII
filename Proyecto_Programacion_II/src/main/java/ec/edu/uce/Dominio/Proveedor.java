package ec.edu.uce.Dominio;

public class Proveedor {
    private int id;
    private String nombre;
    private String contacto;

    //CONSTRUCTOR
    public Proveedor(int id, String nombre, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
    }
    //SET Y GET
    public void setId(int id) {this.id = id;}
    public int getId() {return id;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}

    public void setContacto(String contacto) {this.contacto = contacto;}
    public String getContacto() {return contacto;}

}
