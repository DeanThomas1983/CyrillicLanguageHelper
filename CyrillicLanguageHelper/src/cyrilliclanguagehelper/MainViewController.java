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
    
    public MainViewController()
    {
        System.out.print("MainViewController created");
    }

    MainViewController(DataModel dataModel) {
        this();
        
        this.dataModel = dataModel;
        
        letterFormViewController = new LetterFormViewController(this.dataModel);
        
        letterFormViewController.setVisible(true);
    }
}
