package JDBC_PRO;
import java.sql.*;

public class MINI_PROJECT {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "mysql_password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established");

            Statement stmt = con.createStatement();

            // Create table 
            String createStudent = "CREATE TABLE Student (" +
                    "rollno INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "per FLOAT, " +
                    "email VARCHAR(50), " +
                    "city VARCHAR(50))";
            stmt.executeUpdate(createStudent);
            System.out.println("Student table created");

            // Insert records
            String insertStudent = "INSERT INTO Student VALUES " +
                    "(101, 'Neeva Sharma', 98, 'abc@gmail.com', 'Delhi'), " +
                    "(102, 'Reeva Sharma', 89, 'reeva@gmail.com', 'Delhi'), " +
                    "(103, 'Shiva Upadhyay', 79, 'shiva@gmail.com', 'Noida'), " +
                    "(104, 'Mittal Shah', 90, 'mittal@gmail.com', 'Noida')";
            stmt.executeUpdate(insertStudent);
            System.out.println("Student records inserted");

            // Print table
            System.out.println("Student Table:");
            System.out.println("RollNo\tName\t\tPercentage\tEmail\t\t\tCity");
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
            while (rs.next()) {
                System.out.printf("%d\t%-15s\t%.1f\t\t%-20s\t%s\n",
                        rs.getInt("rollno"),
                        rs.getString("name"),
                        rs.getFloat("per"),
                        rs.getString("email"),
                        rs.getString("city"));
            }

            // Update 
            stmt.executeUpdate("UPDATE Student SET per = 95 WHERE rollno = 104");
            System.out.println("\nUpdated percentage for rollno 104");

            // highest percentage
            rs = stmt.executeQuery("SELECT name, per FROM Student WHERE per = (SELECT MAX(per) FROM Student)");
            if (rs.next()) {
                System.out.println("\nHighest percentage student:");
                System.out.println(rs.getString("name") + " - " + rs.getFloat("per") + "%");
            }

            // records in ascending order of percentage
            System.out.println("\nStudents arranged in ascending order by percentage:");
            rs = stmt.executeQuery("SELECT * FROM Student ORDER BY per ASC");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " - " + rs.getString("name") + " - " + rs.getFloat("per"));
            }

            // same city 
            System.out.println("\nStudents from City 'Delhi':");
            rs = stmt.executeQuery("SELECT * FROM Student WHERE city = 'Delhi'");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getString("city"));
            }

            // new column
            stmt.executeUpdate("ALTER TABLE Student ADD COLUMN course VARCHAR(30)");
            System.out.println("\nNew column 'course' added");

            // Modify column datatype
            stmt.executeUpdate("ALTER TABLE Student MODIFY per FLOAT");
            System.out.println("Column 'per' datatype modified to FLOAT");

            // Rename table (per question, rename Student to Students)
            stmt.executeUpdate("RENAME TABLE Student TO Students");
            System.out.println("Table renamed to 'Students'");

            // Delete column 'course'
            stmt.executeUpdate("ALTER TABLE Students DROP COLUMN course");
            System.out.println("Column 'course' deleted");

            // Delete single row with rollno = 103
            stmt.executeUpdate("DELETE FROM Students WHERE rollno = 103");
            System.out.println("Deleted row with rollno = 103");

            // Delete all records without affecting structure
            stmt.executeUpdate("DELETE FROM Students");
            System.out.println("All records deleted from Students table ");

            // Drop entire Students table
            stmt.executeUpdate("DROP TABLE Students");
            System.out.println("Students table dropped");

            // create fresh Student and Institute tables for join operations

            stmt.executeUpdate("CREATE TABLE Student (" +
                    "rollno INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "city VARCHAR(50))");
     

            stmt.executeUpdate("CREATE TABLE Institute (" +
                    "rollno INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "city VARCHAR(50))");

            // Insert data STU
            stmt.executeUpdate("INSERT INTO Student VALUES " +
                    "(101, 'Neeva Sharma', 'Delhi'), " +
                    "(102, 'Reeva Sharma', 'Delhi'), " +
                    "(104, 'Mittal Shah', 'Noida')");

            // Insert data INS
            stmt.executeUpdate("INSERT INTO Institute VALUES " +
                    "(101, 'Neeva Sharma', 'Delhi'), " +
                    "(103, 'Ravi Kumar', 'Ghaziabad'), " +
                    "(104, 'Mittal Shah', 'Noida')");

            // INNER JOIN
            System.out.println("\n****** INNER JOIN ********");
            rs = stmt.executeQuery(
                    "SELECT Student.rollno, Student.name AS student_name, Institute.name AS institute_name " +
                    "FROM Student INNER JOIN Institute ON Student.rollno = Institute.rollno");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " - " + rs.getString("student_name") + " - " + rs.getString("institute_name"));
            }

            // LEFT JOIN
            System.out.println("\n******* LEFT JOIN *********");
            rs = stmt.executeQuery(
                    "SELECT Student.rollno, Student.name AS student_name, Institute.name AS institute_name " +
                    "FROM Student LEFT JOIN Institute ON Student.rollno = Institute.rollno");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " - " + rs.getString("student_name") + " - " + rs.getString("institute_name"));
            }

            // RIGHT JOIN
            System.out.println("\n******* RIGHT JOIN **********");
            rs = stmt.executeQuery(
                    "SELECT Student.rollno, Student.name AS student_name, Institute.name AS institute_name " +
                    "FROM Student RIGHT JOIN Institute ON Student.rollno = Institute.rollno");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " - " + rs.getString("student_name") + " - " + rs.getString("institute_name"));
            }

            // FULL OUTER JOIN
            System.out.println("\n************* FULL OUTER JOIN *********");
            rs = stmt.executeQuery(
                    "SELECT Student.rollno, Student.name AS student_name, Institute.name AS institute_name " +
                    "FROM Student LEFT JOIN Institute ON Student.rollno = Institute.rollno " +
                    "UNION " +
                    "SELECT Student.rollno, Student.name AS student_name, Institute.name AS institute_name " +
                    "FROM Student RIGHT JOIN Institute ON Student.rollno = Institute.rollno");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " - " + rs.getString("student_name") + " - " + rs.getString("institute_name"));
            }

            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
