
package event.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    String username;
    Dashboard(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH); //setSize(1800,700);
        setLayout(null);
        
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1600,65);
        p1.setBackground(new Color(255,253,208));
        add(p1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("event/management/system/icons/champ1.png"));
        Image i5 = i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(5,0,70,70);
        p1.add(l2);
        
        JLabel l3 = new JLabel("Dashboard");
        l3.setFont(new Font("Tahoma",Font.BOLD,30));
        l3.setForeground(Color.BLACK);
        l3.setBounds(80,10,300,40);
        p1.add(l3);
        
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,65,300,800);
        p2.setBackground(new Color(255,253,208));
        add(p2);
        
        b1 = new JButton("Add Personal Details");
        b1.setBackground(new Color(255,253,208));
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));
        b1.setBounds(0,0,300,50);
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("Update Personal Details");
        b2.setBackground(new Color(255,253,208));
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Tahoma",Font.PLAIN,20));
        b2.setBounds(0,50,300,50);
        b2.addActionListener(this);
        
        p2.add(b2);
        
        b3 = new JButton("View Details");
        b3.setBackground(new Color(255,253,208));
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Tahoma",Font.PLAIN,20));
        b3.setBounds(0,100,300,50);
        b3.addActionListener(this);
        p2.add(b3);
        
        b4 = new JButton("Delete Details");
        b4.setBackground(new Color(255,253,208));
        b4.setForeground(Color.BLACK);
        b4.setFont(new Font("Tahoma",Font.PLAIN,20));
        b4.setBounds(0,150,300,50);
        b4.addActionListener(this);
        p2.add(b4);
        
        b5 = new JButton("Check Package Details");
        b5.setBackground(new Color(255,253,208));
        b5.setForeground(Color.BLACK);
        b5.setFont(new Font("Tahoma",Font.PLAIN,20));
        b5.setBounds(0,200,300,50);
        b5.addActionListener(this);
        p2.add(b5);
        
        b6 = new JButton("Book Package");
        b6.setBackground(new Color(255,253,208));
        b6.setForeground(Color.BLACK);
        b6.setFont(new Font("Tahoma",Font.PLAIN,20));
        b6.setBounds(0,250,300,50);
        b6.addActionListener(this);
        p2.add(b6);
        
        b7 = new JButton("View Booked Package");
        b7.setBackground(new Color(255,253,208));
        b7.setForeground(Color.BLACK);
        b7.setFont(new Font("Tahoma",Font.PLAIN,20));
        b7.setBounds(0,300,300,50);
        b7.addActionListener(this);
        p2.add(b7);
        
        b8 = new JButton("View Venues");
        b8.setBackground(new Color(255,253,208));
        b8.setForeground(Color.BLACK);
        b8.setFont(new Font("Tahoma",Font.PLAIN,20));
        b8.setBounds(0,350,300,50);
        b8.addActionListener(this);
        p2.add(b8);
        
        b9 = new JButton("Book Venue");
        b9.setBackground(new Color(255,253,208));
        b9.setForeground(Color.BLACK);
        b9.setFont(new Font("Tahoma",Font.PLAIN,20));
        b9.setBounds(0,400,300,50);
        b9.addActionListener(this);
        p2.add(b9);
        
        b10 = new JButton("View Booked Venue");
        b10.setBackground(new Color(255,253,208));
        b10.setForeground(Color.BLACK);
        b10.setFont(new Font("Tahoma",Font.PLAIN,20));
        b10.setBounds(0,450,300,50);
        b10.addActionListener(this);
        p2.add(b10);
        
        b11 = new JButton("Payment");
        b11.setBackground(new Color(255,253,208));
        b11.setForeground(Color.BLACK);
        b11.setFont(new Font("Tahoma",Font.PLAIN,20));
        b11.setBounds(0,500,300,50);
        b11.addActionListener(this);
        p2.add(b11);
        
        b12 = new JButton("About");
        b12.setBackground(new Color(255,253,208));
        b12.setForeground(Color.BLACK);
        b12.setFont(new Font("Tahoma",Font.PLAIN,20));
        b12.setBounds(0,550,300,50);
        b12.addActionListener(this);
        p2.add(b12);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("event/management/system/icons/event1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1600,800);
        add(l1);
        
        
        JLabel l4 = new JLabel("Event Management System");
        l4.setBounds(600,100,650,70);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Tahoma",Font.PLAIN,50));
        l1.add(l4);
         
    }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
               new AddCustomer(username).setVisible(true);
            }else if(ae.getSource() == b2){
               new UpdateCustomer(username).setVisible(true);
            }else if(ae.getSource() == b3){
               new ViewCustomer(username).setVisible(true);
            }else if(ae.getSource() == b5){
                new CheckPackage().setVisible(true);
            }else if(ae.getSource() == b6){
                new BookPackage(username).setVisible(true);
            }else if(ae.getSource() == b6){
                    new BookPackage(username).setVisible(true);
            }else if(ae.getSource() == b7){
                    new ViewPackage(username).setVisible(true);
            }else if(ae.getSource() == b8){
                    new ViewVenues().setVisible(true);
            }else if(ae.getSource() == b9){
                    new BookHotel(username).setVisible(true);
            }else if(ae.getSource() == b10){
                    new ViewBookedVenue(username).setVisible(true);
            }else if(ae.getSource() == b11){
                    new Payment().setVisible(true);
            }else if(ae.getSource() == b12){
                    new About().setVisible(true);
            }else if(ae.getSource() == b4){
               new DeleteCustomer(username).setVisible(true);
            }
        }
    
        public static void main(String[] args){
        new Dashboard("").setVisible(true);
        }
}

        
        
  
   