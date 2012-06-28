/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

/**
 * @class Letter
 * @author Dean Thomas
 */
public class Letter {
    private char englishUpper;
    private char englishLower;
    private char cyrillicUpper;
    private char cyrillicLower;
    private String example; 
    /**
     * Default constructor
     */
    public Letter()
    {
        
    }

    public Letter(char englishUpper,
            char englishLower,
            char cyrillicUpper,
            char cyrillicLower,
            String example)
    {
        this.englishUpper = englishUpper;
        this.englishLower = englishLower;
        this.cyrillicLower = cyrillicLower;
        this.cyrillicUpper = cyrillicUpper;
        this.example = example;
    }
    
    /**
     * @return the englishUpper
     */
    public char getEnglishUpper() {
        return englishUpper;
    }

    /**
     * @return the englishLower
     */
    public char getEnglishLower() {
        return englishLower;
    }

    /**
     * @return the cyrillicUpper
     */
    public char getCyrillicUpper() {
        return cyrillicUpper;
    }

    /**
     * @return the cyrillicLower
     */
    public char getCyrillicLower() {
        return cyrillicLower;
    }

    /**
     * @return the example
     */
    public String getExample() {
        return example;
    }
    
    
}
