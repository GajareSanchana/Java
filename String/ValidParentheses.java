public class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if ((n & 1) == 1) return false;
        char[] st = new char[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st[++top] = c;
            } else {
                if (top < 0) return false;
                char o = st[top--];
                if ((c == ')' && o != '(') ||
                    (c == '}' && o != '{') ||
                    (c == ']' && o != '[')) {
                    return false;
                }
            }
        }

        return top == -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] tests = {"()", "()[]{}", "(]", "([)]", "([{}])"};

        for (String test : tests) {
            System.out.println(test + " → " + sol.isValid(test));
        }
    }
}
