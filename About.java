
package event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener{
    String s;
    JButton b1;
    About(){
        setBounds(500,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("Event Management system");
        l1.setBounds(70,10,400,80);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN,28));
        
        s="About this Project: \n" +
"The objective of the Event Management System\n" +
"project is to develop a system that automates the processes and\n" +
"activities of a event and the purpose is to design a system using\n" +
"which one can perform all operations related to event managing.\n" +
"This application will help in accessing the information related to the\n" +
"event to the particular destination/package with great ease. The users can\n" +
"track the information related to their events by this application.\n";
        
        TextArea t1 = new TextArea(s,10,40,Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20,100,450,300);
        t1.setFont(new Font("Tahoma", Font.PLAIN,20));
        add(t1);
        add(l1);
        
        b1=new JButton("Back");
        b1.setBounds(190,420,100,25);
        b1.addActionListener(this);
        add(b1);
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
}
