public class singlethread_1 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Task " + (i + 1) + " is being executed...");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All tasks have been executed successfully!");
    }

}
