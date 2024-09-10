package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
 
public class Update {
public static void main(String[] args) throws Exception{
	String city1="Peshawer";
	String email1="Sumayah@gmail.com";
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","latenight");
    PreparedStatement ps= con.prepareStatement("update register set city=? where email=?");

    ps.setString(1, city1);
    ps.setString(2, email1);
    int count= ps.executeUpdate();
    if (count > 0) {
	  System.out.println("Updated");
     }
    else {
	System.out.println("NOT Updated");	
     }
    con.close();
   }
   }
