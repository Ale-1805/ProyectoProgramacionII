package ec.edu.uce.Dominio;
import ec.edu.uce.Util.Validaciones;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Devolucion {
    private String sucursal;
    private String codigoDevolucion;
    private String fecha;
    private String estado;

    // Constructor
    public Devolucion() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar Sucursal
        boolean sucursalValida = false;
        while (!sucursalValida) {
            System.out.print("Ingrese el nombre de la sucursal (Sucursal 1, Sucursal 2, etc.): ");
            String sucursalInput = scanner.nextLine();
            if (setSucursal(sucursalInput)) {  // Llamar al setter para validar y asignar la sucursal
                sucursalValida = true;
            } else {
                System.out.println("El nombre de la sucursal no es válido.");
            }
        }

        // Generar y mostrar el Código de Devolución
        this.codigoDevolucion = generarCodigoDevolucion();
        System.out.println("El código de devolución generado es: " + this.codigoDevolucion);

        // Solicitar Estado del Daño
        boolean estadoValido = false;
        while (!estadoValido) {
            System.out.print("Ingrese el estado del daño (leve, medio, total): ");
            String estadoInput = scanner.nextLine();
            if (setEstado(estadoInput)) {  // Llamar al setter para validar y asignar el estado
                estadoValido = true;
            } else {
                System.out.println("Estado no válido. Ingrese 'leve', 'medio' o 'total'.");
            }
        }

        // Obtener la fecha actual
        this.fecha = obtenerFechaActual();

        // Mostrar los datos ingresados
        mostrarDatos();
    }

    // Getter y Setter para Sucursal
    public String getSucursal() {
        return sucursal;
    }

    public boolean setSucursal(String sucursal) {
        if (Validaciones.validarUbicacion(sucursal)) {
            this.sucursal = sucursal;
            return true;
        }
        return false;
    }

    // Getter para el Código de Devolución (No tiene setter ya que es generado automáticamente)
    public String getCodigoDevolucion() {
        return codigoDevolucion;
    }

    // Generar un código de devolución único
    private String generarCodigoDevolucion() {
        return "DEV-" + (int) (Math.random() * 10000);  // Genera un código aleatorio de 4 dígitos
    }

    // Getter para Fecha
    public String getFecha() {
        return fecha;
    }

    // Obtener la fecha y hora actual
    private String obtenerFechaActual() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return formatoFecha.format(date);
    }

    // Getter y Setter para el Estado del Daño
    public String getEstado() {
        return estado;
    }

    public boolean setEstado(String estado) {
        if (Validaciones.validarEstadoPedido(estado)) {
            this.estado = estado;
            return true;
        }
        return false;
    }

    // Metodo para mostrar los datos de la devolución
    public void mostrarDatos() {
        if (sucursal != null && codigoDevolucion != null && fecha != null && estado != null) {
            System.out.println("Sucursal: " + getSucursal());
            System.out.println("Código de Devolución: " + getCodigoDevolucion());
            System.out.println("Fecha de Devolución: " + getFecha());
            System.out.println("Estado del Daño: " + getEstado());
        } else {
            System.out.println("No se pudo registrar la devolución debido a datos inválidos.");
        }
    }

}
