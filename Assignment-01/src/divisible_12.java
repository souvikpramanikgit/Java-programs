class divisible_12 {

    public static void main(String args[]){

        int number;
        try {
            number = Integer.parseInt(args[0]);
            if (number % 5 == 0) {
                System.out.println("Given number " + number + " is Divisible by 5");
            } else {
                System.out.println("Given number " + number + " is not Divisible by 5");
            }
        }
        catch (Exception e){
            System.out.println("Error occurs");
        }
    }
}