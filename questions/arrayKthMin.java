import java.util.*;
public class arrayKthMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={3,2,4,6,7,1,5};
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
        System.out.println("Enter the kth minimum element to be found");
        int k=sc.nextInt();
        System.out.print("the "+k+"th minimum number of the sorted array is:"+arr[k-1]);
    }
}
