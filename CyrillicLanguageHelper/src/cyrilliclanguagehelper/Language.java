/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

import java.util.ArrayList;

/**
 * @class Language
 * @author Dean Thomas
 */
public class Language extends ArrayList {
    private String title;
    
    /**
     * Default constructor
     * 
     * Create an empty language structure
     */
    public Language()
    {
        System.out.println("New language object created");
    }
    
    /**
     * Load from XML
     * 
     * Load a language definition from an XML document
     * 
     * @param fileName the XML document containing the definitions
     */
    public Language(String fileName)
    {
        this();
     
        this.title = fileName;
    }
}
