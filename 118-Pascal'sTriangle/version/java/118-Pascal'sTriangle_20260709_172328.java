// Last updated: 09/07/2026, 17:23:28
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> generate(int numRows) {
5
6        List<List<Integer>> ans = new ArrayList<>();
7
8        for (int i = 0; i < numRows; i++) {
9
10            List<Integer> row = new ArrayList<>();
11
12            for (int j = 0; j <= i; j++) {
13
14                if (j == 0 || j == i) {
15                    row.add(1);
16                } else {
17                    int value = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
18                    row.add(value);
19                }
20            }
21
22            ans.add(row);
23        }
24
25        return ans;
26    }
27}