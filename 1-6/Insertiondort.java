package pureparc;

public class Insertiondort {
public static void main(String[] args) {
	int[] a= {5,1,6,2,4,3};
	int j ,temp;
	System.out.println("::::::::::::::::::::::::::::SIMPLE INSERTION SORT PROGRAM::::::::::::::::::::::::");

	System.out.println("UNSORTED ARRAY");
	for (int k = 0; k < a.length; k++) {
		System.out.println(a[k]);
	}
	
	for (int i = 1; i < a.length; i++) {
		temp=a[i];
		j=i;
		while (j>0 && a[j-1]> temp) {
			a[j]=a[j-1];
			j=j-1;
		}
		a[j]=temp;
	}
	
	
	
	
	
	
	
	
	System.out.println("SORTED ARRAY");
	for (int g = 0; g < a.length; g++) {
		System.out.println(a[g]);
	
	}
	
}
}
