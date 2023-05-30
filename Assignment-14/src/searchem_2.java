import java.util.*;

class searchem_2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("Date");
        al.add("Elderberry");

        System.out.println("ArrayList: " + al);

        String element = "Cherry";

        int index = al.indexOf(element);

        if (index == -1) {
            System.out.println(element + " is not present in the list.");
        } else {
            System.out.println(element + " is present at index " + index + " in the list.");
        }

    }
}
