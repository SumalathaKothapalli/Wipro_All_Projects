package Pass_by_value_reference;

public class Pass_value_reference {
	String name="ClassTest";
	void show(String name1)
	{
		name=name1;
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pass_value_reference obj=new Pass_value_reference();
		System.out.println(obj.name);
		obj.show("MethodTest");

	}

}
