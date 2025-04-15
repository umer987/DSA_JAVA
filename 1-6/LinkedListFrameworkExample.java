package dsap1;
import java.util.LinkedList;

public class LinkedListFrameworkExample {
    public static void main(String[] args) {
        // Creating a singly linked list
        LinkedList<Integer> list = new LinkedList<>();

        // 1️⃣ Insert elements (Adding at the End)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Linked List after insertions: " + list);

        // 2️⃣ Insert at Beginning
        list.addFirst(5);
        System.out.println("After inserting 5 at the beginning: " + list);

        // 3️⃣ Insert at Specific Position
        list.add(2, 15);  // Insert 15 at index 2
        System.out.println("After inserting 15 at index 2: " + list);

        // 4️⃣ Delete First Element
        list.removeFirst();
        System.out.println("After deleting first element: " + list);

        // 5️⃣ Delete Last Element
        list.removeLast();
        System.out.println("After deleting last element: " + list);

        // 6️⃣ Delete Specific Element
        list.remove(Integer.valueOf(20));  // Remove the element 20
        System.out.println("After deleting 20: " + list);

        // 7️⃣ Retrieve First and Last Elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        // 8️⃣ Check if an Element Exists
        if (list.contains(30)) {
            System.out.println("30 is in the list.");
        } else {
            System.out.println("30 is not in the list.");
        }

        // 9️⃣ Traverse the List
        System.out.print("Traversing List: ");
        for (int num : list) {
            System.out.print(num + " → ");
        }
        System.out.println("null");
    }
}
