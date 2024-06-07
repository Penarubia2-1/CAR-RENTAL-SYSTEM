/*
 * To change this license header, cho               ose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
author CALAGOS
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener{ 
    private JFrame frame = new JFrame("LogIn");
    private JLabel lblEmail,lblPassword,lblResult, lblLogin;
    private JTextField txtfldEmail = new JTextField();
    private JPasswordField psswrdfldPassword = new JPasswordField();
    private JButton btnLogin,btnExit;
    
    Login(){
     frame.setSize(600,500);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     lblLogin = new JLabel("LOG IN YOUR ACCOUNT");
     lblLogin.setBounds(195 ,60 ,300 , 30 );
     lblLogin.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblEmail = new JLabel("Email:");
     lblEmail.setBounds(100 ,140 ,90 , 30 );
     lblEmail.setFont(new Font("Arial", Font.BOLD, 20));
     
     lblPassword = new JLabel("Password:");
     lblPassword.setBounds(100 ,190 ,120 , 30 );
     lblPassword.setFont(new Font("Arial", Font.BOLD, 20));
     
     txtfldEmail.setBounds(210, 140, 240 ,30);
     txtfldEmail.setFont(new Font("Arial", Font.BOLD, 20));
     
     psswrdfldPassword.setBounds(210, 190, 240 ,30);
     psswrdfldPassword.setFont(new Font("Arial", Font.BOLD, 20));
     
     btnLogin = new JButton("LOG IN");
     btnLogin.setBounds(300,250,120,30);
     btnLogin.setFont(new Font("Arial", Font.BOLD, 18));
     
     
     btnExit = new JButton("BACK");
     btnExit.setBounds(130,250,120,30);
     btnExit.setFont(new Font("Arial", Font.BOLD,18));
     
     
     
         frame.add(lblEmail);
         frame.add(lblPassword);
         frame.add(txtfldEmail);
         frame.add(psswrdfldPassword);
         frame.add(btnLogin);
         frame.add(btnExit);
         frame.add(lblLogin);
         
         frame.setVisible(true);
         frame.setResizable(false);
     
         
     
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     

    
    
}
