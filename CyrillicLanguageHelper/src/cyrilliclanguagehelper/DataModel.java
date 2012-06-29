/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

import cyrilliclanguagehelper.dataModel.LanguageList;

/**
 * @class DataModel
 * @description Top level class to hold the entire data-model for the 
 * application
 * @author Dean Thomas
 */
public class DataModel {
    private LanguageList languageList;
    
    /**
     * Create a new DataModel
     */
    public DataModel()
    {
        System.out.println("New DataModel created");
        
        languageList = new LanguageList();
    }

    /**
     * Return a list of all the languages held in the data-model
     * @return the languageList
     */
    public LanguageList getLanguageList() {
        return languageList;
    }
}
