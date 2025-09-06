class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        long reversed = 0; // use long to avoid overflow

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }

    // Main method to test and print results
    public static void main(String[] args) {
        Solution sol = new Solution();

        int num1 = 121;
        int num2 = -121;
        int num3 = 123;

        System.out.println(num1 + " is palindrome? " + sol.isPalindrome(num1));
        System.out.println(num2 + " is palindrome? " + sol.isPalindrome(num2));
        System.out.println(num3 + " is palindrome? " + sol.isPalindrome(num3));
    }
}
