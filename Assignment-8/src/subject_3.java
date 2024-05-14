import java.util.Scanner;

public class subject_3 {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks for subject 1:");
            int sub1 = sc.nextInt();
            if (sub1 > 100) {
                throw new IllegalArgumentException("Marks cannot be greater than 100");
            }
            System.out.println("Enter marks for subject 2:");
            int sub2 = sc.nextInt();
            if (sub2 > 100) {
                throw new IllegalArgumentException("Marks cannot be greater than 100");
            }
            System.out.println("Enter marks for subject 3:");
            int sub3 = sc.nextInt();
            if (sub3 > 100) {
                throw new IllegalArgumentException("Marks cannot be greater than 100");
            }
            int total = sub1 + sub2 + sub3;
            int percentage = (total / 300) * 100;
            System.out.println("Total marks: " + total);
            System.out.println("Percentage: " + percentage);
        }
        catch (Exception e){
            System.out.println("Error occured");
        }
    }
}
