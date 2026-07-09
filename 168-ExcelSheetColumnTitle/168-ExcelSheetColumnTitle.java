// Last updated: 09/07/2026, 12:24:17
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.append((char) ('A' + n % 26));
            n /= 26;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 701;
        System.out.println(sol.convertToTitle(n));
    }
}
