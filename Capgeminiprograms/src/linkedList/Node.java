package linkedList;
public class Node {

    static class Node1 {
        int data;
        Node1 next;

        Node1(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);
        System.out.println("Linkedlist:");
        printList(head);
        Node1 prev = null;     
        Node1 current = head;
        while (current != null) {
            Node1 next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev; 
        System.out.println("Reversed:");
        printList(head);
    }
    static void printList(Node1 head) {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
