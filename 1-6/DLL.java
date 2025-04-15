package dsap1;

public class DLL {
static class Node{
	int data;
	Node next;
	Node prev;
	Node(int data){
		this.data=data;
	}
}


public static void printall(Node head) {
	Node temp = head;
	while (temp != null) {
		System.out.print(temp.data+"-->");
		temp = temp.next;
	}
	System.out.println();
}

public static void printrev(Node head) {
	Node temp = head;
	while (temp.prev != null) {
		System.out.print(temp.data+"-->");
		temp = temp.prev;
	}
	System.out.println();
}


public static void main(String[] args) {
	// 4 10 2 99 13
	Node a = new Node(4);
	Node b = new Node(10);
	Node c = new Node(2);
	Node d = new Node(99);
	Node e = new Node(13);
	a.prev=null;
	a.next=b;
	b.prev=a;
	b.next=c;
	c.prev=b;
	c.next=d;
	d.prev=c;
	d.next=e;
	e.next=null;
	e.prev=d;
	DLL l = new DLL();
	l.printall(a);
	l.printrev(a);

}
}
