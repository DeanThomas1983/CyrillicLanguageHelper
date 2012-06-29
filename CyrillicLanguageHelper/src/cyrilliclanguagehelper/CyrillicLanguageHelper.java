/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

/**
 * Icons "cc_mono_icon_set_png" from gentleface.com
 */

/**
 * Cyrillic Language Helper
 * @decription An application designed to assist in the learning of languages
 * written in the Cyrillic character set
 * @author Dean Thomas
 * @version 0.1
 */
public class CyrillicLanguageHelper {

    //  MVC variables
    private static DataModel dataModel;
    private static MainViewController mainViewController;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dataModel = new DataModel();
        mainViewController = new MainViewController(dataModel);
    }
}
