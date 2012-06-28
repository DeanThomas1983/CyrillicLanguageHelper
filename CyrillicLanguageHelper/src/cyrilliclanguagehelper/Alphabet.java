/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

import java.util.ArrayList;

/**
 * @class Alphabet 
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
