package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {

	 
	public static void main(String[] args) throws Exception 
	{
	//---------------USER VALUES---------------------

    String name1= "Humaira";	
	String email1= "Humaira@gmail.com";
	String pass1="Humaira123";
	String gender1= "Female";
	String city1= "ISLAMABAD";
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","latenight");
    PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
    ps.setString(1, name1);
    ps.setString(2, email1); 
    ps.setString(3, pass1);
    ps.setString(4, gender1);
    ps.setString(5, city1);
   int i = ps.executeUpdate(); 
   
	if (i > 0) {
		System.out.println( "success");
	}
	else
	{
		System.out.println( "fail");	
	}
	con.close();
	}
   
}
