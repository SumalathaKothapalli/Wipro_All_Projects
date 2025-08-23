package Collections_assignment;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add(0, "Apple");
        list.add(1, "Mango");
        list.add(2, "Kiwi");
        list.add(3, "Banana");
        System.out.println("LinkedList: " + list);
        ArrayList<String> arrayList = new ArrayList<String>(list);
        System.out.println("ArrayList: " + arrayList);
    }
}
