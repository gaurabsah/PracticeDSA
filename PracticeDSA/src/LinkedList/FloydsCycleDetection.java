package LinkedList;

public class FloydsCycleDetection {

    private Node head;

    private static class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public boolean hasCycle(){
        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }

    public void createLoop(){
        Node first = new Node(1);
        Node second = new Node(4);
        Node third = new Node(8);
        Node fourth = new Node(9);
        Node fifth = new Node(11);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
    }

    public void display(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        FloydsCycleDetection ll = new FloydsCycleDetection();
        ll.createLoop();
//        ll.display(ll.head);
        boolean result = ll.hasCycle();
        if (result){
            System.out.println("List has Loop/Cycle");
        }else {
            System.out.println("List doesn't have Loop/Cycle");
        }
    }
}
