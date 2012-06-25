/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @class XMLParser
 * @author Dean Thomas
 */
public class XMLParser extends DefaultHandler {
    /**
     * Default constructor
     */
    public XMLParser()
    {
        System.out.println("Created XML parser");
        
    }
    
    /**
     * Parse the specified XML file
     * @param xmlFile the file to be parsed
     */
    public void parseXMLFile(File xmlFile)
    {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        
        try
        {
            SAXParser sp = spf.newSAXParser();
            
            System.out.println("Parsing " + xmlFile.getName());
            
            sp.parse(xmlFile.getName(), this);
            
        }
        catch (SAXException | ParserConfigurationException | IOException se)
        {
            se.printStackTrace();
        }
    }
    
    @Override
    public void startElement(String s, 
            String s1, 
            String elementName,
            Attributes attributes) throws SAXException
    {
        System.out.println("Found new element: " + elementName);
    }
}
