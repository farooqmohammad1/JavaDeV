
import java.util.*;

public class merge_sort {
    // function that returns the merged sorted array
    static void merge(int[] arr, int start, int midPoint, int end) {
        // creating a temporary array
        int[] temp = new int[end - start + 1];
        int left = start, right = midPoint + 1, index = 0;
        while (left <= midPoint && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                index++;
                left++;
            } else {
                temp[index] = arr[right];
                index++;
                right++;
            }
        }
        // for empty left
        while (left <= midPoint) {
            temp[index] = arr[left];
            index++;
            left++;
        }
        // for empty right
        while (right <= end) {
            temp[index] = arr[right];
            index++;
            right++;
        }
        // for filling arr from temp array
        index = 0;
        while (start <= end) {
            arr[start] = temp[index];
            start++;
            index++;
        }

    }

    // for mergesort
    static void mergeSort(int arr[], int start, int end) {
        // for easy one
        if (start == end) {
            return;
        }

        // for mid
        int midPoint = start + (end - start) / 2;
        // for left divide
        mergeSort(arr, start, midPoint);
        // for right divide
        mergeSort(arr, midPoint + 1, end);
        // for merge
        merge(arr, start, midPoint, end);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 1, 2, 8, 9, 10, 7, 3, 10 };
        mergeSort(arr, 0, arr.length - 1);
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
        System.out.println(); // Add a newline after printing the sorted array
    }
}


//

// The time complexity of the merge sort algorithm is O(n log n) in the
// worst-case scenario. This is because the algorithm divides the array into
// halves recursively until it reaches single-element subarrays, and then merges
// them back together in sorted order. The merging step takes O(n) time for each
// level of recursion, and since the recursion tree has a height of log n, the
// total time complexity is O(n log n).

// The space complexity of the merge sort algorithm is O(n) in the worst-case
// scenario. This is because the algorithm requires additional space to store
// the temporary merged subarrays during the merge step. In the worst-case
// scenario, the recursion tree has a height of log n, and at each level, the
// algorithm needs to store the entire array. Therefore, the total space
// complexity is O(n) for the additional space used by the algorithm.//
