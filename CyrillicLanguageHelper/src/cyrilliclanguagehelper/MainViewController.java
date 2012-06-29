/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

import cyrilliclanguagehelper.DataModel;
import cyrilliclanguagehelper.viewControllers.AlphabetFormViewController;
import cyrilliclanguagehelper.viewControllers.LetterFlashcardFormViewController;

/**
 * @class MainViewController
 * @description Top level view controller used to initiate and control
 * sub-view controller classes
 * @author Dean Thomas
 */
public class MainViewController {
    private DataModel dataModel;
    private LetterFlashcardFormViewController letterFormViewController;
    private AlphabetFormViewController alphabetFormViewController;
    
    public MainViewController()
    {
        System.out.println("MainViewController created");
    }

    public MainViewController(DataModel dataModel) {
        this();
        
        this.dataModel = dataModel;
        
        letterFormViewController = 
                new LetterFlashcardFormViewController(this.dataModel);
        alphabetFormViewController = 
                new AlphabetFormViewController(this.dataModel);
        
        letterFormViewController.setVisible(true);
        alphabetFormViewController.setVisible(true);
    }
}
