import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void display() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> NULL");
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LinkedList list = new LinkedList();
            System.out.print("Enter number of elements to insert at beginning: ");
            int n1 = sc.nextInt();
            System.out.println("Enter " + n1 + " elements:");
            for (int i = 0; i < n1; i++) {
                int data = sc.nextInt();
                list.insertAtBeginning(data);
            }
            System.out.println("\nLinked List after Insertion at Beginning:");
            list.display();
            System.out.print("\nEnter number of elements to insert at end: ");
            int n2 = sc.nextInt();
            System.out.println("Enter " + n2 + " elements:");
            for (int i = 0; i < n2; i++) {
                int data = sc.nextInt();
                list.insertAtEnd(data);
            }
            System.out.println("\nLinked List after Insertion at End:");
            list.display();
        }
    }
}