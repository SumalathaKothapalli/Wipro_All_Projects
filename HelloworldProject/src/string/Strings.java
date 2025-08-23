package string;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Hello";
		System.out.println(st.charAt(2));
		System.out.println(st.codePointAt(1));
		System.out.println(st.codePointBefore(1));
		System.out.println(st.codePointCount(0,3));
		System.out.println(st.equals("hello"));
		System.out.println(st.equalsIgnoreCase("hello"));
		System.out.println(st.isBlank());
		System.out.println(st.isEmpty());
		System.out.println(st.lastIndexOf("0"));
		System.out.println(st.contains("H"));


	}

}
