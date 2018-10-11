/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlDom;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author mati
 */
public class BookstoreProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        Scanner teclado = new Scanner(System.in);
        ControlDom ctrlDoc = new ControlDom();
        Document doc = null;
        int opcion = 999;
        String ruta = "";
        while (opcion != 0) {
            mostrarMenu();
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce ruta del fichero o dejalo en blanco usar la por defecto");
                    ruta = teclado.nextLine();
                    if (ruta != "") {
                        doc = ctrlDoc.deXMLaDOM(doc, new File("bookstore.xml"));
                    } else {
                        doc = ctrlDoc.deXMLaDOM(doc, new File(ruta));
                    }
                    break;
                case 2:

                    break;

                case 3:

                    break;
            }
        }

    }

    public static void mostrarMenu() {
        System.out.println("1.-Seleccionar un fichero xml a recuperar y crea un document");
        System.out.println("2.-Lee del documento y crea un objeto BookStore");
    }
}
