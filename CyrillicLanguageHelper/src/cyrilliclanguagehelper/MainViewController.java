/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

import cyrilliclanguagehelper.viewControllers.AlphabetFormViewController;
import cyrilliclanguagehelper.viewControllers.LetterFlashcardFormViewController;
import cyrilliclanguagehelper.viewControllers.MatchFormViewController;

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
    private MatchFormViewController matchFormViewController;
    
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
        matchFormViewController =
                new MatchFormViewController(this.dataModel);
        
        letterFormViewController.setVisible(true);
        alphabetFormViewController.setVisible(true);
        matchFormViewController.setVisible(true);
    }
}
