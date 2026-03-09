import java.util.Stack;

class PalindromeChecker {

    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class Main {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String word = "madam";

        if (checker.checkPalindrome(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}