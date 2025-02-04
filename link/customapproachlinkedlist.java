class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList {
    private Node head; // Head of the linked list

    // Constructor to initialize an empty linked list
    public CustomLinkedList() {
        this.head = null;
    }

    // Method to add a new node at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Update the head to the new node
    }

    // Method to display the elements of the linked list
    public void display() {
        Node current = head;
        System.out.print("LinkedList Elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class customapproachlinkedlist {
    public static void main(String[] args) {
        // Create an instance of CustomLinkedList
        CustomLinkedList list = new CustomLinkedList();

        // Add elements to the linked list
        list.addFirst(14);
        list.addFirst(13);
        list.addFirst(2);
        list.addFirst(1);

        // Display the initial linked list
        System.out.println("Initial LinkedList:");
        list.display();

        // Add a new element at the beginning
        list.addFirst(1);

        // Display the updated linked list
        System.out.println("LinkedList after adding 1 at the beginning:");
        list.display();
    }
}