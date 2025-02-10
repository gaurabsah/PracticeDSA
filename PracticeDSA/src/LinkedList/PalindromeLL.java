package LinkedList;

public class PalindromeLL {

    private static class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
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

    boolean isPalindrome(Node head){
        if (head == null){
            return true;
        }

        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        slowPtr = reverse(slowPtr);
        fastPtr = head;

        while (slowPtr != null){
            if (slowPtr.data != fastPtr.data){
                return false;
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(4);
        Node third = new Node(8);
        Node fourth = new Node(4);
        Node fifth = new Node(1);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        PalindromeLL ll = new PalindromeLL();
        boolean palindrome = ll.isPalindrome(head);
        System.out.println(palindrome ? "LL is Palindrome" : "LL is not Palindrome");

    }
}
