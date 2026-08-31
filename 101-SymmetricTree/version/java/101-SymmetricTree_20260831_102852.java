// Last updated: 8/31/2026, 10:28:52 AM
1class Solution {
2    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
3        List<List<Integer>> ans = new ArrayList<>();
4        if (root == null) return ans;
5
6        Queue<TreeNode> q = new LinkedList<>();
7        q.offer(root);
8        boolean leftToRight = true;
9
10        while (!q.isEmpty()) {
11            int n = q.size();
12            LinkedList<Integer> level = new LinkedList<>();
13
14            for (int i = 0; i < n; i++) {
15                TreeNode node = q.poll();
16
17                if (leftToRight) level.addLast(node.val);
18                else level.addFirst(node.val);
19
20                if (node.left != null) q.offer(node.left);
21                if (node.right != null) q.offer(node.right);
22            }
23
24            ans.add(level);
25            leftToRight = !leftToRight;
26        }
27
28        return ans;
29    }
30}