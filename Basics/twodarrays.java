/*
 2 dimension array row and column
 Matrix
*/
import java.util.*;
public class twodarrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n=sc.nextInt();
        System.out.println("Enter no of column: ");
        int m=sc.nextInt();
        
        //input
        System.out.println("Enter the number of elements: ");
        int[][] Mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Mat[i][j]=sc.nextInt();
            }
        }

        //output
        System.out.println("2d array of the entered array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(Mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
