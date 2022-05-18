
package event.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    
    JButton b1,b2;
    Payment(){
        setBounds(390,160,700,500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("event/management/system/icons/googlie.png"));
        Image i2 = i1.getImage().getScaledInstance(700, 500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 =new JLabel(i3);
        l1.setBounds(0,0,700,500);
        add(l1);
        
        b1=new JButton("Pay");
        b1.setBounds(420,20,80,40);
        b1.addActionListener(this);
        l1.add(b1);
        
        b2=new JButton("Back");
        b2.setBounds(520,20,80,40);
        b2.addActionListener(this);
        l1.add(b2);
        
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new Paytm().setVisible(true);
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }

  public static void main(String[] args){
      new Payment().setVisible(true);
  }  
}
