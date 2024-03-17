//No sorting Algorithm
public class arraySort012 {
    public static void main(String[] args) {
        int arr[]={1,1,0,2,2,0};
        int zero=0,one=0,two=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            if(arr[i]==1){
                one++;
            }
            if(arr[i]==2){
                two++;
            }        
        }
        for(int i=0;i<zero;i++){
            arr[i]=0;
        }
        for(int i=zero;i<one+zero;i++){
            arr[i]=1;
        }
        for(int i=one+zero;i<arr.length;i++){
            arr[i]=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
