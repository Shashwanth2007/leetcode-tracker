// Last updated: 8/31/2026, 10:28:09 AM
1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3        return root == null || mirror(root.left, root.right);
4    }
5
6    private boolean mirror(TreeNode a, TreeNode b) {
7        if (a == null && b == null) return true;
8        if (a == null || b == null) return false;
9        return a.val == b.val &&
10               mirror(a.left, b.right) &&
11               mirror(a.right, b.left);
12    }
13}