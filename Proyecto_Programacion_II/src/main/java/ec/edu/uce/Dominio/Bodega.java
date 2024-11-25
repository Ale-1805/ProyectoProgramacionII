package ec.edu.uce.Dominio;

import ec.edu.uce.Util.Validaciones;

public class Bodega {
    // Atributos
    private String nombre;
    private String ubicacion;
    private String productos;
    private String usuarios;
    //Constructor sin parametros
    public Bodega(){
        this.nombre="S/N";
        this.ubicacion="S/N";
        this.productos="S/N";
        this.usuarios="S/N";
    }

// Constructor
public Bodega(String nNombre, String nUbicacion, String nProductos, String nUsuarios) {
    if (Validaciones.validarNombre(nNombre)) {
        this.nombre = nNombre;
    } else {
        System.out.println("Nombre inválido. Debe contener solo letras y espacios.");
    }

    if (Validaciones.validarUbicacion(nUbicacion)) {
        this.ubicacion = nUbicacion;
    } else {
        System.out.println("Ubicación inválida. Debe contener solo letras, números, guiones y espacios.");
    }

    if (Validaciones.validarProducto(nProductos)) {
        this.productos = nProductos;
    } else {
        System.out.println("Productos inválidos. Deben contener solo letras y espacios.");
    }

    if (Validaciones.validarUsuario(nUsuarios)) {
        this.usuarios = nUsuarios;
    } else {
        System.out.println("Usuarios inválidos. Deben contener solo letras y números.");
    }
}

// Getters y Setters
public void setNombre(String nNombre) {
    if (Validaciones.validarNombre(nNombre)) {
        this.nombre = nNombre;
    } else {
        System.out.println("Nombre inválido. Debe contener solo letras y espacios.");
    }
}

public String getNombre() {
    return nombre;
}

public void setProductos(String nProductos) {
    if (Validaciones.validarProducto(nProductos)) {
        this.productos = nProductos;
    } else {
        System.out.println("Productos inválidos. Deben contener solo letras y espacios.");
    }
}

public String getProductos() {
    return productos;
}

public void setUbicacion(String nUbicacion) {
    if (Validaciones.validarUbicacion(nUbicacion)) {
        this.ubicacion = nUbicacion;
    } else {
        System.out.println("Ubicación inválida. Debe contener solo letras, números, guiones y espacios.");
    }
}

public String getUbicacion() {
    return ubicacion;
}

public void setUsuarios(String nUsuarios) {
    if (Validaciones.validarUsuario(nUsuarios)) {
        this.usuarios = nUsuarios;
    } else {
        System.out.println("Usuarios inválidos. Deben contener solo letras y números.");
    }
}

public String getUsuarios() {
    return usuarios;
    }
    // Metodo mostrar()
    public void mostrar() {
        System.out.println("Información de la Bodega:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ubicación: " + getUbicacion());
        System.out.println("Productos: " + getProductos());
        System.out.println("Usuarios: " + getUsuarios());
    }
}

