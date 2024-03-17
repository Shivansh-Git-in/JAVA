/*
Searching - Linear and Binary

Linear - sequentially checks each element of the list until a match is found or 
the whole list is searched. 
Time complexity = O(n)

Binary - only applicable on sorted array as we will not be able to traverse 
left or right, start = 0 , end = n-1 , middle = (0+(n-1))/2
Time complexity = O(log n)

*/
/* 
//Linear
import java.util.*;
public class searching {
    public static int linear(int arr[],int target){
        for(int i=0;i<10;i++){
            if(target==arr[i]){  //traverse each element of the array
                System.out.print("entered element is present at index ");
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[] arr={10,20,30,40,50,60,70,80,90};
        System.out.println(linear(arr, target));
    }
}
*/

//Binary
import java.util.*;
public class searching{
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,60,70,80,90};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=arr.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(target==arr[mid]){
                System.out.println(mid); //element found
                break;
            }else if(target > arr[mid]){
                s=mid+1; //right
            }else{
                e=mid-1; //left
            }
        }
    }
}
