// Last updated: 8/31/2026, 10:27:50 AM
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        if (p == null && q == null) return true;
4        if (p == null || q == null) return false;
5        return p.val == q.val &&
6               isSameTree(p.left, q.left) &&
7               isSameTree(p.right, q.right);
8    }
9}