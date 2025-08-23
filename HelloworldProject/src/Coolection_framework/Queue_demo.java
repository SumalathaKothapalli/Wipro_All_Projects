package Coolection_framework;

import java.util.PriorityQueue;

public class Queue_demo {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("Apple");
		q.add("Mango");
		q.add("Bnana");
		q.add("Wtermelon");
		q.add("Kiwi");
		q.add("CustardApple");
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.poll();
		
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println(q.element());
		q.offer("Banana");
		System.out.println(q);
		System.out.println(q.peek());
		
		
		

	}

}
