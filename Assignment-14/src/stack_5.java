import java.util.Stack;

public class stack_5 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        System.out.println("Enter number between (1-2) => ");
        System.out.println("\n 1. Push ");
        System.out.println("\n 2. Pop ");
        int n = Integer.parseInt(args[0]);
        if(n==1) {
            s.push(Integer.parseInt(args[1]));
            s.push(Integer.parseInt(args[2]));
            s.push(Integer.parseInt(args[3]));
            s.push(Integer.parseInt(args[4]));
        }
        if(n==2){
            System.out.println("Popped element: " + s.pop());
        }
        System.out.println("\n Elements present in the stack: " + s);
    }
}