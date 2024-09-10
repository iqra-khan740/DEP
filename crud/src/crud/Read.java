package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Read {
public static void main(String[] args) throws Exception{
	
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","latenight");
PreparedStatement ps= con.prepareStatement("select * from register");
ResultSet rs=ps.executeQuery();
while (rs.next()) {
	String name1=rs.getString("name");
	String email1=rs.getString("email");
	String pass1=rs.getString("password");
	String gender1=rs.getString("gender");
	String city1=rs.getString("city");
	System.out.println(name1);
	System.out.println(email1);
	System.out.println(pass1);
	System.out.println(gender1);
System.out.println(city1);
	System.out.println(rs.getString("name"));
}
	
 
}
}
