package model;

import java.io.*;
import java.util.ArrayList;

/**
 * inputStream => lecture
 * outpurStream => ecriture
 * @author moi
 */
public class IoTest {
        
    public IoTest() {
        write();
        action();
        //WriteObject();
        ReadObject();
        System.out.println("IoTest loader");
    }
    
    public static void write(){
        
        GameCharcaterModel g1 = new GameCharcaterModel(999,"toto");
        GameCharcaterModel g2 = new GameCharcaterModel(0,"tata");
        
        try {
            
            File mFile = new File("plop.txt");
            FileWriter fileW = new FileWriter(mFile);
            BufferedWriter writer = new BufferedWriter(fileW); 
            
            String s = "n:"+g1.getType()+"*"+"Power:"+g1.getPower()+"\n";
            s += "n:"+g2.getType()+"*"+"Power:"+g2.getPower()+"\n";
            
            try {
                writer.write(s);
            } finally{ writer.close(); }
            
            
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        
        
    }
    
    public static void WriteObject(){
        
        GameCharcaterModel gv1 = new GameCharcaterModel(999,"toto");
        GameCharcaterModel gv2 = new GameCharcaterModel(0,"tata");      
        
        try {
            
            FileOutputStream fileS = new FileOutputStream("g.obj");
            ObjectOutputStream os = new ObjectOutputStream(fileS);
            
            try {
                os.writeObject(gv1);
                os.writeObject(gv2);
            } finally { os.close();}
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void ReadObject(){
        ArrayList<GameCharcaterModel> gcList = new ArrayList<>();
        
        //GameCharcaterModel gc;
        try {
            
            FileInputStream fileS = new FileInputStream("g.obj");
            ObjectInputStream ici = new ObjectInputStream(fileS);
            
            try {
                
                for (int i = 0; i < 2; i++) {
                    gcList.add((GameCharcaterModel)ici.readObject()); //caste en GameCharcaterModel
                }
                
            } finally { ici.close();}
            
        
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        catch (ClassNotFoundException exx){
            System.out.println(exx);
        }

        
    }
    
    public static void action(){
        System.out.println("action loader");
        
        try{

            File myFile = new File("plop.txt");
            FileReader fileR = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileR); //coup du chariot dans le supermarché

            String line;

            /**/
            try {

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } finally {reader.close();}
            /**/

        } catch(IOException e){
            
            System.out.println(e.getMessage());
            
        }
    }
}
