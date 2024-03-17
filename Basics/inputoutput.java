/*
import java.lang.Math;
public class inputoutput {
    public static void main(String[] args){
        Double pi=Math.PI;
        System.out.printf("Value of pie upto 3 decimal is: %.3f",pi);
    }
    
}
*/
import java.util.*;
public class inputoutput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.next();
        int n=sc.nextInt();
        long l=sc.nextLong();
        float f=sc.nextFloat();
        double d=sc.nextDouble();
        boolean b=sc.nextBoolean();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(n);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
    }
}