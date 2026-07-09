// Last updated: 09/07/2026, 17:22:49
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16
17class Solution {
18
19    public TreeNode sortedArrayToBST(int[] nums) {
20        return createTree(nums, 0, nums.length - 1);
21    }
22
23    public TreeNode createTree(int[] nums, int start, int end) {
24
25        if (start > end) {
26            return null;
27        }
28
29        int mid = (start + end) / 2;
30
31        TreeNode node = new TreeNode(nums[mid]);
32
33        node.left = createTree(nums, start, mid - 1);
34        node.right = createTree(nums, mid + 1, end);
35
36        return node;
37    }
38}