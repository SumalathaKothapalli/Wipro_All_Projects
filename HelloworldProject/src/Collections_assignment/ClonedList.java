package Collections_assignment;
import java.util.LinkedList;
public class ClonedList {

	public static void main(String[] args) {
	        LinkedList<Integer> originalList = new LinkedList<Integer>();
	        originalList.add(1);
	        originalList.add(2);
	        originalList.add(3);
	        originalList.add(4);
	        originalList.add(5);
	        LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();
	        System.out.println("Original List: " + originalList);
	        System.out.println("Cloned List: " + clonedList);
	    }

	}

