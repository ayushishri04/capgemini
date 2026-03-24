package linkedList;

import java.util.Scanner;

class MinMaxLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int min, max;
    void addAtBeginning(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            min = max = x;
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        System.out.println("Added at beginning: " + x);
    }
    void addAtEnd(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            min = max = x;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        System.out.println("Added at end: " + x);
    }
    void addAtIndex(int index, int x) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            addAtBeginning(x);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(x);
        newNode.next = temp.next;
        temp.next = newNode;

        min = Math.min(min, x);
        max = Math.max(max, x);

        System.out.println("Added at index " + index + ": " + x);
    }
    void pop() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        int removed = head.data;
        head = head.next;
        recomputeMinMax();
        System.out.println("Popped: " + removed);
    }
    void recomputeMinMax() {
        if (head == null) return;

        min = max = head.data;
        Node temp = head.next;

        while (temp != null) {
            min = Math.min(min, temp.data);
            max = Math.max(max, temp.data);
            temp = temp.next;
        }
    }

    void getMin() {
        if (head != null)
            System.out.println("Minimum: " + min);
    }

    void getMax() {
        if (head != null)
            System.out.println("Maximum: " + max);
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedListBegEnd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MinMaxLinkedList s = new MinMaxLinkedList();
        while (true) {
            System.out.println(
                "\n1.Add at Beginning\n2.Add at End\n3.Add at Index\n4.Pop\n5.GetMin\n6.GetMax\n7.Display\n8.Exit"
            );
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    s.addAtBeginning(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    s.addAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    System.out.print("Enter value: ");
                    s.addAtIndex(idx, sc.nextInt());
                    break;

                case 4:
                    s.pop();
                    break;

                case 5:
                    s.getMin();
                    break;

                case 6:
                    s.getMax();
                    break;

                case 7:
                    s.display();
                    break;

                case 8:
                    System.out.println("Exited");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
