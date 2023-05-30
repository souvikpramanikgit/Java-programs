import java.util.Vector;

public class vector_1_iii {
    public static void main(String args[]) {
        Vector<Integer> v = new Vector<Integer>();

        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println("Vector: " + v);

        int size = v.size();
        int capacity = v.capacity();

        System.out.println("Size: " + size);
        System.out.println("Capacity: " + capacity);

        v.remove(1);

        System.out.println("Vector after removal: " + v);

    }
}
