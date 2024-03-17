/*
Abstraction - 
hiding the internal implementation and showing only functionality
abstract class can contain both abstract method and concrete method
method without body is called abstract
cannot create an object of abstract class
if method is abstract class has to be abstract vice versa is possible
all abstract method should be defined in child class
*/
abstract class bike{
    abstract void run(); //abstract method
    public void brake(){ //concrete method
        System.out.println("Brakes applied");
    }
}
class pulsar extends bike{
    public void run(){
        System.out.println("Pulsar is running");
    }
}
public class abstractn{
    public static void main(String[] args){
        bike b=new pulsar(); //functionalities of bike hidden in pulsar
        b.run();
        b.brake();
    }
}
