package ec.edu.uce.Test;

import ec.edu.uce.Dominio.Usuario;

public class TestUsuario {
    public static void main(String[] args) {
        // Crear un objeto Usuario
        Usuario usuario = new Usuario("admin", "1234");
        usuario.mostrarDatos();
        usuario.setId("Elluffycitocanga");
        usuario.setPassword("gokussj2");
        usuario.mostrarDatos();
    }

}
