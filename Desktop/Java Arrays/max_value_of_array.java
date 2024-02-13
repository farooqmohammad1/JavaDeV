public class max_value_of_array {
    public static void main(String[] args) {
        // return max value from an array
        int[] arr = { 1, 2, 3, 4, 5, -10, 20 };
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);

        // System.out.println(max);
        // int arr[] = { -1, -10, -4, -40, -3 };
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        // if (max < arr[i])//(arr[i]>max)
        // {
        // max = arr[i];
        // }
        // }
        // System.out.println(max);
    }
}
