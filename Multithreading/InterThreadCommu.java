class A extends Thread{
    int n=0;
    public void run(){
        synchronized(this){
            for(int i=0;i<=10;i++){
                n=n+i;
            }this.notify();
        }
    }
}
public class InterThreadCommu {
    public static void main(String[] args) throws InterruptedException{
        A a =new A();
        a.start();
        synchronized(a){
            System.out.println("Main Thread");
            a.wait();
            System.out.println("Main thread got notified");
            System.out.println(a.n);
        }
    }
}
