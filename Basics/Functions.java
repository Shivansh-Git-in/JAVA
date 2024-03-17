/*import java.util.*;
public class Functions {
    public static void addition(int x,int y){
        int sum=x+y;
        System.out.println(sum);
    }
     public static void substraction(int x,int y){
        int minus=x-y;
        System.out.println(minus);
    }
     public static void multiplication(int x,int y){
        int mul=x*y;
        System.out.println(mul);
    }
     public static void division(int x,int y){
        int div=x/y;
        System.out.println(div);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        addition(x,y);
        substraction(x, y);
        multiplication(x, y);
        division(x, y);
    }
}
*/
import java.util.*;
public class Functions {
    public static boolean evenornot(int x){
        if(x%2==0){
            return true;    
        }else{
            return false;
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
       
        
        System.out.println(evenornot(x));
        
    }
}