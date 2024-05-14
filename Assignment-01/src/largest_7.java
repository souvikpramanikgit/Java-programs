class largest_7 {

    public static void main(String args[]) {

        int a, b, c;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
            if (a > b && a > c) {
                System.out.println("a is the largest number");
            }
            else if (b > a && b > c) {
                System.out.println("b is the largest number");
            }
            else {
                System.out.println("c is the largest number");
            }
        }
        catch (Exception e) {
            System.out.println("Error occured");
        }
    }
}