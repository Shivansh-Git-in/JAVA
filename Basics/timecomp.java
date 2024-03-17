/*
Time complexity - 
Relation between input size and running time
measures the amount of time taken by algo to execute as a function of length of input  
Big o is worst case O(n)
theta is avg case Θ(n/2)
omega is best case Ω(1)
Nested loop = multiply value
seperate loop = add value
constants and small(compared to other in the question) degree of powers are ignored in time complexity
*/
import java.util.*;
public class timecomp {
    public static void main(String[] args){
        /*
        //1
        System.out.println("HelloWorld");
        //vs
        //2
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        //1 will take less time than 2
        */

        //Fixed time complexity
        //output not dependent on input,no relation with n,fixed/constant time
        //Time comp = big O(1)
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("HelloWorld"); 
        

        //Linear time complexity
        //dependent on n,time req is directly proportional to input
        //Time complexity = big O(n)
        for(int i=0;i<n;i++){
            System.out.println("Hello");
        }

        //Quadratic time complexity
        //Time complexity = big O(n^2)
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Hello");
            }
        }

        //Time complexity = big O(n+n) = big O(2n) ~ big O(n)
        for(int i=0;i<n;i++){
            System.out.println("Hello");
        }
        for(int j=0;j<n;j++){
            System.out.println("Hello");
        }

        //Log time complexity
        //Fast compared to n
        //Time complexity = big O(log n) ~ O(log n +1)
        for(int i=1;i<64;i*=2){
            System.out.println("Hi");
        }

    }
}
