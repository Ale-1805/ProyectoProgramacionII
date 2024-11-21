package ec.edu.uce.Dominio;
import ec.edu.uce.Util.ValidacionProveedor;
import java.util.Scanner;

public class Proveedor {
    private int id;
    private String nombre;
    private String contacto;

    // Constructor
    public Proveedor() {
        Scanner scanner = new Scanner(System.in);

        // Ingresar y validar el ID
        boolean idValido = false;
        while (!idValido) {
            System.out.print("Ingrese el ID del proveedor: ");
            int idInput = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            if (setId(idInput)) {
                idValido = true;
            } else {
                System.out.println("El ID ingresado no es válido.");
            }
        }

        // Ingresar y validar el nombre
        boolean nombreValido = false;
        while (!nombreValido) {
            System.out.print("Ingrese el nombre del proveedor: ");
            String nombreInput = scanner.nextLine();
            if (setNombre(nombreInput)) {
                nombreValido = true;
            } else {
                System.out.println("El nombre ingresado no es válido.");
            }
        }

        // Ingresar y validar el contacto
        boolean contactoValido = false;
        while (!contactoValido) {
            System.out.print("Ingrese el contacto del proveedor (número de teléfono ecuatoriano): ");
            String contactoInput = scanner.nextLine();
            if (setContacto(contactoInput)) {
                contactoValido = true;
            } else {
                System.out.println("El contacto ingresado no es válido.");
            }
        }

        // Mostrar los datos ingresados
        mostrarProveedor();
    }

    // Getter y Setter para ID
    public int getId() {
        return id;
    }

    public boolean setId(int id) {
        if (ValidacionProveedor.validarId(id)) {
            this.id = id;
            return true;
        }
        return false;
    }

    // Getter y Setter para Nombre
    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String nombre) {
        if (ValidacionProveedor.validarNombre(nombre)) {
            this.nombre = nombre;
            return true;
        }
        return false;
    }

    // Getter y Setter para Contacto
    public String getContacto() {
        return contacto;
    }

    public boolean setContacto(String contacto) {
        if (ValidacionProveedor.validarContacto(contacto)) {
            this.contacto = contacto;
            return true;
        }
        return false;
    }

    // Metodo para mostrar los datos del proveedor
    public void mostrarProveedor() {
        System.out.println("Proveedor{" +
                "ID=" + getId() +
                ", Nombre='" + getNombre() + '\'' +
                ", Contacto='" + getContacto() + '\'' +
                '}');
    }
}
