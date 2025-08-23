package Collections_assignment;
import java.util.ArrayList;
public class Merge_RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Kiwi");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Banana");
        list2.add("Orange");
        list2.add("Apple");
        for (int i = 0; i < list2.size(); i++) {
            if (!list1.contains(list2.get(i))) {
                list1.add(list2.get(i));
            }
        }

        System.out.println("Merged list removing duplicates: " + list1);
    }
}
