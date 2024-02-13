public class bubble_sort {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,22,11,54};
        for(int i=arr.length-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for(int ar:arr){
            System.out.print(ar+" ");
        }
    }
}
