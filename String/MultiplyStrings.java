public class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n1 = num1.length(), n2 = num2.length();
        int[] result = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];

                result[i + j] += sum / 10;    // carry
                result[i + j + 1] = sum % 10; // current digit
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // skip leading zeros
                sb.append(num);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String num1 = "123";
        String num2 = "456";

        String product = sol.multiply(num1, num2);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + product);
    }
}
