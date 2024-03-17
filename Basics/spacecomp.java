/*
Time Complexity - 
less space preferred
variables consume fixed amount of space 
auxilary space is extra space used to solve the problem(solution space)
*/
import java.util.*;
public class spacecomp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=2; //4bytes
        int b=4; //4bytes
        int sum=a+b; //4bytes

        //Fixed space complexity 
        //Space complexity = big O(1);
        System.out.println(sum);


        //Linear space complexity
        //space complexity = big O(4n) ~ big O(n);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];//n=1 (4 bytes) n=2 (8 bytes)
        

        //Quadratic space complexity
        //space complexity = big O(4n^2) ~ big O(n^2)
        int[][] arr1=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();  //n=1 (1^2 x 4 = 4bytes) n=2(2^2 x 4 = 16 bytes)
            }
        }

        
    }
}
