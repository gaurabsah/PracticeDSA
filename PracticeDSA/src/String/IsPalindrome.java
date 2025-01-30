package String;

public class IsPalindrome {

    static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();

        return str.equalsIgnoreCase(sb.toString());
    }

    public static void main(String[] args) {
        String str = "MADAM";
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
