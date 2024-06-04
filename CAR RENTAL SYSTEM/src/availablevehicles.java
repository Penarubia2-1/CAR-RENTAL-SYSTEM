import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author John Mark Penarubia
 */
public class availablevehicles extends JFrame  implements ActionListener{
        private JLabel lblAvailableVehicle, lblTypes, lblChoose;  
        private JButton btnMuscle,btnSUV,btnVan,btnHatchback,btnPickup;
        
        
       availablevehicles(){
                   setTitle("Avaible Page");

       setSize(500,500);
       getContentPane().setBackground(Color.gray);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLayout(null);
       
       lblAvailableVehicle=new JLabel("AVAILABLE TYPES OF VEHICLE");
       lblAvailableVehicle.setBounds(110,20,300,30);
       lblAvailableVehicle.setFont(new Font("Arial", Font.BOLD,18));
       lblAvailableVehicle.setForeground(Color.WHITE);
       
       lblTypes=new JLabel("CHOOSE WHAT TYPE OF CAR:");
       lblTypes.setBounds(146,45,190,50);
       lblTypes.setFont(new Font("Arial", Font.BOLD,10));
       lblTypes.setForeground(Color.WHITE);

       
       //buttons
       btnMuscle = new JButton("MUSCLE CAR");
       btnMuscle.setBounds(142,85,160,50);
       btnMuscle.setBackground(Color.BLACK);
       btnMuscle.setForeground(Color.WHITE);

       btnSUV = new JButton("SUV CAR");
       btnSUV.setBounds(142,145,160,50); 
       btnSUV.setBackground(Color.BLACK);
       btnSUV.setForeground(Color.WHITE);

       
       btnVan = new JButton("VAN CAR");
       btnVan.setBounds(142,205,160,50);
       btnVan.setBackground(Color.BLACK);
       btnVan.setForeground(Color.WHITE);
       
       btnHatchback = new JButton("HATCHBACK CAR");
       btnHatchback.setBounds(142,265,160,50);
       btnHatchback.setBackground(Color.BLACK);
       btnHatchback.setForeground(Color.WHITE);
       
       btnPickup = new JButton("PICKUP CAR");
       btnPickup.setBounds(142,325,160,50);
       btnPickup.setBackground(Color.BLACK);
       btnPickup.setForeground(Color.WHITE);
      
       
       

       //f.add
       add(lblAvailableVehicle);
       add(lblTypes);
       add(btnMuscle);
       add(btnSUV);
       add(btnVan);
       add(btnHatchback);
       add(btnPickup);

        btnMuscle.addActionListener(this);
        btnSUV.addActionListener(this);
        btnVan.addActionListener(this);
        btnHatchback.addActionListener(this);
        btnPickup.addActionListener(this);
   }

    /**
     *
     * @param e
     */
    @Override
        public  void actionPerformed(ActionEvent e){
       dispose();
       if (e.getSource()==btnMuscle){
           MuscleCar mc=new MuscleCar();
           mc.setVisible(true);
       }
       if (e.getSource()==btnSUV){
           SUVCar sv= new SUVCar();
           sv.setVisible(true);
        }
       else if (e.getSource()==btnVan){
           VanCar vc= new VanCar();
           vc.setVisible(true);
         }
       else if (e.getSource()==btnHatchback){
           HatchbackCar hc= new HatchbackCar();
           hc.setVisible(true);
        }
      else if (e.getSource()==btnPickup){
           PickupCar pc= new PickupCar();
           pc.setVisible(true);
           
           
       }
        
        
}

}