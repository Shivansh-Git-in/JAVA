import java.util.*;
public class arrayResize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(arr.length);
        int capacity=sc.nextInt();
        int[] temp=new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
        arr=temp;
        System.out.println();
        System.out.print(arr.length);
    }
}
