/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import controlador.Categoria;
import controlador.Usuario;
import encriptar.Encriptar;
import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Empresa {

    ArrayList<Usuario> usuarios;
    ArrayList<Categoria> categorias;

    public Empresa() {
        usuarios = new ArrayList<>();
        categorias=new ArrayList<>();
    }

    public void anadirUsuarios(Usuario u) {
        usuarios.add(u);
    }
     public void anadirCategorias(Categoria c) {
        categorias.add(c);
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
