package ec.edu.uce.Test;

import ec.edu.uce.Dominio.JefeDeBodega;
import java.util.Scanner;

public class TestJefeDeBodega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prueba de Jefe de Bodega:");

        // Solicitar nombre
        System.out.print("Ingrese el nombre del jefe de bodega: ");
        String nombre = scanner.nextLine();

        // Solicitar fecha de ingreso
        System.out.print("Ingrese la fecha de ingreso (dd/MM/yyyy): ");
        String fechaIngreso = scanner.nextLine();

        // Solicitar turno
        System.out.print("Ingrese el turno (mañana o noche): ");
        String turno = scanner.nextLine();

        // Crear el objeto JefeDeBodega con los datos ingresados
        JefeDeBodega jefe = new JefeDeBodega(nombre, fechaIngreso, turno);

        // Mostrar los datos del jefe de bodega
        System.out.println("\nDatos del Jefe de Bodega:");
        System.out.println(jefe);
    }
}
