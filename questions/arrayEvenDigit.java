import java.util.*;
public class arrayEvenDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
                even++;
            }
        }
        System.out.println("Total even digits are: "+even);
    }
}
