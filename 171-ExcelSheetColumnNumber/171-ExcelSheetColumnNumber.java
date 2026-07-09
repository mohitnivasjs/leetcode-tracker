// Last updated: 09/07/2026, 09:46:06
public class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String columnTitle = "AB";  // Example input
        System.out.println(sol.titleToNumber(columnTitle));  // Output: 28
    }
}
