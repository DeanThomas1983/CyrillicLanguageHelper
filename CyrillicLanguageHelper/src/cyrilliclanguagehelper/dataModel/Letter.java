/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper.dataModel;

/**
 * @class Letter
 * @description Hold variables to represent a single character in English and
 * Cyrillic and an example of how the letter should sound phonetically
 * @author Dean Thomas
 */
public class Letter {
    private String englishUpper;
    private String englishLower;
    private String cyrillicUpper;
    private String cyrillicLower;
    private String example; 
    /**
     * Default constructor
     */
    public Letter()
    {
        System.out.println("New letter created");
    }

    public Letter(String englishUpper,
            String englishLower,
            String cyrillicUpper,
            String cyrillicLower,
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
    public String getEnglishUpper() {
        return englishUpper;
    }

    /**
     * @return the englishLower
     */
    public String getEnglishLower() {
        return englishLower;
    }

    /**
     * @return the cyrillicUpper
     */
    public String getCyrillicUpper() {
        return cyrillicUpper;
    }

    /**
     * @return the cyrillicLower
     */
    public String getCyrillicLower() {
        return cyrillicLower;
    }

    /**
     * @return the example
     */
    public String getExample() {
        return example;
    }

    /**
     * @param englishUpper the englishUpper to set
     */
    public void setEnglishUpper(String englishUpper) {
        this.englishUpper = englishUpper;
    }

    /**
     * @param englishLower the englishLower to set
     */
    public void setEnglishLower(String englishLower) {
        this.englishLower = englishLower;
    }

    /**
     * @param cyrillicUpper the cyrillicUpper to set
     */
    public void setCyrillicUpper(String cyrillicUpper) {
        this.cyrillicUpper = cyrillicUpper;
    }

    /**
     * @param cyrillicLower the cyrillicLower to set
     */
    public void setCyrillicLower(String cyrillicLower) {
        this.cyrillicLower = cyrillicLower;
    }

    /**
     * @param example the example to set
     */
    public void setExample(String example) {
        this.example = example;
    }

    void dumpToConsole() {
        System.out.println(this.englishUpper +
                this.englishLower + 
                " - " + 
                this.cyrillicUpper + 
                this.cyrillicLower);
    }
    
    
}
