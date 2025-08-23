package encapsulation;

public class user_password {
	private String username="User123";
	private String password="pass@123";
	public String getUsername() 
	{
		return username;
		
	}
	public String getPassword()
	{
		return password;
	}
	public void displayCredentials() 
	{
		System.out.println(username);
		System.out.println(password);
		
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user_password u=new user_password();
		u.displayCredentials();

	}

}
