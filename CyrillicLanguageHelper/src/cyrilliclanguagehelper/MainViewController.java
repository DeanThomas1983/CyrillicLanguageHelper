/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

/**
 * @class MainViewController
 * @description Top level view controller used to initiate and control
 * sub-view controller classes
 * @author Dean Thomas
 */
public class MainViewController {
    private DataModel dataModel;
    private LetterFormViewController letterFormViewController;
    private AlphabetFormViewController alphabetFormViewController;
    
    public MainViewController()
    {
        System.out.println("MainViewController created");
    }

    MainViewController(DataModel dataModel) {
        this();
        
        this.dataModel = dataModel;
        
        letterFormViewController = 
                new LetterFormViewController(this.dataModel);
        alphabetFormViewController = 
                new AlphabetFormViewController(this.dataModel);
        
        letterFormViewController.setVisible(true);
        alphabetFormViewController.setVisible(true);
    }
}
