/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper.dataModel;

import java.util.ArrayList;

/**
 * @class WordCollection
 * @decription Used to represent a collection of similar word; 
 * e.g. days of the week
 * @author Dean Thomas
 */
public class WordCollection extends ArrayList<Word> {
    private String title;
    
    /**
     * Default constructor
     */
    public WordCollection(String title)
    {
        System.out.println("New word collection created: " + title);
        
        this.title = title;
    }
    
    /**
     * Dump the entire contents of the object to the console
     */
    public void dumpToConsole()
    {
        System.out.println("Word collection dump: " + getTitle());
        
        for (Word word: this)
        {
            word.dumpToConsole();
        }
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
}
