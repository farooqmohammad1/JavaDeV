import java.util.*;
public class sum_of_arr {
    public static void main(String[] args) {
        //read an array and return max
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt(),sum=0;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];

        }
        System.out.println("The sum of an array"+" "+sum);
        sc.close();

    }
}
