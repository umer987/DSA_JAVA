package pureparc;

public class LLstack {
	
	
	

public class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
		
	}
}

public class llstacks{
	Node head=null;
	int size =0;
	
	void push(int x) {
		Node temp = new Node(x);
		temp.next=head;
		head=temp;
		size++;
		
	}
	int pop(){
		if (head== null) {
			System.out.println("stack is empty");
		return -1;
		}
		int x =head.data;
		head= head.next;
		return x;
	}
	boolean isempty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	int peek() {
		if (head== null) {
			System.out.println("stack is empty");
		return -1;
		}
		return head.data;
	}
	
	void display () {
		Node temp =head;
		while (temp != null) {
			System.out.print("--->" + temp.data);
			temp=temp.next;
		}
	}
	
}
	
	
public static void main(String[] args) {
	LLstack st = new LLstack();
	llstacks at = st.new llstacks();
	at.push(0);
	at.push(1);
	at.push(2);
	at.push(3);
	at.display();
	
}
}
