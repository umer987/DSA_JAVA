package pureparc;

public class Linkedlist {	Node head;
	class Node{
		int data;
		Node next;
		Node (int data){
			this.data= data;
			this.next =null;
		}}
	
	public void addfirst(int data) {
		Node newnode = new Node(data);
		if(head== null) {
			head= newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	
	public void addlast(int data) {
		Node lasnode = new Node(data);
		if(head== null) {
			head= lasnode;
			return;
		}
		Node currentnode = head;
		while (currentnode.next != null) {
			currentnode = currentnode.next;
		}
		currentnode.next=lasnode;
	}
	public void print() {
		if (head == null) {
			System.out.println("401 error list is empty");
		}
		Node currentnode = head;
		while (currentnode != null) {
			System.out.print(currentnode.data+ "--->");
			currentnode= currentnode.next;
		}
		System.out.println( "null");
	}
	
	public static void main(String[] args) {
	Linkedlist list = new Linkedlist();
	list.addfirst(1);
	list.addfirst(2);
	list.addfirst(3);
	list.addfirst(4);
	list.print();
	list.print();
	list.addlast(5);

	
	
	
	}
}



























//
//Lab Session 1: Introduction to Data Structures & Arrays
//Lab Session 2: Searching Algorithms	
//Lab Session 3: Sorting Algorithms	
//Lab Session 4: Linked Lists	
//Lab Session 5: Doubly Linked Lists
//Lab Session 6: Recursion	
//Lab Session 7: Stacks Using Linked List	
