/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper.dataModel;

import cyrilliclanguagehelper.dataModel.Letter;
import java.util.ArrayList;

/**
 * @class Alphabet 
 * @description Provide a list of letters to associate with a particular 
 * language 
 * @author Dean Thomas
 */
public class Alphabet extends ArrayList<Letter> {
    /**
     * Default constructor
     */ 
    public Alphabet()
    {
        System.out.println("New Alphabet object created");
    }
    
    public void dumpToConsole()
    {
        for (Letter l : this)
        {
            l.dumpToConsole();
        }
    }
}
