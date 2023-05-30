import java.util.LinkedList;

public class linkedlist_1_ii {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Dog");
        ll.add("Cat");
        ll.add("Bird");

        System.out.println("LinkedList: " + ll);

        String first = ll.getFirst();
        String last = ll.getLast();

        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("LinkedList after removal: " + ll);

    }
}
