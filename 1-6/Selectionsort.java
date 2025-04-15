package dsap1;

public class Selectionsort {
	public static void main(String[] args) {
		int[] a= {52,38,9,18,6,62,13};
		int min;
		int temp=0;
		
		System.out.println("unsaasassasorted array");
		for (int s = 0; s < a.length; s++) {
			System.out.println(a[s] + " ");
		}
		System.out.println();
		
		
		
		for (int i = 0; i < a.length; i++) {
			min=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		System.out.println("sorted array");
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}
	
}





//
//
//
//
//
//
//
//
// 
//
//
//
//package dsap1;
//
//public class Selectionsort {
//    public static void main(String[] args) {
//        int[] a = {38, 52, 9, 18, 6, 62, 13}; // Unsorted array
//        int min;
//        int temp; // No need to initialize temp with 0
//
//        // Print Unsorted Array
//        System.out.println("Unsorted Array:");
//        for (int s = 0; s < a.length; s++) {
//            System.out.print(a[s] + " ");
//        }
//        System.out.println(); // Move to next line
//
//        // Selection Sort Algorithm
//        for (int i = 0; i < a.length - 1; i++) { // FIX: Should run up to a.length - 1
//            min = i;
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[j] < a[min]) {
//                    min = j; // Update index of the smallest element
//                }
//            }
//            // Swap a[i] with the smallest element a[min]
//            temp = a[i];
//            a[i] = a[min];
//            a[min] = temp;
//        }
//
//        // Print Sorted Array
//        System.out.println("Sorted Array:");
//        for (int g = 0; g < a.length; g++) {
//            System.out.print(a[g] + " ");
//        }
//        System.out.println(); // Move to next line
//    }
//}
//
