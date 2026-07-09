// Last updated: 09/07/2026, 09:45:58
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 16;
        System.out.println(sol.isPowerOfTwo(n));
    }
}
