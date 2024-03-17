class A{
    public void abc(B b){    //Removed synchronized to avoid deadlock
        System.out.println("Thread 1 start execution of abc function");
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            e.getMessage();        
        }
        System.out.println("Thread trying to call b.last()");
        b.last();
    }
    public synchronized void last(){
        System.out.println("This is the last function of a");
    }
}
class B{
    public synchronized void xyz(A a){
        System.out.println("Thread 2 start execution of xyz function");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Thread trying to call a.last()");
        a.last();
    }
    public synchronized void last(){
        System.out.println("This is the last function of b");
    }
}
public class deadlock implements Runnable{
    A a=new A();
    B b=new B(); 
    deadlock(){
        Thread t=new Thread(this);
        t.start();
        a.abc(b);
    }
    public void run(){
        b.xyz(a);
    }
    public static void main(String[] args) {
        new deadlock();
    }
}