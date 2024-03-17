/*
//Sleep Method
class sleep extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        try{
        for(int i=1;i<=3;i++){
            System.out.println(n);
            Thread.sleep(3000);
        }
        }catch(InterruptedException e){

        }
    }
}
public class Multithread {
    public static void main(String[] args) {
        sleep t1=new sleep();
        sleep t2=new sleep();
        sleep t3=new sleep();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }   
}
*/
/*
//Join Method
class Join extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}
public class Multithread{
    public static void main(String[] args) {
        Join t1=new Join();
        Join t2=new Join();
        Join t3=new Join();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t2.start();
        try{
            t2.join();
        }
        catch(InterruptedException e){

        }
        t3.start();
        t1.start();
        
    }
}
*/
/*
//Suspend and resume
class susres extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}
class Multithread{
    public static void main(String[] args) {
        susres t1=new susres();
        susres t2=new susres();
        susres t3=new susres();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t2.suspend(); 
        t3.start();
        t2.resume();

    }
}
*/

//Two ways to create a thread
/*
// By extending thread class
class myThread extends Thread{
    public void run(){
        System.out.println("Run executed");
    }
}
public class Multithread{
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
        System.out.println("Main executed");
    }
}
*/
// By implementing the runnable interface
/*
class myRun implements Runnable{
    public void run(){
        System.out.println("Run executed");
    }
}
public class Multithread{
    public static void main(String[] args) {
        myRun r = new myRun();
        Thread t=new Thread(r);
        t.start();
        System.out.println("Main executed");
    }
}
*/