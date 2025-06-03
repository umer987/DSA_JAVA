package pureparc;


public class Myheap {

		int heap[];
		int heapsize;
		int capacity;
		Myheap(int arr[]){
			heap = arr;
			heapsize=arr.length;
			capacity = arr.length;
		}
	public void swap(int i , int j) {
		int temp = heap[i];
		heap[i]=heap[j];
		heap[j]=temp;
	}
	
	
	public void heapify(int index) {
		int largest = index;
		int leftchild = 2*index+1;
		int rightchild = 2*index+2;
		
		if (leftchild< heapsize && heap[leftchild] > heap[index] ) {
			largest= leftchild;
		}
		if (rightchild< heapsize && heap[rightchild] > heap[largest] ) {
			largest= rightchild;
		}
		if(largest!= index) {
			swap( index,largest);
			heapify(index);
		}
		
	}
	
	
	
	
	
	public int extract() {
		if (heapsize == 0) {
			 System.out.println("heap is empty");
		return -1;
		}
		int max = heap[0];
		heap[0]= heap[heapsize-1];
		
		heapsize--;
		heapify(0);
		return max;
	}
	public void buildtree() {
		for (int index = heapsize/2-1; index >=0; index--) {
			heapify(index);
		}
	}
	
	public void print() {
		for (int i = 0; i < heap.length; i++) {
			System.out.print(heap[i]+",");
		}
	}
	public static void main(String[] args) {
		int arr []  = new int[] {10,5,20,6,11};

		Myheap h = new Myheap(arr);
		h.buildtree();
		h.print();
		System.out.println("delete ops");
		h.extract();
		h.print();
	}

}
