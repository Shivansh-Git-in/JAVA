/*
data structure holding collection of same type of data
non primitive
sub array is a part of array
*/
/*
public class arrays{
    public static void main(String[] args){
        int[] marks = {99,97,56,76,92};
        int n = marks.length;
        for(int i=0;i<=n-1;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
*/
/*
import java.util.*;
public class arrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] marks = new int[5];
        int n=marks.length;

        System.out.println("Enter your marks: ");
        for(int i=0;i<=n-1;i++){
            marks[i]=sc.nextInt();
        }
        
        System.out.println("Your marks are: ");
        for(int i=0;i<=n-1;i++){
            System.out.println(marks[i]);
        }
    }
}
*/

//sum of elements of array
/*
import java.util.*;
public class arrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter value of elements in the array");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<=n-1;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of array is: "+sum);
    }
}
*/
/*
//Largestelement in array
import java.util.*;
public class arrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter value of elements in the array");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<=n-1;i++){
           if(arr[i]>max){
            max=arr[i];
           }
        }
        System.out.println("largest number of array: "+max);
    }
}
*/

/*
//Even elements in array
import java.util.*;
public class arrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter value of elements in the array");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        int evenno=0;
        for(int i=0;i<=n-1;i++){
           if(arr[i]%2==0){
            evenno++;
           }
        }
        System.out.println("Even elements in the array: "+evenno);
    }
}
*/

