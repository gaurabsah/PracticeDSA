package Stack;

import java.util.Stack;

public class BalanceParenthesis {

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();

        for (Character c : ch){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.peek() == '(' && c == ')'){
                    stack.pop();
                } else if (stack.peek() == '{' && c == '}') {
                    stack.pop();
                } else if (stack.peek() == '[' && c == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(({[]}))";
        boolean valid = isValid(str);
        if (valid){
            System.out.println("Balanced...");
        } else {
            System.out.println("Not Balanced...");
        }
    }
}
