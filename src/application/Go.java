package application;

import model.MyModel;
import view.MyView;
/**
 *
 * @author moi
 */
public class Go {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MyView(new MyModel()); 
    }
    
}
