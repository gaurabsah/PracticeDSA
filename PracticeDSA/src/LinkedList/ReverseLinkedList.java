package LinkedList;

public class ReverseLinkedList {
    private Node head;

    private static class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void display(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Node reverse(Node head){
        if (head == null){
            return head;
        }
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();

        Node head = new Node(1);
        Node second = new Node(4);
        Node third = new Node(8);
        Node fourth = new Node(9);
        Node fifth = new Node(11);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ll.display(head);

        Node reverse = ll.reverse(head);
        ll.display(reverse);
    }
}
