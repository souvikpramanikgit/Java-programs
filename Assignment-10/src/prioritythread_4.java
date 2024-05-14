class myThread2 extends Thread {
    public void run() {
        System.out.println("MyThread running");
    }
}

public class prioritythread_4 {
    public static void main(String[] args) {
        myThread2 m1 = new myThread2();
        System.out.println("MyThread priority: " + m1.getPriority());
        m1.setPriority(8);
        System.out.println("MyThread new priority: " + m1.getPriority());
        m1.start();
    }
}
