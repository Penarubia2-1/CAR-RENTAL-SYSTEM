/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author IMPERIAL JURIE
 */
public class ClientAdmin extends JFrame implements ActionListener  {
    private JLabel lblYouAreA = new JLabel();
    private JButton btnClient,btnAdmin;
    private JLabel lbltitle;
    
   ClientAdmin(){
        setTitle("Client or Admin");
        setSize(800,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);


        lbltitle = new JLabel("WELCOME TO OUR CAR RENTAL SYSTEM ");
        lbltitle.setBounds(50, 90, 450,20);
        lbltitle.setFont(new Font("Arial", Font.BOLD,15));
        lbltitle.setForeground(Color.white);


        lblYouAreA = new JLabel("Are You A?");
        lblYouAreA.setBounds(148, 130, 150,20);
        lblYouAreA.setFont(new Font("Arial", Font.BOLD,15));
        lblYouAreA.setForeground(Color.white);


        btnClient = new JButton("CLIENT");
        btnClient.setBounds(100,170,180,40);
        btnClient.setFont(new Font("Arial", Font.BOLD,20));
        btnClient.setForeground(Color.black);


        btnAdmin = new JButton("ADMIN");
        btnAdmin.setBounds(100, 230, 180, 40);
        btnAdmin.setFont(new Font("Arial", Font.BOLD,20));
        btnAdmin.setForeground(Color.black);
     
     
        add(lbltitle);
        add(lblYouAreA);
        add(btnClient);
        add(btnAdmin);

        btnClient.addActionListener(this);
        btnAdmin.addActionListener(this);
       
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnClient){
            Login lg=new Login();
                lg.setVisible(true);
        }
        else if(e.getSource()==btnAdmin){
            Login lg=new Login();
            lg.setVisible(true);
        }
    }
    
}