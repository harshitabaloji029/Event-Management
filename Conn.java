
package event.management.system;

import java.sql.*;
/*public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","Harshita2001");
            s = c.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    } 
}
*/
public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///ems","root","Harshita2001"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  