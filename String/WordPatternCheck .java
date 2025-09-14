public class WordPatternCheck {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        int n = pattern.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                boolean samePattern = (pattern.charAt(i) == pattern.charAt(j));
                boolean sameWord = words[i].equals(words[j]);

                if (samePattern != sameWord) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        System.out.println("Pattern: " + pattern1 + " | String: " + s1);
        System.out.println("Output: " + wordPattern(pattern1, s1)); // true

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        System.out.println("\nPattern: " + pattern2 + " | String: " + s2);
        System.out.println("Output: " + wordPattern(pattern2, s2)); // false

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println("\nPattern: " + pattern3 + " | String: " + s3);
        System.out.println("Output: " + wordPattern(pattern3, s3)); // false
    }
}
