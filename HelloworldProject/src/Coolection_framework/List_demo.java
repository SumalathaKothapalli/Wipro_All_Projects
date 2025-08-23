package Coolection_framework;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class List_demo {

	public static void main(String[] args) {
	//	List<String> list=new ArrayList<String>();
	//	list.add(0,"Apple");
	//	list.add(1,"Mango");
	//	list.add(2,"Kiwi");
	//	list.add(3,"Banana");
	//	System.out.println(list);
	//	System.out.println(list.get(3));
	//	list.set(2,"Orange");
	//	System.out.println(list);
	//	list.add(3,"Kiwi");
	//	System.out.println(list);
	//	System.out.println(list.contains("Banana"));
	//	System.out.println(list.equals("Banana"));
	//	System.out.println(list.getLast());
	//	System.out.println(list.getFirst());
	//	System.out.println(list.indexOf("Kiwi"));
	//	System.out.println(list.isEmpty());
	//	list.remove(0);
	//	System.out.println(list);
	//	list.remove("Kiwi");
	//	System.out.println(list);
	//	System.out.println(list.reversed());
	//	for(String ch:list)
	//	{
	//		System.out.println(ch);
	//	}
		//Using iterator
	//	Iterator<String> itrs=list.listIterator();
	//	while(itrs.hasNext()){
	//		System.out.println(list);
		//Add group of elements with list interface method "of"
		ArrayList<Integer> list=new ArrayList<>(List.of(50,70,80,40,50));
		Collections.sort(list);
		System.out.println(list);
		}
	}


