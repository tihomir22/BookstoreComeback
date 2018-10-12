/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.xml.soap.Node;
import modelo.Book;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author mati
 */
public class ControlBook extends ControlDom {

    public ControlBook() {
    }

    public Book leerBook(Document doc, Element book) {
        Book libro = new Book();
        Constantes cons = new Constantes();
        String titulo, autor, año, precio;

        NodeList contenidoLibro = book.getChildNodes();
        for (int i = 0; i < contenidoLibro.getLength(); i++) {

            if (contenidoLibro.item(i).getNodeType() == Node.ELEMENT_NODE) {

                if (contenidoLibro.item(i).getNodeName().equalsIgnoreCase(cons.ET_AUTOR)) {
                    autor = contenidoLibro.item(i).getTextContent();
                    libro.getListaAutores().add(autor);
                }
                if (contenidoLibro.item(i).getNodeName().equalsIgnoreCase(cons.ET_AÑO)) {
                    año = contenidoLibro.item(i).getTextContent();
                    libro.setAño(año);
                }
                if (contenidoLibro.item(i).getNodeName().equalsIgnoreCase(cons.ET_PRECIO)) {
                    precio = contenidoLibro.item(i).getTextContent();
                    libro.setPrecio(precio);
                }
                if (contenidoLibro.item(i).getNodeName().equalsIgnoreCase(cons.ET_TITULO)) {
                    titulo = contenidoLibro.item(i).getTextContent();
                    libro.setTitulo(titulo);
                }
            }
        }
        libro.setCategoria(book.getAttribute("category"));
        libro.setCover(book.getAttribute("cover"));
        return libro;
    }

    public void escribirBook(Document doc, Element book, Book libro) {
        
        Element title = doc.createElement("title");
        title.appendChild(doc.createTextNode(libro.getTitulo()));
        book.appendChild(title);
        for (int i = 0; i < libro.getListaAutores().size(); i++) {
            Element autor = doc.createElement("author");
            autor.appendChild(doc.createTextNode(libro.getListaAutores().get(i)));
            book.appendChild(autor);
        }
        Element year = doc.createElement("year");
        year.appendChild(doc.createTextNode(libro.getAño()));
        book.appendChild(year);

        Element price = doc.createElement("price");
        price.appendChild(doc.createTextNode(libro.getPrecio()));
        book.appendChild(price);
    }

}
