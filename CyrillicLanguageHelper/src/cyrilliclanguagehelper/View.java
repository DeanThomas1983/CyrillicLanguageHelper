/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

/**
 *
 * @author dean
 */
public class View {
    private DataModel dataModel;
    private LetterForm letterForm;
    
    public View()
    {
        
    }

    View(DataModel dataModel) {
        this.dataModel = dataModel;
        
        letterForm = new LetterForm(dataModel);
        
        letterForm.setVisible(true);
    }
}
