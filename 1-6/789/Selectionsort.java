package pureparc;

public class Selectionsort {
public static void main(String[] args) {
	int[] a = {52,62,38,9,18,6,13};
	int temp=0;
	int min;
	System.out.println("before");
	for (int s = 0; s < a.length; s++) {
		System.out.println(a[s] + " ");
	}
	System.out.println();
	
	for (int i = 0; i < a.length; i++) {
		min = i ;
		for (int j = i+1 ; j < a.length; j++) {
			if (a[min] > a[j]) {
				min = j;
			}
			
		}
		temp=a[min];
		a[min]=a[i];
		a[i]=temp;
	}
	
	
	
	System.out.println("sorted array");
	for (int i = 0; i < a.length; i++) {
		
		System.out.println(a[i] + " ");
	}
	System.out.println();
	
}
}
