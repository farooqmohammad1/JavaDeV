public class swap_two_index {
    public static void main(String[] args) {
        // swap elements of two indexes
        int[] arr = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int temp = arr[2];
        arr[2] = arr[3];
        arr[3] = temp;
       // System.out.println(arr[2] + " " + arr[3]);
       System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
