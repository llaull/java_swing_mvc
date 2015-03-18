package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.MyModel;
import view.MyView;

/**
 *
 * @author moi
 */
public class BtOffController implements ActionListener{
    
    private MyModel model;
    private MyView view;

    /**
     * 
     * @param model
     * @param view 
     */
    public BtOffController(MyModel model, MyView view) {
        this.model = model;
        this.view = view;
    }
    
    /**
    * 
    * @param evt 
    */
    @Override
    public void actionPerformed(ActionEvent evt){
        model.setOn(false);
        view.refreshView(false);
        
    }
    
}
