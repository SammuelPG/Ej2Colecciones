/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import encriptar.Encriptar;
import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Empresa {

    ArrayList<Usuario> usuarios;

    public Empresa() {
        usuarios = new ArrayList<>();
    }

    public void anadirUsuarios(Usuario u) {
        usuarios.add(u);
    }

    public boolean buscarUsuario(String nombre, String contrasena) {
        int pos;
        boolean resultado = false;
        pos = usuarios.indexOf(new Usuario(nombre));
        if (pos != -1) {
            resultado = usuarios.get(pos).getContrasena().equals(Encriptar.getMD5(contrasena));
        }
        return resultado;
    }
}
