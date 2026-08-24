// Last updated: 24/08/2026, 18:03:43
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
16class Solution {
17    public boolean isBalanced(TreeNode root) {
18        if(root==null){
19            return true;
20        }
21        return check(root)!=-1;
22    }
23
24    public int check(TreeNode root){
25        if(root==null){
26            return 0;
27        }
28
29        int left=check(root.left);
30        int right=check(root.right);
31
32        if(left==-1||right==-1||Math.abs(left-right)>1){
33            return -1;
34        }
35
36        return Math.max(left,right)+1;
37    }
38}