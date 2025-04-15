package pureparc;

public class Bubblesort {
public static void main(String[] args) {
	int[] a = {5,3,8,4,6};
	int temp;
	System.out.print("before ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+",");
	}
	
	System.out.println();
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-1; j++) {
			if (a[j] > a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.print("after ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+",");
	}
	
}
}
