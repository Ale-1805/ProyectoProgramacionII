package ec.edu.uce.Dominio;

import ec.edu.uce.Util.Validaciones;

import java.util.Scanner;

public class JefeDeBodega {
    // Atributos
    private String nombre;
    private String fechaIngreso;
    private String turno;

    // Constructor vacío
    public JefeDeBodega() {
            this.nombre = "";
            this.fechaIngreso = "";
            this.turno = "";
        }

        // Constructor con validaciones
    public JefeDeBodega(String nombre, String fechaIngreso, String turno) {
            this.nombre = nombre;
            this.fechaIngreso = fechaIngreso;
            this.turno = turno;
        }

        // Getters y Setters con validaciones
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            if (nombre != null) {
                this.nombre = nombre;
            }
        }

        public String getFechaIngreso() {
            return fechaIngreso;
        }

        public void setFechaIngreso(String fechaIngreso) {
        if (fechaIngreso != null) {
            this.fechaIngreso = fechaIngreso;
            }
        }

        public String getTurno() {
            return turno;
        }

        public void setTurno(String turno) {
            if (turno != null) {
                this.turno = turno;
            }
        }

        // Metodo toString para mostrar los datos
        @Override
        public String toString() {
            return "JefeDeBodega{" +
                    "Nombre='" + nombre + '\'' +
                    ", Fecha de Ingreso='" + fechaIngreso + '\'' +
                    ", Turno='" + turno + '\'' +
                    '}';
        }
    }