/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import controlador.Categoria;
import controlador.Noticia;
import controlador.Usuario;
import encriptar.Encriptar;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dam
 */
public class Empresa {

    ArrayList<Usuario> usuarios;
    ArrayList<Categoria> categorias;
    ArrayList<Noticia> noticias;

    public Empresa() {
        usuarios = new ArrayList<>();
        categorias = new ArrayList<>();
        noticias = new ArrayList<>();
    }

    public void anadirUsuarios(Usuario u) {
        usuarios.add(u);
    }

    public void anadirCategorias(Categoria c) {
        categorias.add(c);
    }

    public void anadirNoticia(Noticia n) {
        noticias.add(n);
    }

    public boolean buscarCodigo(int codigo) {
        int pos;
        boolean resultado = false;
        pos = noticias.indexOf(new Noticia(codigo));
        if (pos != -1) {
            resultado = true;
        }
        return resultado;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Noticia> getNoticias() {
        return noticias;
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

    public int BuscarunaNoticia(int codigo) {
        return noticias.indexOf(new Noticia(codigo));
    }

    public Noticia unaNoticia(int codigo) {
        int pos = noticias.indexOf(new Noticia(codigo));
        Noticia noticia;
        if (pos != -1) {
            noticia = noticias.get(pos);
        } else {
            noticia = null;
        }
        return noticia;
    }

    public void borrarNoticia(int pos) {
        noticias.remove(pos);
    }
}
