package dsap1;
import java.util.Arrays;

public class Mergesort {
    // Merge Sort function
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // Base case: If array has 1 or no elements, it's already sorted
        }
        
        // Step 1: Divide the array into two halves
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        
        // Step 2: Recursively sort both halves
        mergeSort(left);
        mergeSort(right);
        
        // Step 3: Merge the sorted halves
        merge(arr, left, right);
    }

    // Merge function to combine two sorted arrays
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        // Merge elements from left and right arrays in sorted order
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        // Copy any remaining elements from left array
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        
        // Copy any remaining elements from right array
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Main function to test Merge Sort
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8}; // Unsorted array
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        
        mergeSort(arr); // Sorting the array
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
