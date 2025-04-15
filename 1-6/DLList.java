package pureparc;

public class DLList {

	static class Node{
		Node prev;
		Node next;
		int data;
		Node(int data){
		this.data=data;	
		}
		
	};
	
	
	
	
	public  void printall(Node head) {
		
		while (head != null) {
			System.out.print(head.data+" --->");
			head=head.next;
		}
		System.out.println();
	}
	
public void revlist (Node tail) {
	Node temp= tail;
	while (temp != null) {
		System.out.print(temp.data+"-->");
	temp=temp.prev;
	}
	System.out.println();
}
	
	
	public void randomnode(Node index) {
		Node temp =index;
		while (temp.prev != null) {
			temp=temp.prev;
		}
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp=temp.next;
		}
		System.out.println();
	}
	
public static Node insertathead(Node head, int x) {
	Node f = new Node(0);
	head.prev=f;
	f.next=head;
	head=f;
	return head;
}


public Node add_at_any_index(Node head, int index, int x) {
   
    
    Node newNode = new Node(x);
    
   
    
    Node current = head;
    int i = 0;
    
    // Traverse to position before insertion point
    while (i < index - 1 && current.next != null) {
        current = current.next;
        i++;
    }
    
    // Insert new node
    newNode.next = current.next;
    newNode.prev = current;
    
    if (current.next != null) {
        current.next.prev = newNode;
    }
    current.next = newNode;
    
    return head;
}
public Node delthed(Node head) {
 head=head.next;
 head.prev=null;

  return head;  
}


public Node delete_at_any_index(Node head, int index) {
    
    Node current = head;
    int i = 0;
    
    // Traverse to node to be deleted
    while (i < index && current != null) {
        current = current.next;
        i++;
    }
    
    
    
    // Update surrounding nodes' pointers
    if (current.prev != null) {
        current.prev.next = current.next;
    }
    if (current.next != null) {
        current.next.prev = current.prev;
    }
    
    // Clean up references
    current.prev = null;
    current.next = null;
    
    return head;
}


public Node delete_at_last(Node head) {
    
    
    Node current = head;
    while (current.next != null) {
        current = current.next;
    }
    
    current.prev.next = null;
    current.prev = null; // Clean up reference
    
    return head; // Return original head
}
	public static void main(String[] args) {
		DLList list = new DLList();
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
		e.prev=d;
		e.next=null;
		System.out.println("NON-REVERSE");
		list.printall(a);
		System.out.println("REVERSE");

		list.revlist(e);
		System.out.println("BY ANY RANDOM INDEX");
		list.randomnode(c);
		System.out.println("INSERT AT HEAD");
		Node newnode = insertathead(a, 6);
		list.printall(newnode);
		System.out.println("AT ANY INDEX");
		list.add_at_any_index(a, 2, 10);
				list.printall(a);
				System.out.println("delete at last");
				list.delete_at_last(a);			
				list.printall(a);
				System.out.println("DELETE AT ANY INDEX");
		list.delete_at_any_index(a, 2);
		list.printall(a);
		
	}
}






//public static Node insertathead(Node head,int data) {
//	Node f = new Node(6);
//	f.next=head;
//	head.prev=f;
//	head=f;
//	return head;
//}
//Node newnode =insertathead(a, 6);
//list.printall(newnode);


//a=list.delthed(a);
//list.printall(a);
//a=list.dltlast(a);
//System.out.println("lst");
//list.printall(a);
//System.out.println("lst idx");
//list.dlt_at_ind(a,2);
//list.printall(a);