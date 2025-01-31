package Stack;

import java.util.Stack;

public class ReverseStringUsingStack {

    static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();

        for (Character character: ch){
            stack.push(character);
        }

        StringBuilder sb = new StringBuilder(str);
        sb.delete(0,str.length());

        while (!stack.isEmpty()){
            sb.append(stack.peek());
            stack.pop();
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "I am a boy";
        String s = reverseString(str);
        System.out.println(s);
    }
}
