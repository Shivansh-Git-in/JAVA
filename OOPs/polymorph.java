/*
Polymorphism - 
compile time(overloading,class same,different argument) 
run time(overriding,function name arguments same, class is different)
*/
/*
//Overloading(compile time)
public class polymorph {
    public static int add(int a , int b){
        return a+b;
    }  
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static String add(String a,String b){
        return a+b;
    }
    public static void add(String a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,String b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        //1. no of arguments is different
        int a=2;
        int b=5;
        int c=9;
        System.out.println(add(a, b));
        System.out.println(add(a,b,c));
        //2. datatype of arguments is different
        String s1="Hello ";
        String s2="world";
        System.out.println(add(s1, s2));
        //3. order of argument is different
        add("Hello",5);
        add(5,"Hello");
    }
}
*/

//Overridding(run time,ignore dad's method) - requires inheritance
class dad{
    public void drivebmw(){
        System.out.println("Drive dad's bmw");
    }
}

class kid extends dad{
    public void drivebmw(){
        System.out.println("Drive kid's bmw");
    }
}

public class polymorph{
    public static void main(String[] args){
        dad ramesh = new dad();
        kid rocky = new kid();
        ramesh.drivebmw();
        rocky.drivebmw();
    }
}
