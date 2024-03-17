public class arrayPythagoreanTrip {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int x=arr[i]*arr[i];
                    int y=arr[j]*arr[j];
                    int z=arr[k]*arr[k];
                    if(x==y+z || y==x+z || z==x+y){
                        System.out.println("Triplet"+arr[i]+" "+arr[j]+" "+arr[k]);

                    }
                }
            }
        }
    }
}
