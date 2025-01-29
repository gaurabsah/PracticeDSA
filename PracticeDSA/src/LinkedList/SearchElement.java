package LinkedList;

public class SearchElement {

    private Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
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

    public boolean search(Node head, int searchKey){
        if (head == null){
            return false;
        }

        Node current = head;
        while (current != null){
            if (current.data == searchKey){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {
        SearchElement ll = new SearchElement();
        ll.head = new Node(1);
        Node second = new Node(3);
        Node third = new Node(8);
        Node forth = new Node(11);

        ll.head.next = second;
        second.next = third;
        third.next = forth;

        ll.display(ll.head);

        int searchKey = 8;

        boolean result = ll.search(ll.head, searchKey);
        if (result){
            System.out.println("Search Key found");
        } else {
            System.out.println("Search Key not found");
        }
    }
}
