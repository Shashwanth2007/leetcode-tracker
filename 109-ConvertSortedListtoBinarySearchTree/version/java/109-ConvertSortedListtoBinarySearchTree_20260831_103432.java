// Last updated: 8/31/2026, 10:34:32 AM
1class Solution {
2    public int minDepth(TreeNode root) {
3        if (root == null) return 0;
4
5        if (root.left == null) return 1 + minDepth(root.right);
6        if (root.right == null) return 1 + minDepth(root.left);
7
8        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
9    }
10}