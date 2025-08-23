package Coolection_framework;
import java.util.HashSet;
import java.util.Iterator;
public class Hash_set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Maggi");
        set.add("Pasta");
        set.add("Salt");
        set.add("Chocolate");
        set.add("Water");
        set.add("Water");  // Duplicate, will not be added
        set.add(null);
        set.add(null);     // Duplicate null, ignored
        // Print the Set
        System.out.println(set);
        // Iterating using Iterator
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

