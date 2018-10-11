/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class Book {
    public String categoria;
    public String cover;
    public Titulo titulo;
    public ArrayList<String>listaAutores=new ArrayList<>();
    public String año;
    public String precio;

    public Book(String categoria, String cover, Titulo titulo, String año, String precio) {
        this.categoria = categoria;
        this.cover = cover;
        this.titulo = titulo;
        this.año = año;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(ArrayList<String> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Book{" + "categoria=" + categoria + ", cover=" + cover + ", titulo=" + titulo + ", listaAutores=" + listaAutores + ", a\u00f1o=" + año + ", precio=" + precio + '}';
    }
    
    
    
    
}
