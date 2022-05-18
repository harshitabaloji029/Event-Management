
package event.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class AddCustomer extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t5,t6,t7,t4;
    JComboBox c1;
    JRadioButton r1,r2;
    JButton b1,b2;
    AddCustomer(String username){
        setBounds(350, 180, 850, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Username :");
        l1.setBounds(35, 50, 150, 25); 
        add(l1);
  
        t1=new JTextField();
        t1.setBounds(200,50,150,25);
        add(t1);
        
        JLabel l2 = new JLabel("ID :");
        l2.setBounds(35, 90, 150, 25); 
        add(l2);
       
        c1 = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"});
        c1.setBounds(200, 90, 150, 25);
	add(c1);
        
        JLabel l3 = new JLabel("Number :");
        l3.setBounds(35, 130, 150, 25); 
        add(l3);
  
        t2=new JTextField();
        t2.setBounds(200,130,150,25);
        add(t2);
        
        
        JLabel l4 = new JLabel("Name :");
        l4.setBounds(35, 170, 150, 25); 
        add(l4);
  
        t3=new JTextField();
        t3.setBounds(200,170,150,25);
        add(t3);
        
        JLabel l5 = new JLabel("Gender :");
        l5.setBounds(35, 210, 150, 25); 
        add(l5);
        
        r1 = new JRadioButton("Male");
        r1.setBackground(Color.WHITE);
        r1.setBounds(200,210,70,25);
        add(r1);
        
        r2 = new JRadioButton("Female");
        r2.setBackground(Color.WHITE);
        r2.setBounds(280,210,70,25);
        add(r2);
        
        JLabel l6 = new JLabel("Country: ");
        l6.setBounds(35, 250, 150, 25); 
        add(l6);
        
        t4 = new JTextField();
        t4.setBounds(200,250,150,25);
        add(t4);
        
        JLabel l7 = new JLabel("Address: ");
        l7.setBounds(35, 290, 150, 25); 
        add(l7);
        
        t5 = new JTextField();
        t5.setBounds(200,290,150,25);
        add(t5);
        
        JLabel l8 = new JLabel("Phone Number: ");
        l8.setBounds(35, 330, 150, 25); 
        add(l8);
        
        t6 = new JTextField();
        t6.setBounds(200,330,150,25);
        add(t6);
        
        JLabel l9 = new JLabel("Email: ");
        l9.setBounds(35, 370, 150, 25); 
        add(l9);
        
        t7 = new JTextField();
        t7.setBounds(200,370,150,25);
        add(t7);
        
        
        b1 = new JButton("Add");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(70,430,100,25);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(200,430,100,25);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("event/management/system/icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(400,40,450,420);
        add(l10);
        System.out.print(username);
       
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
            while(rs.next()){
                t1.setText(rs.getString("username"));
                t3.setText(rs.getString("name"));
            }
        }catch(Exception e){}
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String username = t1.getText();
            String id = (String)c1.getSelectedItem();
            String number = t2.getText();
            String name = t3.getText();
            String radio = null;               
                if(r1.isSelected()){ 
                     radio = "Male";
                }
                else if(r2.isSelected()){ 
                    radio = "Female";
                }
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();

            String q = "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+radio+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
            try{ 
                Conn c = new Conn();
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                this.setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }
    
    
    public static void main(String[] args){
        new AddCustomer("").setVisible(true);
            
        
    }
}





/*


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class AddCustomer extends JFrame {
	Connection conn = null;
	PreparedStatement pst = null;
	private JPanel contentPane;
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8;
        JComboBox comboBox;
        JRadioButton r1,r2;
        Choice c1;
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
            
            new AddCustomer("").setVisible(true);
            /*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomer frame = new AddCustomer("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public AddCustomer(String username) throws SQLException {
		System.out.println(username);
                setBounds(480, 220, 850, 550);
		contentPane = new JPanel();
	  	setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("event/management/system/icons/newcustomer.jpg"));
                Image i3 = i1.getImage().getScaledInstance(450, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(350,40,450,420);
                add(l1);
		
		JLabel lblName = new JLabel("NEW CUSTOMER FORM");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 260, 53);
		contentPane.add(lblName);
                
                JLabel l3 = new JLabel("Username :");
		l3.setBounds(35, 70, 200, 14);
		contentPane.add(l3);
                
                t7 = new JTextField();
		t7.setBounds(271, 70, 150, 20);
		contentPane.add(t7);
		t7.setColumns(10);
                
                JLabel lblId = new JLabel("ID :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                comboBox = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"});
		comboBox.setBounds(271, 110, 150, 20);
		contentPane.add(comboBox);
                
                JLabel l2 = new JLabel("Number :");
		l2.setBounds(35, 150, 200, 14);
		contentPane.add(l2);
                
                t1 = new JTextField();
		t1.setBounds(271, 150, 150, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblName_1 = new JLabel("Name :");
		lblName_1.setBounds(35, 190, 200, 14);
		contentPane.add(lblName_1);
		
		t2 = new JTextField();
		t2.setBounds(271, 190, 150, 20);
		contentPane.add(t2);
		t2.setColumns(10);

                
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                r1 = new JRadioButton("Male");
                r1.setFont(new Font("Raleway", Font.BOLD, 14));
                r1.setBackground(Color.WHITE);
                r1.setBounds(271, 230, 80, 12);
                add(r1);
                
                r2 = new JRadioButton("Female");
                r2.setFont(new Font("Raleway", Font.BOLD, 14));
                r2.setBackground(Color.WHITE);
                r2.setBounds(350, 230, 100, 12);
		add(r2);
                
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setBounds(35, 270, 200, 14);
		contentPane.add(lblCountry);
                
                t3 = new JTextField();
		t3.setBounds(271, 270, 150, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		JLabel lblReserveRoomNumber = new JLabel("Permanent Address :");
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
                t5 = new JTextField();
		t5.setBounds(271, 310, 150, 20);
		contentPane.add(t5);
		t5.setColumns(10);
           	
		JLabel lblCheckInStatus = new JLabel("Phone :");
		lblCheckInStatus.setBounds(35, 350, 200, 14);
		contentPane.add(lblCheckInStatus);
                
                t6 = new JTextField();
		t6.setBounds(271, 350, 150, 20);
		contentPane.add(t6);
		t6.setColumns(10);
		
		JLabel lblDeposite = new JLabel("Email :");
		lblDeposite.setBounds(35, 390, 200, 14);
		contentPane.add(lblDeposite);
		
		t8 = new JTextField();
		t8.setBounds(271, 390, 150, 20);
		contentPane.add(t8);
		t8.setColumns(10);
		
		
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
                    while(rs.next()){
                        t7.setText(rs.getString("username"));  
                        t2.setText(rs.getString("name"));
                    }
                }catch(Exception e){ }
		
		

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                            String radio = null;
                            
                            if(r1.isSelected()){ 
                                radio = "Male";
                            }
                            else if(r2.isSelected()){ 
                                radio = "Female";
                            }
                           
                          
                            try{
	    			String s9 = t7.getText(); //username
                                String s1 = (String)comboBox.getSelectedItem(); 
	    			String s2 =  t1.getText();
	    			String s3 =  t2.getText();
                                String s4 =  radio;
	    			String s5 =  t3.getText();
	    			String s7 =  t5.getText();  //address
                                String s8 =  t6.getText();
                                String s10 = t8.getText(); //email
                                
                                String q1 = "insert into customer values('"+s9+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s7+"','"+s8+"','"+s10+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});
		btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(260, 430, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}
*/