package wrapper_classes;

public class Auto_demo {

	public static void main(String[] args) {
		//Autoboxing (convert primitive to wrapper classes)
		int num=10;
		System.out.println("Primitive type of data="+num);
		Integer num1=num;//covert primitive to object integer
		System.out.println("Wrap data="+num1);
		//unboxing(convert wrappers to primitive)
		Integer a=20;
		System.out.println("for object="+a);
		int b=a;
		System.out.println("For primitive data type int"+b);
		 
		String str="12345";
		int ab=Integer.parseInt(str);
		System.out.println(ab);
		
		String n=Integer.toString(num);
		System.out.println(n);

	}

}
