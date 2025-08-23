package assignment_3;
import java.util.Scanner;

public class Employee {
	static String company = "WIPRO";  
    String name;                    
    void showDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        name = sc.next();
        System.out.println("Enter Employee ID:");
        int empId = sc.nextInt(); 
        System.out.println("Company: " + company);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
        emp.showDetails();

	}

}
