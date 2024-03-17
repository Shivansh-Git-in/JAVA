/*
//Method Level

class table{
    public synchronized void printtable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
class thread1 extends Thread{
    table t;
    thread1(table t){
        this.t=t;
    }
    public void run(){
        t.printtable(7);
    }
}
class thread2 extends Thread{
    table t;
    thread2(table t){
        this.t=t;
    }
    public void run(){
        t.printtable(8);
    }
}
public class synchronize {
    public static void main(String[] args) {
        table obj=new table();     
        //obj is a lock which each thread will get one at a time
        
        thread1 t1=new thread1(obj);
        thread2 t2=new thread2(obj);
        t1.start();
        t2.start();
   }
}
*/
 
//Block Level
class msg{
    public void show(String name){

        //assume some non synchronized code

        synchronized(this){             //onlythis block will be synchronized
            for(int i=0;i<=5;i++){
                System.out.println(name);
            }
        }

        //assume some non synchronized code

    }
}

class thread extends Thread{
    msg m;
    String name;
    thread(msg m,String name){
        this.m=m;
        this.name=name;
    }
    public void run(){
        m.show(name);
    }
}
class synchronize{
    public static void main(String[] args) {
        msg m=new msg();
        thread t1=new thread(m, "gandhi");
        thread t2=new thread(m, "godse");
        t1.start();
        t2.start();
    }
}