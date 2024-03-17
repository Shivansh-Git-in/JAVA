//BubbleSort then arrlength - Kth element
import java.util.*;
public class arrayKthMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,7,5,4,3,1,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the kth maximun element to be found");
        int k=sc.nextInt();
        System.out.print("the "+k+"th maximun number of the sorted array is:"+arr[arr.length-k]);
    }
}
