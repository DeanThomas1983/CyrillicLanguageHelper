/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

/**
 *
 * @author dean
 */
public class MainViewController {
    private DataModel dataModel;
    private LetterFormViewController letterFormViewController;
    
    public MainViewController()
    {
        
    }

    MainViewController(DataModel dataModel) {
        this.dataModel = dataModel;
        
        letterFormViewController = new LetterFormViewController(dataModel);
        
        letterFormViewController.setVisible(true);
    }
}
