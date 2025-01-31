package Stack;

class Stack{
    int size = 10000;
    int[] arr = new int[size];
    int top = -1;

    void push(int x){
        top++;
        arr[top] = x;
    }

    int pop(){
        int temp = arr[top];
        top--;
        return temp;
    }

    int peek(){
        return arr[top];
    }

    int size(){
        return top + 1;
    }

    boolean isEmpty(){
        return top == -1;
    }
}

public class ImplementStackUsingArray {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(12);
        s.push(10);
        System.out.println("Top Element in Stack: "+s.peek());
        System.out.println("Size of stack: "+s.size());
        System.out.println("Delete Element: "+s.pop());
        System.out.println("Size after deletion of stack: "+s.size());
        System.out.println("Top Element after deletion in Stack: "+s.peek());
        System.out.println("Delete Element: "+s.pop());
        System.out.println("Delete Element: "+s.pop());
        System.out.println("Size of stack: "+s.size());
        System.out.println("Check if stack is empty or not: "+s.isEmpty());
    }
}
