// Last updated: 24/08/2026, 18:20:30
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
17    public boolean isSymmetric(TreeNode root) {
18        return check(root.left,root.right);
19    }
20
21    public boolean check(TreeNode left,TreeNode right) {
22        if(left==null&&right==null){
23            return true;
24        }
25        if(left==null||right==null){
26            return false;
27        }
28        if(left.val!=right.val){
29            return false;
30        }
31        return check(left.left,right.right)&&check(left.right,right.left);
32    }
33}