/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

import java.io.File;
import java.io.IOException;
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
    
    private Boolean data;
    private Boolean wordCollection;
    private String tmp;
    
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
            
            sp.parse(xmlFile.toString(), this);
            
        }
        catch (SAXException | ParserConfigurationException | IOException se)
        {
            se.printStackTrace();
        }
    }
    
    @Override
    public void startDocument()
    {
        System.out.println("Starting document");
        
        data = false;
        wordCollection = false;
    }
    
    @Override
    public void characters(char [] ac, int i, int j) throws SAXException
    {
        tmp = new String(ac, i, j);
    }
    
    @Override
    public void startElement(String s, 
            String s1, 
            String elementName,
            Attributes attributes) throws SAXException
    {
        System.out.println("Found new element: " + elementName);
        
        if (elementName.equals("data"))
        {
            data = true;
        }
        
        if (elementName.equalsIgnoreCase("WordCollection"))
        {
            wordCollection = true;
            
            System.out.println("Word collection: " + attributes.getValue("title"));
        }
        
    }
    
    @Override
    public void endElement(String s,
        String s1,
        String elementName)
    {
        System.out.println("End of element: " + elementName);
        
        if (elementName.equals("data"))
        {
            data = false;
        }
        
        if (elementName.equals("WordCollection"))
        {
            wordCollection = false;
        }
    }
}
