import java.util.*;

public class treeset_9 {
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<String>();
        TreeSet<String> ts2 = new TreeSet<String>();

        // Adding elements to the first tree set
        ts1.add("Apple");
        ts1.add("Orange");
        ts1.add("Mango");

        // Adding all elements of the first tree set to the second tree set
        ts2.addAll(ts1);

        // Printing the elements of the second tree set
        System.out.println("Elements of the second tree set: " + ts2);
    }
}
