// Last updated: 8/31/2026, 10:31:01 AM
1class Solution {
2    int postIndex;
3
4    public TreeNode buildTree(int[] inorder, int[] postorder) {
5        postIndex = postorder.length - 1;
6        return build(inorder, postorder, 0, inorder.length - 1);
7    }
8
9    private TreeNode build(int[] in, int[] post, int left, int right) {
10        if (left > right) return null;
11
12        TreeNode root = new TreeNode(post[postIndex--]);
13        int index = left;
14
15        while (in[index] != root.val) index++;
16
17        root.right = build(in, post, index + 1, right);
18        root.left = build(in, post, left, index - 1);
19
20        return root;
21    }
22}