class myThread1 extends Thread {
    String name;
    myThread1(String tname){
        name=tname;
        start();
    }
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name+" interrupted.");
            System.out.println(name+" exciting ");
        }
    }
}
public class methods_3 {
    public static void main(String[] args) {
        myThread1 m1 = new myThread1("First");
        try {
            Thread.sleep(500);
            m1.suspend();
            System.out.println("First thread suspended");
            Thread.sleep(500);
            m1.resume();
            System.out.println("First thread resumed");
            Thread.sleep(300);
            System.out.println("First thread stopped");
            m1.stop();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
            System.out.println("Main thread exiting");
    }
}
