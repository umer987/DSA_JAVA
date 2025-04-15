package dsap1;

public class Numsort {
	public static void main(String[] args) {
		int[] a = {2,1,3,4,5};
		System.out.println("unorderd");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		int crsh;
		
	crsh=a[1];
	a[1]=a[0];
	a[0]=crsh;
		
		System.out.println("orderd");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
