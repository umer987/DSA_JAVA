package dsap1;

class Stack {
int[] stack;
int top;
int capacity;
Stack(int size){
	stack = new int [size];
	top =-1;
	capacity=size;
}


public  void push(int data) {
	if (isFull()) {
		System.err.println("stack is full");
	}
	stack[++top] = data;
	System.out.println(data + " pushed to stack.");
}


public int pop() {
	if (isEmpty()) {
		System.err.println("stack is empty");
		return -1;
	}
	return stack[top--];
}

public int peek() {
    if (isEmpty()) {
        System.out.println("Stack is empty!");
        return -1;
    }
    return stack[top];
}

public boolean isEmpty() {
    return top == -1;
}

// 5️⃣ Check if Stack is Full
public boolean isFull() {
    return top == capacity - 1;
}

public void printStack() {
    if (isEmpty()) {
        System.out.println("Stack is empty.");
        return;
    }
    System.out.print("Stack (Top to Bottom): ");
    for (int i = top; i >= 0; i--) {
        System.out.print(stack[i] + " ");
    }
    System.out.println();
}





}



public class Stacks {
    public static void main(String[] args) {
    	
    	Stack stack = new Stack(12);
    	
    	stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        

        // Print stack
        stack.printStack();

        // Peek element
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Print stack after popping
        stack.printStack();

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    	
    	
    	
    	
    }}












