public class arrayZerosAtEnd {
    public static void main(String[] args) {
        int[] arr={10,0,20,0,30,0,40};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}