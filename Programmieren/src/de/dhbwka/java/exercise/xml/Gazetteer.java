package de.dhbwka.java.exercise.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Gazetteer {
    public static void main(String[] args) { 
        try { 
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
            DocumentBuilder parser = factory.newDocumentBuilder(); 
     
            String url = "https://maps.googleapis.com/maps/api/geocode/xml?address=karlsruhe&sensor=false"; 
            Document doc = parser.parse(url); 

            Element geoCodeResponse = doc.getDocumentElement();

            Node karlsruhe = geoCodeResponse.getElementsByTagName("formatted_address").item(0);
     
            // Name des Wurzelelements ausgeben 
            System.out.println(karlsruhe.getTextContent()); 
        } catch (Exception e) { 
            System.out.println(e.getMessage()); 
        } 
    }
}
