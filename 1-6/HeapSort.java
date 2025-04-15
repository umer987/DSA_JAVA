package dsap1;


import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        heapSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Heap Sort Function
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);  // Move current root to the end
            heapify(arr, i, 0);  // Call max heapify on the reduced heap
        }
    }

    // Heapify Function: Converts subtree rooted at 'i' into a max heap
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;  // Assume root is largest
        int left = 2 * i + 1;  // Left child index
        int right = 2 * i + 2; // Right child index

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than current largest
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root, swap and heapify the affected subtree
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    // Swap Function
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
