/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

import java.util.ArrayList;

/**
 * @class WordCollection
 * @decription Used to represent a collection of similar word; 
 * e.g. days of the week
 * @author Dean Thomas
 */
public class WordCollection extends ArrayList {
    private String title;
    
    /**
     * Default constructor
     */
    public WordCollection(String title)
    {
        System.out.println("New word collection created");
        
        this.title = title;
    }
}
