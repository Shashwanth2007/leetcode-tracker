// Last updated: 8/31/2026, 10:31:58 AM
1class Solution {
2    public List<List<Integer>> levelOrderBottom(TreeNode root) {
3        List<List<Integer>> ans = new LinkedList<>();
4        if (root == null) return ans;
5
6        Queue<TreeNode> q = new LinkedList<>();
7        q.offer(root);
8
9        while (!q.isEmpty()) {
10            int n = q.size();
11            List<Integer> level = new ArrayList<>();
12
13            for (int i = 0; i < n; i++) {
14                TreeNode node = q.poll();
15                level.add(node.val);
16
17                if (node.left != null) q.offer(node.left);
18                if (node.right != null) q.offer(node.right);
19            }
20
21            ans.add(0, level);
22        }
23
24        return ans;
25    }
26}