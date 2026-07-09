// Last updated: 09/07/2026, 09:45:57
public class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 38;
        System.out.println(sol.addDigits(num));
    }
}
