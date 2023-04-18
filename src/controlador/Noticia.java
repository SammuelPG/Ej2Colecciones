/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlfechas.Fecha;

/**
 *
 * @author dam
 */
public class Noticia {
    int codigoNot;
    String titulo;
    Categoria Categoria;
    Usuario usuario;
    Fecha fecha;

    public Noticia(int codigoNot,String titulo, Categoria Categoria, Usuario usuario, Fecha fecha) {
        this.codigoNot=codigoNot;
        this.titulo = titulo;
        this.Categoria = Categoria;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public Noticia(int codigoNot) {
        this.codigoNot=codigoNot;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.codigoNot;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Noticia other = (Noticia) obj;
        if (this.codigoNot != other.codigoNot) {
            return false;
        }
        return true;
    }
    
    
}
