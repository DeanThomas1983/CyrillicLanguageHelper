/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

/**
 * @class DataModel
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
}
