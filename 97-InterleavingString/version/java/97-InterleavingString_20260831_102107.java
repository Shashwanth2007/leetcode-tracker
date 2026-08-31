// Last updated: 8/31/2026, 10:21:07 AM
1class Solution {
2    public boolean isValidBST(TreeNode root) {
3        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
4    }
5
6    boolean check(TreeNode node, long min, long max) {
7        if (node == null) return true;
8
9        if (node.val <= min || node.val >= max)
10            return false;
11
12        return check(node.left, min, node.val) &&
13               check(node.right, node.val, max);
14    }
15}