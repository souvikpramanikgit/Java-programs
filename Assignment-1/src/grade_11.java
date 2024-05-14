class grade_11 {
    public static void main(String args[]){
        int m;
        try {
            m = Integer.parseInt(args[0]);
            if ((m >= 90) && (m <= 100)) {
                System.out.println("Grade: A");
            }
            else if ((m >= 80) && (m <= 89)) {
                System.out.println("Grade: B");
            }
            else if ((m >= 70) && (m <= 79)) {
                System.out.println("Grade: C");
            }
            else if ((m >= 60) && (m <= 69)) {
                System.out.println("Grade: D");
            }
            else if ((m >= 40) && (m <= 59)) {
                System.out.println("Grade: E");
            }
            else{
                System.out.println("Grade: F");
            }
        }
        catch (Exception e){
            System.out.println("Error occurs");
        }
    }
}