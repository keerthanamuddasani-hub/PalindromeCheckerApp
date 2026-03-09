public class Main {

    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeLoop(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "madam";

        long start1 = System.nanoTime();
        boolean result1 = isPalindromeReverse(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = isPalindromeLoop(input);
        long end3 = System.nanoTime();

        System.out.println("Reverse Method: " + result1 + " Time: " + (end1 - start1));
        System.out.println("Two Pointer Method: " + result2 + " Time: " + (end2 - start2));
        System.out.println("Loop Method: " + result3 + " Time: " + (end3 - start3));
    }
}