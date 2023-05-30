class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable running");
    }
}
class implement_1 {
    public static void main(String args[]) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}