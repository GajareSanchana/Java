public class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String s1 = "Hello World   ";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Input: \"" + s1 + "\" -> Output: " + sol.lengthOfLastWord(s1));
        System.out.println("Input: \"" + s2 + "\" -> Output: " + sol.lengthOfLastWord(s2));
        System.out.println("Input: \"" + s3 + "\" -> Output: " + sol.lengthOfLastWord(s3));
    }
}
