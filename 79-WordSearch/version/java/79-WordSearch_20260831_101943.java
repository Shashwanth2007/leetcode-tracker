// Last updated: 8/31/2026, 10:19:43 AM
1class Solution {
2    public List<TreeNode> generateTrees(int n) {
3        if (n == 0) return new ArrayList<>();
4        return build(1, n);
5    }
6
7    List<TreeNode> build(int l, int r) {
8        List<TreeNode> ans = new ArrayList<>();
9
10        if (l > r) {
11            ans.add(null);
12            return ans;
13        }
14
15        for (int root = l; root <= r; root++) {
16            for (TreeNode left : build(l, root - 1)) {
17                for (TreeNode right : build(root + 1, r)) {
18                    TreeNode node = new TreeNode(root);
19                    node.left = left;
20                    node.right = right;
21                    ans.add(node);
22                }
23            }
24        }
25
26        return ans;
27    }
28}