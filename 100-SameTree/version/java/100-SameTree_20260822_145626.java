// Last updated: 22/08/2026, 14:56:26
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        if(p==null && q==null){
4            return true;
5        }
6        if(p==null && q!=null){
7            return false;
8        }
9        if(p!=null && q==null){
10            return false;
11        }
12        if(p.val!=q.val){
13            return false;
14        }
15        boolean leftSide = isSameTree(p.left, q.left);
16        boolean rightSide = isSameTree(p.right, q.right);
17        if(leftSide==true && rightSide==true){
18            return true;
19        }else{
20            return false;
21        }
22    }
23}