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
    
    /**
     * Dump the entire contents of the object to the console
     */
    public void dumpToConsole()
    {
        System.out.println(english
                + " - "
                + bulgarian
                + " - "
                + phonetic);
    }
    
    /**
     * Default constructor
     */
    public Word()
    {
        System.out.println("New word created");
    }

    /**
     * Return the English definition of the word
     * @return String; the word in English
     */
    public String getEnglish() {
        return english;
    }

    /**
     * Set the English definition of the word
     * @param english the definition to set
     */
    public void setEnglish(String english) {
        this.english = english;
    }

    /**
     * Return the Bulgarian definition of the word
     * @return String; the word in Bulgarian
     */
    public String getBulgarian() {
        return bulgarian;
    }

    /**
     * Set the Bulgarian definition of the word
     * @param bulgarian the definition to set
     */
    public void setBulgarian(String bulgarian) {
        this.bulgarian = bulgarian;
    }

    /**
     * Return the phonetic definition of the word
     * @return String; the word as its phonetic definition
     */
    public String getPhonetic() {
        return phonetic;
    }

    /**
     * Set the phonetic definition of the word
     * @param phonetic the definition to set
     */
    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }
}
