import java.util.*;

public class arrsort_3 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println("Unsorted ArrayList: " + fruits);

        Collections.sort(fruits);

        System.out.println("Sorted ArrayList: " + fruits);
    }
}
