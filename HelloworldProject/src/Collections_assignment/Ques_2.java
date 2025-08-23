package Collections_assignment;
import java.util.ArrayList;

public class Ques_2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Mango");
        list.add("Kiwi");
        list.add("Banana");
        System.out.println(list);
		String[] arr = new String[list.size()];
        arr = list.toArray(arr);
        System.out.println("Converted Array elements:");
        for (int i = 0; i < arr.length; i++) 
            System.out.println(arr[i]);
        }

	}

