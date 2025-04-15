package dsap1;

public class Binarysearch {
public static void main(String[] args) {
	
	int [] a = {2,5,7,9,14,16,17,19,20,24,28};
	int search =2; 
	int li=0;
	int hi =a.length -1;
	int mi = (li+hi)/2;
	
	
	while (li <= hi) {
		
	
	if (a[mi] == search) {
		System.out.println("element is at " + mi + " index position" + " and element is " + search);
		break;
	}
	
	else if(a[mi] < search) {
		li = mi+1;
	}
	else {
		hi = mi-1;
	}
	mi = (li+hi)/2;
	
	}
	}
}
