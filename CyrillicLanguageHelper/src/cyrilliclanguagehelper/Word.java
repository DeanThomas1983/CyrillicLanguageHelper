/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

/**
 * @class Word
 * 
 * @author Dean Thomas
 */
public class Word {
    private String english;
    private String bulgarian;
    private String phonetic;
    
    public void dumpToConsole()
    {
        System.out.println(english
                + " - "
                + bulgarian
                + " - "
                + phonetic);
    }
    
    public Word()
    {
        System.out.println("New word created");
    }

    /**
     * @return the english
     */
    public String getEnglish() {
        return english;
    }

    /**
     * @param english the english to set
     */
    public void setEnglish(String english) {
        this.english = english;
    }

    /**
     * @return the bulgarian
     */
    public String getBulgarian() {
        return bulgarian;
    }

    /**
     * @param bulgarian the bulgarian to set
     */
    public void setBulgarian(String bulgarian) {
        this.bulgarian = bulgarian;
    }

    /**
     * @return the phonetic
     */
    public String getPhonetic() {
        return phonetic;
    }

    /**
     * @param phonetic the phonetic to set
     */
    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }
}
