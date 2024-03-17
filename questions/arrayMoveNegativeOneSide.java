public class arrayMoveNegativeOneSide {
    public static void main(String[] args) {
        int arr[] ={-2,-7,8,4,5,-2,4,-6};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(arr[left]<0){
                left++;
            }
            while(arr[right]>0) {
                right--;
            }
            if(left>=right){
                break;
            }
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
