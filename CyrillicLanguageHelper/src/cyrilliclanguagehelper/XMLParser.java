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
    private Language language;
    private Boolean data;
    //private Boolean wordCollection;
    private String tmp;
    private Boolean english;
    private Boolean word;
    private boolean bulgarian;
    private boolean phonetic;
    private WordCollection wordCollection;
    /**
     * Default constructor
     */
    public XMLParser(Language language)
    {
        System.out.println("Created XML parser");
        
        this.language = language;
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
        //wordCollection = false;
        word = false;
        english = false;
    }
    
    @Override
    public void characters(char [] ac, int i, int j) throws SAXException
    {
        //if (data && wordCollection && word)
        //    tmp = new String(ac, i, j);
    }
    
    @Override
    public void startElement(String s, 
            String s1, 
            String elementName,
            Attributes attributes) throws SAXException
    {
        //System.out.println("Found new element: " + elementName);
        
        if (elementName.equalsIgnoreCase("data"))
        {
            data = true;
        }
        
        if (elementName.equalsIgnoreCase("WordCollection"))
        {
            //wordCollection = true;
            
            //System.out.println("Word collection: " + attributes.getValue("title"));
            
            wordCollection = new WordCollection(attributes.getValue("title"));
        }
        
        if (elementName.equalsIgnoreCase("Word"))
        {
            word = true;
            
            System.out.println("Found new word");
        }
        
        if (elementName.equalsIgnoreCase("English"))
        {
            english = true;
        }
        
        if (elementName.equalsIgnoreCase("Bulgarian"))
        {
            bulgarian = true;
        }
        
        if (elementName.equalsIgnoreCase("Phonetic"))
        {
            phonetic = true;
        }
    }
    
    @Override
    public void endElement(String s,
        String s1,
        String elementName)
    {
        System.out.println("End of element: " + elementName);
        
        System.out.println(tmp);
        
        if (elementName.equals("data"))
        {
            data = false;
        }
        
        if (elementName.equals("WordCollection"))
        {
            this.language.getWordCollections().add(wordCollection);
            //wordCollection = false;
        }
    }
}
