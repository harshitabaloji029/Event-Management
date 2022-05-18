
package event.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Loading extends JFrame implements Runnable{
    JProgressBar p;
    Thread t;
    String username;
    public void run(){
        try{
            for(int i = 1; i <= 101; i++) {
                       //s = s + 1;
                       int m = p.getMaximum();
                       int n = p.getValue();
                       if (n < m) {
                           p.setValue(p.getValue() + 1);
                       } else {
                           i = 101;
                           setVisible(false);
                           new Dashboard(username).setVisible(true);
                       }
            
                       Thread.sleep(50);
            }

        }catch (Exception e) {
		//e.printStackTrace();
            }
    }
   
    Loading(String user){
        
        username = user;
        t = new Thread(this);
        setBounds(480, 250, 600, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Event Management System");
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
        l1.setBounds(50, 20, 650, 35);
        add(l1);
        
        p = new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(150,100,300,25);
        add(p);
        
        JLabel l2 = new JLabel("Please Wait...");
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        l2.setBounds(230, 140, 150,30);
        add(l2);
        
        JLabel l3 = new JLabel("Welcome "+ username);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        l3.setBounds(20, 310, 400,30);
        add(l3);
        
        t.start();
    }
    
    public static void main(String[] args) {
            new Loading("").setVisible(true);
	}

    
}  
    
    /*
    private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
        String username;
	int s;
	Thread th;

	public static void main(String[] args) {
            new Loading("").setVisible(true);
	}

	public void setUploading() {
            setVisible(false);
            th.start();
	}

	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    } else {
                        i = 201;
                        setVisible(false);
                        new Dashboard(username).setVisible(true);
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	public Loading(String username) {
            this.username = username;
            th = new Thread((Runnable) this);

            setBounds(480, 250, 600, 400);
            contentPane = new JPanel();
            contentPane.setBackground(new Color(51,204, 255));
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel lbllibraryManagement = new JLabel("Travel and Toursim Application");
            lbllibraryManagement.setForeground(new Color(72, 209, 204));
            lbllibraryManagement.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
            lbllibraryManagement.setBounds(50, 46, 700, 35);
            contentPane.add(lbllibraryManagement);
	
            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
            progressBar.setStringPainted(true);
            progressBar.setBounds(130, 135, 300, 25);
            contentPane.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel("Please Wait....");
            lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
            lblNewLabel_2.setForeground(new Color(160, 82, 45));
            lblNewLabel_2.setBounds(200, 165, 150, 20);
            contentPane.add(lblNewLabel_2);

            JPanel panel = new JPanel();
            panel.setBackground(Color.WHITE);
            panel.setBounds(10, 10, 580, 380);
            contentPane.add(panel);
            
           
            JLabel l3 = new JLabel("Welcome ");
            l3.setBounds(20,310,400,25);
            l3.setFont(new Font("Tahoma", Font.BOLD,16));
            l3.setForeground(Color.red);
            add(l3);
            
            th.start();
             
            setUndecorated(true);
            setUploading();
	}
}
*/