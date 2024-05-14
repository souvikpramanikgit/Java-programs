
class Display {
    public synchronized void sayHello(String name) {
        for (int i = 0; i < 2; i++) {
            System.out.print("Hello ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread interrupted");
            }
            System.out.println(name);
        }
    }
}

class myThread3 extends Thread {
    private String n;
    private Display d;

    public myThread3(String n, Display d)
    {
        this.n = n;
        this.d = d;
    }

    public void run() {
        d.sayHello(n);
    }
}


public class threadsynchron_5 {
    public static void main(String[] args) {
        Display display = new Display();
        myThread3 thread1 = new myThread3("Alice", display);
        myThread3 thread2 = new myThread3("Bob", display);
        thread1.start();
        thread2.start();
    }
}
