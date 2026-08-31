// Last updated: 8/31/2026, 10:29:14 AM
1class Solution {
2    public int maxDepth(TreeNode root) {
3        if (root == null) return 0;
4        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
5    }
6}