// Last updated: 8/31/2026, 10:30:33 AM
1class Solution {
2    int preIndex = 0;
3
4    public TreeNode buildTree(int[] preorder, int[] inorder) {
5        return build(preorder, inorder, 0, inorder.length - 1);
6    }
7
8    private TreeNode build(int[] pre, int[] in, int left, int right) {
9        if (left > right) return null;
10
11        TreeNode root = new TreeNode(pre[preIndex++]);
12        int index = left;
13
14        while (in[index] != root.val) index++;
15
16        root.left = build(pre, in, left, index - 1);
17        root.right = build(pre, in, index + 1, right);
18
19        return root;
20    }
21}