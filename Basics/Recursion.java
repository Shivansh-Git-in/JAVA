/*
Recursion -
Process in which a function calling itself
recurrance relation
*/
/*
//sum of numbers from n to 1
//Main -  sum(5) - 5 +sum(4) - 4 + sum(3) - 3 + sum(2) + 2 + sum(1) + 1(base case)
import java.util.*;
public class Recursion {
    public static int sumOf(int n){
        if(n==1){  //base case
            return 1;
        }else{
            return n+sumOf(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOf(n));
    }
}
*/
/*
//Product of numbers from n to 1 (factorial)
import java.util.*;
public class Recursion{
    public static int productOf(int n){
        if(n==1 || n==0){
            return 1;
        }else{
            return n*productOf(n-1);
        }
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(productOf(n));
    }
} 
*/
//fibonacci
//a,b,a+b
//   n= 0, 1, 2, 3, 4, 5, 6, 7
//f(n)= 0, 1, 1, 2, 3, 5, 8, 13
import java.util.*;
public class Recursion{
    public static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }else{
            return fibo(n-2)+fibo(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
