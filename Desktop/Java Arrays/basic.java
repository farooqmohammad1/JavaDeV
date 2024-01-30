import java.util.*;

public class basic {
    public static void main(String[] args) {
        // creation of array

        // int[] arr={1,2,3,4,5,6,7};
        // int arr1[]=new int[5];
        // arr1[0]=1;
        // arr1[1]=2;
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // // System.out.print(arr1[i]+" ");
        // }
        // creating an array by taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
       // for (int i = 0; i < arr.length; i++) {
       //    // arr[i] = sc.nextInt();
       //    // System.out.println(arr.length); here what ever size is even as an input that is fixed
       //    // System.out.print(arr[i] + " ");
       // }
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        System.out.print(arr[i]+" ");
    
       }
       //System.out.print(Arrays.toString(arr));//[1, 2, 3, 4, 5] it provides output in this type
       
 
        sc.close();

    }
}