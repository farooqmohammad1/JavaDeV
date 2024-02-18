public class quick_sort {
    static int partition(int[] arr, int start, int end) {
        int pos = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] <= arr[end]) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }

        }
        return pos - 1;
    }

    static void quick(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(arr, start, end);
        quick(arr, start, pivot - 1);
        quick(arr, pivot + 1, end);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 2, 1, 9 };
        quick(arr, 0, arr.length - 1);
        for (int ar : arr) {
            System.out.print(ar + " ");
        }

    }
}

// public class quick_sort {
// static int partition(int[] arr, int start, int end) {
// int pos = start;
// for (int i = start; i <= end; i++) {
// if (arr[end] < arr[i]) {
// int temp = arr[i];
// arr[i] = arr[pos];
// arr[pos] = temp;
// pos++;
// }
// }
// int temp = arr[pos];
// arr[pos] = arr[end];
// arr[end] = temp;
// return pos;
// }
//
// static void quickSort(int[] arr, int start, int end) {
// if (start < end) {
// int pivot = partition(arr, start, end);
// quickSort(arr, start, pivot - 1);
// quickSort(arr, pivot + 1, end);
// }
// }

// public static void main(String[] args) {
// int arr[] = { 6, 3, 2, 1, 9 };
// quickSort(arr, 0, arr.length - 1);
// for (int num : arr) {
// System.out.print(num + " ");
// }
// }
// }
