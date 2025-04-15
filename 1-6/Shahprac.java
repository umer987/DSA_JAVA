package dsap1;

public class Shahprac {
public static void main(String[] args) {
	int[] a = {1,200,53,4,5,6};
	System.out.println("BEFORE SWAP");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+",");
	}
	System.out.println();
	int temp;
	temp= a[2];
	a[2]=a[1];
	a[1]=temp;
	System.out.println("AFTER SWAP");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+",");
		
	}
}
}


