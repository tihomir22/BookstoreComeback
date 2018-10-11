/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import modelo.Bookstore;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author mati
 */
public class ControlBookstore extends ControlDom {

    Bookstore bs;

    public Document recuperar(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
        Document doc = null;
        doc = deXMLaDOM(doc, xmlFile);
        return doc;
    }

    public void almacenar(Document doc, File archivoDestino) throws TransformerException {
        deDOMaXML(doc, archivoDestino);
    }

    public Bookstore leerBookstore(Document doc) {
        Element raiz = doc.getDocumentElement();
        NodeList listaLibros = raiz.getChildNodes();
        for (int i = 0; i < listaLibros.getLength(); i++) {
            if (listaLibros.item(i).getNodeType() == Node.ELEMENT_NODE) {
                
            }
        }
        

    }

}
