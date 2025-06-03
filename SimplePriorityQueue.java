package pureparc;


public class SimplePriorityQueue {
    private int[] heap;
    private int size;
    private int capacity;

    public SimplePriorityQueue(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    // Insert with priority (higher number = higher priority)
    public void insert(int item) {
        if (size == capacity) {
            System.out.println("Queue is full!");
            return;
        }
        
        heap[size] = item;
        int current = size;
        size++;
        
        // Bubble up to maintain heap property
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Remove and return highest priority item
    public int remove() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return max;
    }

    // Peek at highest priority item without removing
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return heap[0];
    }

    // Helper methods
    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void heapify(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    public static void main(String[] args) {
        SimplePriorityQueue pq = new SimplePriorityQueue(10);
        
        pq.insert(3);
        pq.insert(5);
        pq.insert(1);
        pq.insert(8);
        
        System.out.println("Highest priority: " + pq.peek()); // 8
        System.out.println("Removed: " + pq.remove());       // 8
        System.out.println("Now highest: " + pq.peek());     // 5
    }
}