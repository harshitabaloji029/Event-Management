
package event.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.*;
import java.awt.event.*;
public class BookHotel extends JFrame implements ActionListener{
    Choice c1,c2,c3;
    JTextField t1,t2;
    JLabel l21,l22,l23,l24,l25;
    JButton b1,b2,b3;
    BookHotel(String username){
        setBounds(270,100,1000,650);
         //getContentPane().setBackground(Color.BLACK);
         setLayout(null);
         JLabel l1 = new JLabel("Book Venue");
         l1.setFont(new Font("Tahoma",Font.BOLD,25));
         //l1.setForeground(Color.WHITE);
         l1.setBounds(100,0,300,30);
         add(l1);
         JLabel l2 = new JLabel("Username:");
         l2.setBounds(20,70,100,30);
         //l2.setForeground(Color.WHITE);
         add(l2);
         l21 = new JLabel();
         l21.setBounds(250,70,150,30);
         add(l21);
         JLabel l3 = new JLabel("Select Venue:");
         l3.setBounds(20,110,100,30);
         //l3.setForeground(Color.WHITE);
         add(l3);
         c1=new Choice();
         try{
              Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from venue");
           while(rs.next()){
               c1.add(rs.getString("name"));
           }
         }catch(Exception e){}
       
         c1.setBounds(250,110,150,30);
         add(c1);
         JLabel l4 = new JLabel("Total People:");
         l4.setBounds(20,150,100,30);
         //l4.setForeground(Color.WHITE);
         add(l4);
         t1 = new JTextField();
         t1.setBounds(250,150,100,30);
         add(t1);
         JLabel l5 = new JLabel("No of Days:");
         l5.setBounds(20,190,100,30);
         //l5.setForeground(Color.WHITE);
         add(l5);
         t2 = new JTextField();
         t2.setBounds(250,190,100,30);
         add(t2);
         JLabel l6 = new JLabel("AC/Non-AC:");
         l6.setBounds(20,230,100,30);
         //l6.setForeground(Color.WHITE);
         add(l6);
         c2=new Choice();
         c2.add("YES");
         c2.add("NO");
         c2.setBounds(250,230,150,30);
         add(c2);
         JLabel l7 = new JLabel("Food Included");
         l7.setBounds(20,270,100,30);
         //l7.setForeground(Color.WHITE);
         add(l7);
         c3=new Choice();
         c3.add("YES");
         c3.add("NO");
         c3.setBounds(250,270,150,30);
         add(c3);
         JLabel l8 = new JLabel("ID:");
         l8.setBounds(20,310,100,30);
         //l8.setForeground(Color.WHITE);
         add(l8);
          l22 = new JLabel();
         l22.setBounds(250,310,150,30);
         add(l22);
         JLabel l9 = new JLabel("Number:");
         l9.setBounds(20,350,100,30);
         //l9.setForeground(Color.WHITE);
         add(l9);
         l23 = new JLabel();
         l23.setBounds(250,350,150,30);
         add(l23);
         JLabel l10 = new JLabel("Phone");
         l10.setBounds(20,390,100,30);
      //   l10.setForeground(Color.WHITE);
         add(l10);
         l24 = new JLabel();
         l24.setBounds(250,390,150,30);
         add(l24);
         JLabel l11 = new JLabel("Total Price");
         l11.setBounds(20,430,100,30);
         //l11.setForeground(Color.WHITE);
         add(l11);
         l25 = new JLabel();
         l25.setForeground(Color.RED);
         l25.setBounds(250,430,150,30);
         add(l25);
         try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username ='"+username+"'");
            while(rs.next()){
               l21.setText(rs.getString("username"));
               l22.setText(rs.getString("id"));
               l23.setText(rs.getString("number"));
               l24.setText(rs.getString("phone"));
               
            }
         }catch(Exception e){}
         b1 = new JButton("Check Price");
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.WHITE);
         b1.setBounds(50,490,120,30);
         b1.addActionListener(this);
         add(b1);
         b2 = new JButton("Book");
         b2.setBackground(Color.BLACK);
         b2.setForeground(Color.WHITE);
         b2.setBounds(200,490,120,30);
         b2.addActionListener(this);
         add(b2);
         b3 = new JButton("Back");
         b3.setBackground(Color.BLACK);
         b3.setForeground(Color.WHITE);
         b3.setBounds(350,490,120,30);
         b3.addActionListener(this);
         add(b3);
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("event/management/system/icons/hotel1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450, 400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 =new JLabel(i3);
        l12.setBounds(500,50,450,400);
        add(l12);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
              Conn c = new Conn();
              ResultSet rs =c.s.executeQuery("select * from venue where name ='"+c1.getSelectedItem()+"'");
              while(rs.next()){
                  int cost = Integer.parseInt(rs.getString("cost_per_day"));
                  int food = Integer.parseInt(rs.getString("food_charges"));
                  int AC = Integer.parseInt(rs.getString("ac_charges"));
                  int people = Integer.parseInt(t1.getText());
                  int days = Integer.parseInt(t2.getText());
                   String ac_price = c2.getSelectedItem();
                   String food_price = c2.getSelectedItem();
                   if(people * days > 0){
                       int total =0 ;
                       total +=ac_price.equals("YES")?AC:0;
                       total +=food_price.equals("YES")?food:0;
                       total += cost;
                       total =total * people *days;
                       l25.setText(""+total);
                   }else{
                       l25.setText("INVALID DETAILS");
                       
                   }
                   
              }
           }catch(Exception e){}
         }else if(ae.getSource()==b2){
            try{
                Conn c=new Conn();
                c.s.executeUpdate("insert into bookvenue values('"+l21.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+t2.getText()+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"','"+l22.getText()+"','"+l23.getText()+"','"+l24.getText()+"','"+l25.getText()+"')");
                        JOptionPane.showMessageDialog(null,"Venue Booked Successfully");
                        this.setVisible(false); 
            }catch(Exception e){}
        }else if(ae.getSource()==b3){
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new BookHotel("").setVisible(true);
    }
}
