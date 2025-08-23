package Coolection_framework;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_list {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add(0,"Apple");
		list.add(1,"Mango");
		list.add(2,"Kiwi");
		list.add(3,"Banana");
		System.out.println(list);
		System.out.println(list.get(3));
		list.set(2,"Orange");
		System.out.println(list);
		list.add(3,"Kiwi");
		System.out.println(list);
		System.out.println(list.contains("Banana"));
		System.out.println(list.equals("Banana"));
		System.out.println(list.getLast());
		System.out.println(list.getFirst());
		System.out.println(list.indexOf("Kiwi"));
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.remove("Kiwi");
		System.out.println(list);
		System.out.println(list.reversed());
		for(String ch:list)
			{
				System.out.println(ch);
			}
		//Using iterator
		Iterator<String> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
