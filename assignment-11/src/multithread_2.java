class Mythread implements Runnable{
    String str;
    Mythread(String str){
        this.str=str;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(str+" : "+i);
        }
    }
}
class multithread_2{
    public static void main(String args[]){
        Mythread obj1=new Mythread("Cut the ticket");
        Mythread obj2=new Mythread("Show the seat");
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        System.out.println("t1 thread name = "+t1.getName());
        t2.start();
        System.out.println("t2 thread name = "+t2.getName());
    }
}