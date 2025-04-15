package pureparc;

import pureparc.DLList.Node;

public class Fakedll {

	static class Node{
		Node prev;
		Node next;
		int data;
		Node(int data){
		this.data=data;	
		}
		
	};
	
	
	
	
	public  void printall(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" --->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public  void reverselist(Node head) {
		Node temp = head;
		
		
		while (temp.prev != null) {
			
			System.out.print(temp.data+" --->");
			temp=temp.prev;
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Fakedll list = new Fakedll();
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		a.prev=null;
		a.next=b;
		b.prev=a;
		b.next=c;
		c.prev=b;
		c.next=d;
		d.prev=c;
		d.next=e;
		e.next=null;
		list.printall(a);
		list.reverselist(a);
	}
}
