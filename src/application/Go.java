package application;

import model.*;
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
        //new MyView(new MyModel()); 
       // new IoTest();
        
        

        Runnable joB = new ThreadModel();

        Thread myThread = new Thread(joB);

        myThread.start();
        
        
        for (int i = 0; i < 10000; i++) {
            System.out.println("ThreadModel go");
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("->" + i);
            }
        }
        
    }
    
}
