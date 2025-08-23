/*package JDBS_conn;
import java.sql.*;

public class prepare_stmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "mysql_password";
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC driver
        
        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println("Connection created");
        String query="Insert into student1 (rollno,name,age) values(?,?,?)";
        PreparedStatement pst=con.prepareStatement(query);
        
        pst.setInt(1,101);
        pst.setString(1,"Neeva Sharma");
        pst.setInt(3,20);
        
        pst.setInt(1,102);
        pst.setString(2,"Reeva Sharma");
        pst.setInt(3,20);
        
        pst.setInt(1,103);
        pst.setString(2,"Seeva Sharma");
        pst.setInt(3,20);
        int rows=pst.executeUpdate();
        
        System.out.println(rows+"Updated rows");

	}

}*/




package JDBS_conn;
import java.sql.*;

public class prepare_stmt {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";

        try (Connection con = DriverManager.getConnection(url, user, password)) {

            // No parameter passed
            java.sql.CallableStatement cst = con.prepareCall("{CALL getStudentBymark00()}");

            ResultSet rs = cst.executeQuery();

            System.out.println("ID\tName\t\t\tMarks");
            System.out.println("------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.printf("%d\t%-20s\t%d\n", id, name, marks);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
