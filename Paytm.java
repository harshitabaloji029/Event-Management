
package event.management.system;

import javax.swing.*;
import java.awt.event.*;
public class Paytm extends JFrame implements ActionListener{
    Paytm(){
        JEditorPane j = new JEditorPane();
        j.setEditable(false);
        
        try{
            j.setPage("https://pay.google.com/gp/w/u/0/home/paymentmethods");
        }catch(Exception e){
            j.setContentType("text/html");
            j.setText("<html>Could not load, Error 404</html>");
            
        }
        JScrollPane js = new JScrollPane(j);
        getContentPane().add(js);
        
        JButton b1 = new JButton("Back");
        b1.setBounds(540,20,80,40);
        b1.addActionListener(this);
        j.add(b1);
        
        setBounds(400,200,700,500);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Payment().setVisible(true);
    }
    public static void main(String[] args){
        new Paytm().setVisible(true);
    }
}
