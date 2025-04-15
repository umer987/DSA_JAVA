package dsap1;

class LL2 {
Node head;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
	

public void addfirst(int data) {
	Node newnode = new Node(data);
	if(head == null){
		head=newnode;
		return;
	}
	newnode.next=head;
	head=newnode;
}



public void addlast(int data) {
	Node newnode = new Node(data);
	if(head == null){
		head=newnode;
	}
	Node currnode = head;
	while(currnode.next == null) {
		currnode=currnode.next;
		
	}
	currnode.next=newnode;
}
	

public void print() {
	
	if(head == null){
		System.out.print("list is empty");
	}
	Node currnode = head;
	while(currnode != null) {
		System.out.print(currnode.data + " -->");
		currnode=currnode.next;
		
	}
	System.out.println( "null");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		LL2 list = new LL2();
		list.addfirst(5);
		list.addfirst(13);
		list.addfirst(12);
		list.addfirst(10);
		list.print();
		list.addlast(1);
		list.print();
	}
}
