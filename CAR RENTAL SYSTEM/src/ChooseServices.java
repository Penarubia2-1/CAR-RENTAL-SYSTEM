/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
@author Imperial Jurie
 */

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author jurie imperial
 */
public class ChooseServices extends JFrame{
    private JFrame frame = new JFrame("Homepage");
    private JLabel lblCarRentalSystem;
    private JButton btnAvailableVehicle,btnReservation,btnOtherservices,btnback;
   
    
    ChooseServices(){
     frame.setSize(600,500);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
     lblCarRentalSystem = new JLabel("CAR RENTAL SYSTEM");
     lblCarRentalSystem.setBounds(150,50,300,30);
     lblCarRentalSystem.setFont(new Font("Arial", Font.BOLD, 25));
     
     
     btnAvailableVehicle = new JButton("AVAILABLE VEHICLE");
     btnAvailableVehicle.setBounds(180,100, 200,40 );
     btnAvailableVehicle.setFont(new Font("Arial", Font.BOLD,15));
     
     btnReservation = new JButton("RESERVATION");
     btnReservation.setBounds(180,160, 200,40);
     btnReservation.setFont(new Font("Arial", Font.BOLD,15));
   
     btnOtherservices = new JButton("OTHER SERVICES");
     btnOtherservices.setBounds(180,220,200, 40);
     btnOtherservices.setFont(new Font("Arial", Font.BOLD,15));
     
     btnback = new JButton("BACK");
     btnback.setBounds(210,300,150, 30);
     btnback.setFont(new Font("Arial", Font.BOLD,15));
     
     
    
     
     
     frame.add(btnOtherservices);
     frame.add(lblCarRentalSystem);
     frame.add(btnAvailableVehicle);
     frame.add(btnReservation);
     frame.add(btnback);
     
     frame.setVisible(true);
     frame.setResizable(false);
        
        
        
     
     
     
     
     
     
     
     
     
 
        
        
        } 
 
 
 
 
 
    
    
    
}