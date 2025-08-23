package JDBS_conn;
import java.sql.*;

public class Jdbc_conn {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
			// Import packages
	        // Create object for connection
	        // Retrieve data
	        // Close connection
	        String url = "jdbc:mysql://localhost:3306/mydb";
	        String user = "root";
	        String password = "mysql_password";
	        Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC driver
	        
	        Connection con=DriverManager.getConnection(url,user,password);
	        System.out.println("Connection created");
	        //create statement
	        Statement stmt=con.createStatement();
	        ResultSet rs=stmt.executeQuery("Select * from Emp");
	        System.out.println("ID\b name\t salary\t Department\t");
	        while(rs.next())
	        {
	        	int id=rs.getInt("ID");
	        	String name=rs.getString("name");
	        	int salary=rs.getInt("salary");
	        	System.out.println(id+" "+name+" "+ salary);
	        	//System.out.println("ID:"+id+"\tName:"");
	        }
	        rs.close();
	        stmt.close();
	        con.close();

	}

}
