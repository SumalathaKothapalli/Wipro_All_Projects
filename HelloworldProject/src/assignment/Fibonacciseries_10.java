package assignment;

public class Fibonacciseries_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 2;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

	}

}
