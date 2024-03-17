 
import java.util.*;
public class Exceptionhandle {
    public static void main(String[] args) {
         System.out.println("Started..");
         try{
         Scanner sc=new Scanner(System.in);
         int n1=sc.nextInt();
         int n2=sc.nextInt();
         System.out.println("We have two numbers...");
         int result=n1/n2;
         System.out.println("Division : "+result);

         if(n2<10)
         {
            throw new NumInvalidExceltion("The number is invalid");
         }
         }
         catch(ArithmeticException e){
            System.out.println("N2 cannot be 0!");
            System.out.println(e.getMessage());
         }
         catch(NumberFormatException e){
            System.out.println("Invalid numbers!");
            System.out.println(e.getMessage());
         }
         catch(Exception e){
            System.out.println("Error!");
            System.out.println(e.getMessage());
         }
         finally{
            System.out.println("I am in finally..");
            System.out.println("closing all resources..");
         }

         System.out.println("Terminated..");
    }
}

//Custom exception
class NumInvalidExceltion extends Exception{
    NumInvalidExceltion()
    {
        super("Number invalid!! ");
    }
    NumInvalidExceltion(String message)
    {
        super(message);
    }
}
