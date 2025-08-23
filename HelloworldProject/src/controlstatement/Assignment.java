package controlstatement;

public class Assignment {

	public static void main(String[] args) {
		int age=18;
		boolean id=true;
		boolean student=true;
		if(age >= 18 && id)
		{
			System.out.println("allowed");
		}
		else
		{
			System.out.println("not allowed");
		}
		if(age <18 || student)
		{
			System.out.println("discount");
		}
		else
		{
			System.out.println("no discount");
		}
		
	}

}
