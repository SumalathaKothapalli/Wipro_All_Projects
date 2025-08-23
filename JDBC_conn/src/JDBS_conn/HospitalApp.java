package JDBS_conn;

import java.sql.*;

public class HospitalApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hospital_db";
        String user = "root";
        String password = "mysql_password"; // replace with your actual password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database\n");

            // 1. Call avgDailyPatientCount function
            CallableStatement cstmtFunc = con.prepareCall("{? = call avgDailyPatientCount()}");
            cstmtFunc.registerOutParameter(1, Types.FLOAT);
            cstmtFunc.execute();
            System.out.printf("Average Daily Patient Count: %.2f\n\n", cstmtFunc.getFloat(1));
            cstmtFunc.close();

            // 2. Call procedure printPatientsSameWard
            System.out.println("Patients belonging to the same ward (wards with more than 1 patient):");
            System.out.println("Ward\t\tPatients");
            CallableStatement cstmtSameWard = con.prepareCall("{call printPatientsSameWard()}");
            ResultSet rs1 = cstmtSameWard.executeQuery();
            while (rs1.next()) {
                String ward = rs1.getString("ward");
                String patients = rs1.getString("patients");
                System.out.printf("%-15s %s\n", ward, patients);
            }
            rs1.close();
            cstmtSameWard.close();

            System.out.println();

            // 3. Call procedure getPatientsByAdmissionDate
            System.out.println("Patients arranged by admission date:");
            System.out.println("ID\tName\t\t\tAdmission Date\tWard");
            CallableStatement cstmtAdmission = con.prepareCall("{call getPatientsByAdmissionDate()}");
            ResultSet rs2 = cstmtAdmission.executeQuery();
            while (rs2.next()) {
                int id = rs2.getInt("patient_id");
                String name = rs2.getString("name");
                Date admissionDate = rs2.getDate("admission_date");
                String ward = rs2.getString("ward");
                System.out.printf("%d\t%-20s\t%s\t%s\n", id, name, admissionDate, ward);
            }
            rs2.close();
            cstmtAdmission.close();

            con.close();
            System.out.println("\nConnection closed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
