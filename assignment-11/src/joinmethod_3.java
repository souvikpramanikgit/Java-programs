class joinmethod_3 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        joinmethod_3 t1=new joinmethod_3();
        joinmethod_3 t2=new joinmethod_3();
        joinmethod_3 t3=new joinmethod_3();
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
