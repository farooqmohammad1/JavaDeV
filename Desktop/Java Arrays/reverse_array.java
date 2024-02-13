import java.util.*;
public class reverse_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int startPoint=0,endPoint=arr.length-1;
        while(startPoint<endPoint){
            int temp=arr[startPoint];
            arr[startPoint]=arr[endPoint];
            arr[endPoint]=temp;
            startPoint++;
            endPoint--;
            //System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
