package pureparc;

public class Quell {
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

class queue{
	Node head = null;
	Node tail =null;
	int size = 0;
	public void queue(int x) {
		Node temp = new Node(x);
		if (size == 0) {
			head=temp;
			tail=temp;
				
		}
		else {
			tail.next=temp;
			tail=temp;
		}
		size++;
	}
	
	
	public int peek() {
		if (size == 0) {
			System.out.println("queue is empty");	
		}
		return head.data;
	}
	public int dequeue() {
		if (size == 0) {
			System.out.println("queue is empty");	
		}
		int x =head.data;
		head= head.next;
		size--;
		return x;
	}
	
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print("--->" + temp.data);
			temp= temp.next;
		}
			
	}
	
	
	
	
}




public static void main(String[] args) {
	Quell a = new Quell();
	queue b = a.new queue();
	b.queue(0);
	b.queue(1);
	b.queue(2);
	b.queue(3);
	b.queue(4);
	b.queue(5);
	b.display();
	b.dequeue();
	b.display();
}












}
