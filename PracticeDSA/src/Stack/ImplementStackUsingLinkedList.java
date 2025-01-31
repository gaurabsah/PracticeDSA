package Stack;



public class ImplementStackUsingLinkedList {

    static class Stack{

        private static class LinkedList {
            int data;
            LinkedList next;

            LinkedList(int data) {
                this.data = data;
                this.next = null;
            }
        }

        LinkedList top;
        int size;

        Stack(){
            this.top = null;
            this.size = 0;
        }

        public void push(int ele){
            LinkedList element = new LinkedList(ele);
            element.next = top;
            top = element;
            System.out.println("Element Pushed");
            size++;
        }

        public int pop(){
            if (top == null){
                return -1;
            }
            int topData = top.data;
            LinkedList temp = top;
            top = top.next;
            size--;
            return topData;
        }

        public int peek(){
            return top.data;
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            return top == null;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(9);
        stack.push(13);
        System.out.println("Top Element in Stack: "+stack.peek());
        System.out.println("Size of stack: "+stack.size());
        System.out.println("Delete Element: "+stack.pop());
        System.out.println("Size after deletion of stack: "+stack.size());
        System.out.println("Top Element after deletion in Stack: "+stack.peek());
        System.out.println("Delete Element: "+stack.pop());
        System.out.println("Delete Element: "+stack.pop());
        System.out.println("Size of stack: "+stack.size());
        System.out.println("Check if stack is empty or not: "+stack.isEmpty());
    }
}
