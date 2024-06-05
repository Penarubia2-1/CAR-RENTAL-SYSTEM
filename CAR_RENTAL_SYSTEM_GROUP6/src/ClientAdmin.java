/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author IMPERIAL JURIE
 */
public class ClientAdmin {
   JFrame frame = new JFrame("Client/Admin");
    private JLabel lblYouAreA = new JLabel();
    private JButton btnClient,btnAdmin;
    
   ClientAdmin(){
       
     frame.setSize(300,280);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     lblYouAreA = new JLabel("Are You A??");
     lblYouAreA.setBounds(80, 50, 150,20);
     lblYouAreA.setFont(new Font("Arial", Font.BOLD,20));
     
     btnClient = new JButton("Client");
     btnClient.setBounds(50,80,180,40);
     btnClient.setFont(new Font("Arial", Font.PLAIN,20));
     
     btnAdmin = new JButton("Admin");
     btnAdmin.setBounds(50, 140, 180, 40);
     btnAdmin.setFont(new Font("Arial", Font.PLAIN,20));
     
     
     frame.add(lblYouAreA);
     frame.add(btnClient);
     frame.add(btnAdmin);
     frame.setVisible(true);
     frame.setResizable(false);
     
     
     
       
   }
    
}