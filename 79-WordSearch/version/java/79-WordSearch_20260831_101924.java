// Last updated: 8/31/2026, 10:19:24 AM
1class Solution {
2    public List<Integer> inorderTraversal(TreeNode root) {
3        List<Integer> ans = new ArrayList<>();
4        Stack<TreeNode> st = new Stack<>();
5
6        TreeNode cur = root;
7
8        while (cur != null || !st.isEmpty()) {
9            while (cur != null) {
10                st.push(cur);
11                cur = cur.left;
12            }
13
14            cur = st.pop();
15            ans.add(cur.val);
16            cur = cur.right;
17        }
18
19        return ans;
20    }
21}