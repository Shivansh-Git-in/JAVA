public class arraySearchingBinary {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int valueToFind=80;
        int low=0;
        int high=arr.length-1;
        boolean flag=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==valueToFind){
                System.out.println("Element Found");
                flag=true;
                break;
            } 
            if(arr[mid]<valueToFind){
                low=mid+1;
            }
            if(arr[mid]>valueToFind){
                high=mid-1;
            }
        }      
    }
}
