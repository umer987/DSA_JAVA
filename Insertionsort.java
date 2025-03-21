package dsap1;

public class Insertionsort {
public static void main(String[] args) {
	System.out.println("::::::::::::::::::::::::::::SIMPLE INSERTION SORT PROGRAM::::::::::::::::::::::::");
	int[] a = {5,1,6,2,4,3};
	System.out.println("UNSORTED ARRAY");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	
	int temp , j;
	for (int i = 0; i < a.length; i++) {
		temp=a[i];
		j=i;
		while (j>0 && a[j-1]>temp) {
			a[j]=a[j-1];
			j=j-1;
		}
		a[j]=temp;
	}
	System.out.println("SORTED ARRAY");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
