import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String str) {
        return strategy.isPalindrome(str);
    }
}

public class Main {

    public static void main(String[] args) {

        String word = "madam";

        PalindromeStrategy strategy = new StackStrategy();
        PalindromeChecker checker = new PalindromeChecker(strategy);

        if (checker.checkPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}