
import java.awt.EventQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class ChooseServicesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
  EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ChooseServices cs = new ChooseServices();
                cs.setVisible(true);         
            }
            
         });
      }
}
    
    

