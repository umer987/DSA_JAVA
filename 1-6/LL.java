package dsap1;


class LL {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	public void addfirst(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			return;
		}
		newnode.next= head;
		head = newnode;
		
		
	}
	
	public void print() {
		if (head == null) {
			System.out.println("401 empty error");
		}
		
		Node currentnode = head;
		while (currentnode != null) {
			System.out.print(currentnode.data+ "--->");
			
		currentnode= currentnode.next;
		}
		System.out.println( "null");
	}
	
	
	public void addlast(int data) {
		Node lastnode = new Node(data);
		if (head == null) {
			head= lastnode;
			return;
		}
		Node currnode = head;
		while (currnode.next != null) {
			currnode = currnode.next;
		}
		 currnode.next=lastnode;
		
	}
	
	
	
	public void deletefirst() {
		if (head == null) {
			System.err.println("401 empty error");
			return;
		}
		head =head.next;
	}
	
	
	
	
	public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current; // Move prev to current
            current = next; // Move current to next
        }
        head = prev; // Update head to the new front of the list
    }
	
	
	
	
	public static void main(String[] args) {
		LL list = new LL();
		list.addfirst(1);
		list.addfirst(2);
		list.addfirst(3);
		list.print();
		list.addlast(0);
		list.print();
		list.addlast(5);
		list.print();
		list.deletefirst();
		list.print();
		list.reverse();
        list.print();
	}
}






















//public void print(){
//	if(head == null) {
//		System.out.println("error its empty");
//	}
//	Node currentnode = head;
//	while (currentnode != null) {
//		System.out.print( currentnode.data +"-->" );
//		currentnode = currentnode.next;
//	}
//}
