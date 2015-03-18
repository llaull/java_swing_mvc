package view;

import controller.BtOffController;
import controller.BtOnController;
import java.awt.*;
import javax.swing.*;
import model.MyModel;



/**
 *
 * @author moi
 */
public class MyView extends JFrame{

    private MyModel model;
    
    private JPanel panelA = new JPanel();
    private JLabel lText = new JLabel("clique");
    private JButton btOn = new JButton("On");
    private JButton btOff = new JButton("off");
    
    /**
     * constructeur
     * @param model
     */
    public MyView(MyModel model) { //MyModel model
        
        this.model = model;
        System.out.println("MyView loaded.");
        
        builddUI();
    }
    
    /**
     * 
     */
    private void builddUI(){
        System.out.println("builddUI loaded.");
         
        panelA.add(lText);
        panelA.add(btOn);
        panelA.add(btOff);
        add(panelA, BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLocation(200,200);
        setSize(800,600);
        setVisible(true);
        
        //gestion d'evenement
        BtOnController onController = new BtOnController(model, this);
        BtOffController offController = new BtOffController(model, this);
        
        btOn.addActionListener(onController);
        btOff.addActionListener(offController);
        
        getContentPane().add(panelA);
    }
    
    /** 
     * 
     * @param onState
     */
    public void refreshView(boolean onState){
        
        if (onState) {
            lText.setText(MyModel.ON_TXT);
        } else {
            lText.setText(MyModel.OFF_TXT);
        }
        
    }
    
    
    
}
