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
 * @description Provide the ability to parse an XML language file
 * @author Dean Thomas
 */
public class XMLParser extends DefaultHandler {
    //  Section headers
    private Boolean alphabet;
    private Boolean data;
    //  Top level langauge object
    private Language language;
    //  Lower level wordCollection / word objects
    private WordCollection wordCollection;
    private Word word;
    //  Lower level letter objects
    private Letter letter;
    //  Are we dealing with English or Cyrillic character
    private Boolean cyrillic;
    
    //  Text buffer
    private String dataString;
    
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
    
    /**
     * Start parsing the document
     */
    @Override
    public void startDocument()
    {
        System.out.println("Starting document");
        
        data = false;
        alphabet = false;
        cyrillic = false;
    }
    
    /**
     * Parser has detected characters
     * @param characters the characters received
     * @param start the start position of the characters
     * @param length the length of the character string
     * @throws SAXException 
     */
    @Override
    public void characters(char [] characters, 
        int start, 
        int length) throws SAXException
    {
        dataString = new String(characters, start, length);
    }
    
    @Override
    public void startElement(String s, 
            String s1, 
            String elementName,
            Attributes attributes) throws SAXException
    {
        if (elementName.equalsIgnoreCase("bulgarian"))
        {
            cyrillic = true;
        }
        
        if (elementName.equalsIgnoreCase("english"))
        {
            cyrillic = false;
        }
        
        if (elementName.equalsIgnoreCase("data"))
        {
            data = true;
        }
        
        if (elementName.equalsIgnoreCase("alphabet"))
        {
            alphabet = true;
        }
        
        if (elementName.equalsIgnoreCase("WordCollection"))
        {
            wordCollection = new WordCollection(attributes.getValue("title"));
        }
        
        if (elementName.equalsIgnoreCase("Word"))
        {
            word = new Word();
        }
        
        if (elementName.equalsIgnoreCase("Letter"))
        {
            letter = new Letter();
        }
    }
    
    @Override
    public void endElement(String s,
        String s1,
        String elementName)
    {
        if (elementName.equalsIgnoreCase("Example"))
        {
            letter.setExample(dataString);
        }
        
        if (elementName.equalsIgnoreCase("Uppercase"))
        {
            if (cyrillic)
                letter.setCyrillicUpper(dataString);
            else
                letter.setEnglishUpper(dataString);
        }
        
        if (elementName.equalsIgnoreCase("Lowercase"))
        {
            if (cyrillic)
                letter.setCyrillicLower(dataString);
            else
                letter.setEnglishLower(dataString);
        }
        
        if (elementName.equalsIgnoreCase("alphabet"))
        {
            alphabet = false;
        }
        
        if (elementName.equalsIgnoreCase("data"))
        {
            data = false;
        }
        
        if (elementName.equalsIgnoreCase("letter"))
        {
            if (alphabet)
                this.language.getAlphabet().add(letter);
        }
        
        if (elementName.equalsIgnoreCase("WordCollection"))
        {
            if (data)
                this.language.add(wordCollection);
        }
        
        if (elementName.equalsIgnoreCase("Word"))
        {
            if (data)
                wordCollection.add(word);
        }
        
        if (elementName.equalsIgnoreCase("English"))
        {
            if (data)
                word.setEnglish(dataString);
        }
        
        if (elementName.equalsIgnoreCase("Bulgarian"))
        {
            if (data)
                word.setBulgarian(dataString);
        }
        
        if (elementName.equalsIgnoreCase("Phonetic"))
        {
            if (data)
                word.setPhonetic(dataString);
        }
    }
}
