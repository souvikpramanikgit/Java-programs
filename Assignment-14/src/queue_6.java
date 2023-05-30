import java.util.PriorityQueue;

public class queue_6 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Top element: " +q.peek());

        System.out.println("Elements of the priority queue: " + q);

        System.out.println("Head element of the priority queue: " + q.poll());

        System.out.println("Elements of the priority queue after removing head element: " + q);
    }
}
