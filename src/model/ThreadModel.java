package model;

/**
 *
 * @author Moi
 */
public class ThreadModel implements Runnable{

   /* public ThreadModel() {
        
        System.out.println("ThreadModel go");
        
        Runnable joB = new ThreadModel();
        
        //MyModel.start();
        
        Thread myThread = new Thread(joB);
        
    }*/
    
    

    @Override
    public void run() {
        go();
        doMore();
    }
    
    public void go(){
        
    }
        
    public void doMore(){
        
        
        for (int i = 0; i < 10000; i++) {
           System.out.println("Top of the stack");
           
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("->" + i);
            }
        }
        
    }
    
}
