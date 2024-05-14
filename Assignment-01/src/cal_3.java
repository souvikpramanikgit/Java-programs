class cal_3 {
    public static void main(String args[]){
        int a,b,n;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            n = Integer.parseInt(args[2]);
            switch (n) {
                case 1:
                    System.out.println("The sum is " + (a + b));
                    break;
                case 2:
                    System.out.println("The subtraction is " + (a - b));
                    break;
                case 3:
                    System.out.println("The multiplication is " + (a * b));
                    break;
                case 4:
                    System.out.println("The division is " + (a / b));
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
        catch(Exception e){
            System.out.println("Error occurs");
        }
    }
}