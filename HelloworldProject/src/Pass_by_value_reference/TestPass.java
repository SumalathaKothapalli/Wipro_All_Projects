package Pass_by_value_reference;

public class TestPass {
	
	public static void changepassword(String password)
	{
	password="NewPassword";
	}
	public static void main(String[] args) {
		
		String password="OldPassword";
		changepassword(password);
		System.out.println("Password method="+password);

	}

}
