package encapsulation;

public class BankAccount {
	private double balance=0;
	public void deposite(double amt)
	{
		if(amt>0)
		{
			balance+=amt;
			System.out.println("Deposited ="+amt);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
