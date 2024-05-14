class swap_8 {
    public static void main(String args[]){
        int a,b,temp;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            System.out.println("Before swapping a is " +a+ " and b is " +b);
            temp = a;
            a = b;
            b = temp;
            System.out.println("After swapping a is " +a+ " and b is " +b);
        }
        catch(Exception e){
            System.out.println("Error occurs");
        }
    }
}