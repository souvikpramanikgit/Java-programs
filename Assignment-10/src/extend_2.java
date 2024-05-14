class myThread extends Thread {
    public void run() {
        System.out.println("MyThread running");
    }
}
public class extend_2 {
    public static void main(String[] args) {
        myThread myt = new myThread();
        myt.start();
    }
}
