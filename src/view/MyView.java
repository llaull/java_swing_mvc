package view;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author moi
 */
public class MyView extends JFrame{

    private JPanel panelA;
    private JLabel lbText;
    private JButton btOn;
    private JButton btOff;
    
    /**
     * constructeur
     */
    public MyView() { 
        System.out.println("MyView loaded.");
        panelA = new JPanel();
         panelA.add(lbText);
        panelA.add(btOn);
        panelA.add(btOff);
        
       // builddUI();
    }
    
    /**
     * 
     */
    private void builddUI(){
        System.out.println("builddUI loaded.");
         
        
        
        panelA.add(lbText);
        panelA.add(btOn);
        panelA.add(btOff);
        
       /* setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelA.setLayout(new FlowLayout());
        setLocation(200,200);
	//pack();
        setVisible(true);*/
        
    }
    /**
     * 
     * @return 
     */
    public boolean refreshView(){
        
        return true;
        
    }
    
    
    
}
