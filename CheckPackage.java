
package event.management.system;

import javax.swing.*;
import java.awt.*;
public class CheckPackage extends JFrame {
    CheckPackage(){
        setBounds(350,100,800,650);
        
        String[] Birthdaypackage = new String[]{"Lawn Party", "Rent: 10,000/-", "Decoration: 5,000/-", "Catering: 20,000/-", "Host: 3000/-","Banquet Party","Rent: 12,000/-","Decoration: 15,000/-","Catering: 40,000/-","Host: 5000/-","birthday2.jpg"};
        String[] Weddingpackage = new String[]{"Beach Wedding", "Rent: 10,00,000/-", "Decoration: 9,00,000/-", "Catering: 1,00,000/-", "Host: 30,000/-","Banquet Wedding","Rent: 2,00,000/-","Decoration: 5,00,000/-","Catering: 40,000/-","Host: 5,000/-","wedding2.jfif"};
        String[] Conferencepackage = new String[]{"Seminar Hall", "Rent: 20,000/-", "Decoration: 15,000/-", "Catering: 20,000/-", "Projector: 5000/-","Round Table","Rent: 22,000/-","Decoration: 19,000/-","Catering: 30,000/-","VIP Seat: 10,000/-","conference.jpg"};
        String[] Partypackage = new String[]{"Bachelor Party", "Rent: 30,000/-", "Decoration: 25,000/-", "Catering: 20,000/-", "Pool: 40,000/-","Baby Shower","Rent: 12,000/-","Decoration: 15,000/-","Catering: 50,000/-","Host: 5000/-","party1.jpg"};
              
                
        JTabbedPane pane = new JTabbedPane();
        
        JPanel p1 = createPackage(Birthdaypackage);
        pane.addTab("Birthday Package", null, p1);
        
        
        JPanel p2 = createPackage(Weddingpackage);
        pane.addTab("Wedding Package", null, p2);
        
        JPanel p3 = createPackage(Conferencepackage);
        pane.addTab("Conference Package", null, p3);
        
        JPanel p4 = createPackage(Partypackage);
        pane.addTab("Party Package", null, p4);
        
        
        add(pane, BorderLayout.CENTER);
    }
    
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255,253,208));
        
        JLabel l1 =new JLabel(pack[0]);
        l1.setBounds(50,35,300,30);
        l1.setFont(new Font("tahoma", Font.BOLD,25));
        p1.add(l1);
        
        
        JLabel l2 =new JLabel(pack[1]);
        l2.setBounds(50,75,300,30);
        l2.setFont(new Font("tahoma", Font.PLAIN,20));
        p1.add(l2);
        
        JLabel l3 =new JLabel(pack[2]);
        l3.setBounds(50,115,300,30);
        l3.setFont(new Font("tahoma", Font.PLAIN,20));
        p1.add(l3);
        
        JLabel l4 =new JLabel(pack[3]);
        l4.setBounds(50,155,300,30);
        l4.setFont(new Font("tahoma", Font.PLAIN,20));
        p1.add(l4);
        
        JLabel l5 =new JLabel(pack[4]);
        l5.setBounds(50,195,300,30);
        l5.setFont(new Font("tahoma", Font.PLAIN,20));
        p1.add(l5);
        
        JLabel l6 =new JLabel(pack[5]);
        l6.setBounds(50,270,300,30);
        l6.setFont(new Font("tahoma", Font.BOLD,25));
        p1.add(l6);
        
        JLabel l7 =new JLabel(pack[6]);
        l7.setBounds(50,310,300,30);
        l7.setFont(new Font("tahoma", Font.PLAIN,20));
        p1.add(l7);
        
        JLabel l8 =new JLabel(pack[7]);
        l8.setBounds(50,350,300,30);
        l8.setFont(new Font("tahoma", Font.PLAIN,20));
        p1.add(l8);
        
        JLabel l9 =new JLabel(pack[8]);
        l9.setBounds(50,390,300,30);
        l9.setFont(new Font("tahoma", Font.PLAIN,20));
        p1.add(l9);
        
        JLabel l10 =new JLabel(pack[9]);
        l10.setBounds(50,430,300,30);
        l10.setFont(new Font("tahoma", Font.PLAIN,20));
        p1.add(l10);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("event/management/system/icons/"+pack[10]));
        Image i2 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(300,55,450,400);
        p1.add(l11);
        
        return p1;
    }
    
    public static void main(String[] args){
        new CheckPackage().setVisible(true);
    }
}
