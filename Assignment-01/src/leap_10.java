class leap_10 {

    public static void main(String args[]){

        int year;
        try {
            year = Integer.parseInt(args[0]);
            if ((year % 400 == 0) && (year % 100 == 0)) {
                System.out.println("Leap year");
            } else if ((year % 4 == 0) && (year % 100 != 0)) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not Leap year");
            }
        }
        catch (Exception e){
            System.out.println("Error occurs");
        }
    }
}