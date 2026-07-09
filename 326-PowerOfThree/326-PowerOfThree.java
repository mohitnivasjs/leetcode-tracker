// Last updated: 09/07/2026, 09:45:53
public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) n /= 3;
        return n == 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 27;
        System.out.println(sol.isPowerOfThree(n));
    }
}
