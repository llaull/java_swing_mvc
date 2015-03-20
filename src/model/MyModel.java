package model;

import java.awt.Color;

/**
 *
 * @author moi
 */
public class MyModel {
    
    //final = constance (en maj) / ne peut pas etre redifini
    public static final String ON_TXT = "jour";
    public static final String OFF_TXT = "nuit";
    public static final Color ON_COLOR = Color.YELLOW;
    public static final Color OFF_COLOR = Color.GRAY;

    static void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean on;

    public MyModel(){}
    
    public MyModel(boolean state){
        on = state;
    }
    
    /**
     * getter / asseceur
     * @return on
     */
    public boolean isOn(){
       return on;       
    }

    /**
     * setter / mutator
     * @param on 
     */
    public void setOn(boolean on){
       this.on = on;     
    }
    
}
