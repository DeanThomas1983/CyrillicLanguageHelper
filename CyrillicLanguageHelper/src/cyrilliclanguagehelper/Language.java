/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

import java.io.File;
import java.util.ArrayList;
import java.util.jar.Attributes;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 * @class Language
 * @author Dean Thomas
 */
public class Language extends ArrayList {
    private File fileName;
    private XMLParser xmlParser;
    private ArrayList<WordCollection> wordCollections;
    
    /**
     * Default constructor
     * 
     * Create an empty language structure
     */
    public Language()
    {
        System.out.println("New language object created");
        
        xmlParser = new XMLParser(this);
        wordCollections = new ArrayList<>();
    }
    
    /** Load a language definition from an XML document
     * 
     * @param fileName the XML document containing the definitions
     */
    public Language(File fileName)
    {
        this();
     
        this.fileName = fileName;
        
        System.out.println(this.fileName.getName());
        
        xmlParser.parseXMLFile(fileName);
    }

    /**
     * @return the wordCollections
     */
    public ArrayList<WordCollection> getWordCollections() {
        return wordCollections;
    }

    /**
     * @param wordCollections the wordCollections to set
     */
    public void setWordCollections(ArrayList<WordCollection> wordCollections) {
        this.wordCollections = wordCollections;
    }
    
    
}
