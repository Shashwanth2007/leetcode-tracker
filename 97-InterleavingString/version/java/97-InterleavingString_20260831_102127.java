// Last updated: 8/31/2026, 10:21:27 AM
1class Solution {
2    TreeNode first, second, prev;
3
4    public void recoverTree(TreeNode root) {
5        inorder(root);
6
7        int temp = first.val;
8        first.val = second.val;
9        second.val = temp;
10    }
11
12    void inorder(TreeNode root) {
13        if (root == null) return;
14
15        inorder(root.left);
16
17        if (prev != null && prev.val > root.val) {
18            if (first == null)
19                first = prev;
20
21            second = root;
22        }
23
24        prev = root;
25
26        inorder(root.right);
27    }
28}