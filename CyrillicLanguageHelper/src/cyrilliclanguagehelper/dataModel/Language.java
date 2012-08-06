/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper.dataModel;

import java.io.File;
import java.util.ArrayList;

/**
 * @class Language
 * @description Provide a holder for the alphabet and groups of associated
 * translations for a particular Cyrillic language
 * @author Dean Thomas
 */
public class Language extends ArrayList<WordCollection> {
    private Alphabet alphabet;
    private File fileName;
    private XMLParser xmlParser;
    
    
    public ArrayList<String> getCollectionTitles()
    {
        ArrayList<String> result = new ArrayList<>();
        
        for (WordCollection w : this)
        {
            result.add(w.getTitle());
        }
        
        return result;
    }
    
    /**
     * Default constructor
     * 
     * Create an empty language structure
     */
    public Language()
    {
        System.out.println("New language object created");
        
        this.alphabet = new Alphabet();
        
        xmlParser = new XMLParser(this);
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
     * Dump the entire contents of the object to the console
     */
    public void dumpToConsole()
    {
        System.out.println("Language dump");
        
        this.getAlphabet().dumpToConsole();
        
        for (WordCollection wordCollection: this)
        {
            wordCollection.dumpToConsole();
        }
    }

    /**
     * Return the alphabet database
     * @return the alphabet
     */
    public Alphabet getAlphabet() {
        return alphabet;
    }
}
