import java.util.*;
public class arraySearchingLinear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a element to search");
        int x=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                System.out.println("Element present");
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("Element not present");
        }
    }
}
