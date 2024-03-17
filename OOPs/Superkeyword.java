//super

//variable
/*
class a{
    int a=10;
}
class b extends a{
    int a=20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class Superkeyword {
    public static void main(String[] args) {
        b r=new b();
        r.show();        
    }
}
*/

//Method
/*
class a{
    void show(){
        System.out.println("Hello learner");
    }
}
class b extends a{
    void show(){
        System.out.println("Hello viewer");
        super.show();
    }
}
public class Superkeyword {
    public static void main(String[] args) {
        b r=new b();
        r.show();        
    }
}
*/

//Default Constructor
/*
class a{
    a(){
        System.out.println("Hello learner");
    }
}
class b extends a{
    b(){
        //super() keyword by default for default constructor
        System.out.println("Hello viewer");
    }
}
public class Superkeyword {
    public static void main(String[] args) {
        b r=new b();       
    }
}
*/

//Parameterized Constructor
class a{
    a(int a){
        System.out.println("Hello learner"+a);
    }
}
class b extends a{
    b(){
        super(100); //parameterized constructor so pass value
        System.out.println("Hello viewer");
    }
}
public class Superkeyword {
    public static void main(String[] args) {
        b r=new b();       
    }
}