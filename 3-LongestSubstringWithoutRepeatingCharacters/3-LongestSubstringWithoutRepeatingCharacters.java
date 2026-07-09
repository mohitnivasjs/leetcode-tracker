// Last updated: 09/07/2026, 12:24:51
import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int max = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }

            map.put(ch, end);

            if (end - start + 1 > max) {
                max = end - start + 1;
            }
        }

        return max;
    }
}