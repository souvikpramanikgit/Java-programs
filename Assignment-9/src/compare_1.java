public class compare_1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("Using == operator:");
        System.out.println("str1 == str2 => " +(str1 == str2)); // true
        System.out.println("str1 == str3 => " +(str1 == str3)); // false

        System.out.println("\nUsing compareTo() method:");
        System.out.println("str1.compareTo(str2) => " +str1.compareTo(str2)+ "(means true)"); // 0
        System.out.println("str1.compareTo(str3) => " +str1.compareTo(str3)+ "(means true)"); // 0

        System.out.println("\nUsing equals() method:");
        System.out.println("str1.equals(str2) =>" +str1.equals(str2)); // true
        System.out.println("str1.equals(str2) =>" +str1.equals(str3)); // true

    }
}