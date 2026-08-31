// Last updated: 8/31/2026, 10:33:50 AM
1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        return height(root) != -1;
4    }
5
6    private int height(TreeNode root) {
7        if (root == null) return 0;
8
9        int left = height(root.left);
10        if (left == -1) return -1;
11
12        int right = height(root.right);
13        if (right == -1) return -1;
14
15        if (Math.abs(left - right) > 1) return -1;
16
17        return 1 + Math.max(left, right);
18    }
19}