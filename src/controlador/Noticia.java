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
    
}
