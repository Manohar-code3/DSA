import java.util.Scanner;

class LinkedList {
    Node head; // head of list

    // Linked list Node
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to append a new node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to delete a node by value
    public void deleteByValue(int value) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == value) {
            head = temp.next; // Change head
            return;
        }

        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return; // Value not found

        prev.next = temp.next; // Unlink the node from the list
    }

    // Method to print the LinkedList
    public void printList() {
        Node currNode = head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Append");
            System.out.println("3. Delete by value");
            System.out.println("4. Print list");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the value to insert at the beginning:");
                    int beginValue = scanner.nextInt();
                    list.insertAtBeginning(beginValue);
                    break;
                case 2:
                    System.out.println("Enter the value to append:");
                    int appendValue = scanner.nextInt();
                    list.append(appendValue);
                    break;
                case 3:
                    System.out.println("Enter the value to delete:");
                    int deleteValue = scanner.nextInt();
                    list.deleteByValue(deleteValue);
                    break;
                case 4:
                    list.printList();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}