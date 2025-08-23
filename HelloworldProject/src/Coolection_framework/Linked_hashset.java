package Coolection_framework;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class Linked_hashset {

	public static void main(String[] args) {
		 LinkedHashSet<String> set = new LinkedHashSet<String>();
	        set.add("Maggi");
	        set.add("Pasta");
	        set.add("Salt");
	        set.add("Chocolate");
	        set.add("Water");
	        set.add("Water");  // Duplicate, ignored
	        set.add(null);
	        set.add(null);     // Duplicate null, ignored
	        System.out.println(set);
	        System.out.println(set.clone());
	        System.out.println(set.contains("Pasta"));
	        System.out.println(set.isEmpty());
	        System.out.println("First element=" + set.getFirst());
	        System.out.println("Last element=" + set.getLast());
	        Iterator<String> itr = set.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	}

}
