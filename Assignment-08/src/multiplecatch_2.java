class multiplecatch_2 {
    public static void main(String args[]) {
        try {
            try {
                int arr[] = new int[5];
                arr[10] = 50;
            }
            catch (Exception e) {
                System.out.println("First error occured");
            }
            try {
                int a = 10 / 0;
            }
            catch (Exception e) {
                System.out.println("Second error occured");
            }
        }
        catch (Exception e) {
            System.out.println("Program terminated");
        }
    }
}
