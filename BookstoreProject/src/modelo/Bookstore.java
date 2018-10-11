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
public class Bookstore extends ArrayList<Book> {

    public Bookstore() {
    }

    public int getModCount() {
        return modCount;
    }

    public void setModCount(int modCount) {
        this.modCount = modCount;
    }

    @Override
    public String toString() {
        return "Este bookstore tiene " + this.size() + " libros";
    }

}
