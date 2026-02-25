public class Main{
    public static void main(String[] args) {
        String input = "Nurses Run";
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        if (isPalindrome(normalized)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}