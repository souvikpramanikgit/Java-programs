import java.util.*;

public class linkedlist_8 {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();

        // Adding elements to the list
        ls.add("Apple");
        ls.add("Date");
        ls.add("Orange");
        ls.add("Mango");

        // Printing the elements of the list
        System.out.println("Elements of the linked list: " + ls);

        // Removing an element from the list
        ls.remove("Orange");

        // Printing the elements of the list after removing an element
        System.out.println("Elements of the linked list after removing an element: " + ls);

        // Modifying an element in the list
        ls.set(1, "Grapes");

        // Printing the elements of the list after modifying an element
        System.out.println("Elements of the linked list after modifying an element: " + ls);

        System.out.println("Index of Mango in the linked list: " + ls.indexOf("Mango"));
    }
}
