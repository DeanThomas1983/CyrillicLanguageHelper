/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

import java.io.File;
import java.util.ArrayList;

/**
 * @class Language
 * @author Dean Thomas
 */
public class Language extends ArrayList {
    private File fileName;
    
    /**
     * Default constructor
     * 
     * Create an empty language structure
     */
    public Language()
    {
        System.out.println("New language object created");
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
        
        parseXMLFile();
    }
    
    //  TODO: move this to a separate class?
    private void parseXMLFile()
    {
        
    }
}
