package Coolection_framework;
import java.util.ArrayDeque;

public class Array_Deque {

	public static void main(String[] args) {
	ArrayDeque<String> q=new ArrayDeque<String>();
	q.add("Apple");
	q.add("Mango");
	q.add("Watermelon");
	q.add("Kiwi");
	System.out.println(q);
	System.out.println(q.getFirst());
	System.out.println(q.getLast());
	q.offer("Banana");
	System.out.println(q);
	q.offerFirst("Muskmelon");
	q.offerLast("Orange");
	System.out.println(q);
	System.out.println(q.peek());
	q.poll();
	
	System.out.println(q);
	
	
	

	}

}
