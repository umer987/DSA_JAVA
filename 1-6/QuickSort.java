package dsap1;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Quick Sort Function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Get Pivot Position
            quickSort(arr, low, pivotIndex - 1); // Sort Left Part
            quickSort(arr, pivotIndex + 1, high); // Sort Right Part
        }
    }

    // Partition Function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = low - 1; // Pointer for smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // If element is smaller than pivot
                i++;
                swap(arr, i, j);
            }
        }
        
        swap(arr, i + 1, high); // Move pivot to correct position
        return i + 1; // Return Pivot Index
    }

    // Swap Function
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

