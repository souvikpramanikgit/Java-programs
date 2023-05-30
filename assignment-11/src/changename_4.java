class changename_4 extends Thread{

    public void run(){
        System.out.println("running....");
    }

    public static void main(String args[]){
        changename_4 t1=new changename_4();
        changename_4 t2=new changename_4();
        System.out.println("Name of t1: "+t1.getName());
        System.out.println("Name of t2: "+t2.getName());
        t1.start();
        t2.start();
        t1.setName("West Bengal");
        System.out.println("After changing the name of t1: "+t1.getName());
    }
}
