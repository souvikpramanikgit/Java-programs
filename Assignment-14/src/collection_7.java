import java.util.*;

public class collection_7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Adding elements to the list
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);

        // Sorting the list
        Collections.sort(list);

        // Printing the sorted list
        System.out.println("Sorted List: " + list);
    }
}
