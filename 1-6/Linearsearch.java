package dsap1;

public class Linearsearch {

	public  static int lenear(int  array[] ,int d) {
			int n = array.length;
			for (int i = 0; i < n ; i++) {
				if (array[i] == d) 
					return i;
				 
				

			}
			return -1;
	}
	
	
	
	public static void main(String[] args) {
	int array[]= {1,2,3,4,5,6,7,8};
	int d = 5;
	int result = lenear(array,d);
	if (result == -1) {
		System.out.println("element does not exist");
	} else {
		
		System.out.println("element exixt " + result);
	}
}
}
