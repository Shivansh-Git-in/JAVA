import java.util.*;
public class arrayDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate value found: "+arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("No Duplicate found");
        }
    }
}
