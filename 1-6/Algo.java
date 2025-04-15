package dsap1;


public class Algo {
    // Bubble Sort function
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,1,6,2,4,3};
		System.out.println("::::::::::::::::::::::::::::SIMPLE BUBBLE SORT PROGRAM::::::::::::::::::::::::");

		System.out.println("unsorted array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] > a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("sorted array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}