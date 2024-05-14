import java.util.Scanner;
class demo_1 {
    public static void main(String args[]){
        try {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            int n=24+num;
            System.out.println("Cal: " +n);
        }
        catch (Exception e){
            System.out.println("Error occured");
        }
        finally {
            System.out.println("Final block executed");
        }
    }
}
