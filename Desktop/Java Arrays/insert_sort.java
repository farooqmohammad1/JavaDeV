public class insert_sort {
    public static void main(String[] args) {
        int arr[] = { 20, 1, 4, 7, 8, 2 };
        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {

                if (arr[j] > arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    
                } else {
                    break;
                }
            }
        }
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}
