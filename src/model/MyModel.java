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
    
    private boolean on;

    public MyModel(){}
    
    /**
     * getter
     * @return on
     */
    public boolean isOn(){
       return on;       
    }

    /**
     * setter
     * @param on 
     */
    public void setOn(boolean on){
       this.on = on;     
    }
    
}
