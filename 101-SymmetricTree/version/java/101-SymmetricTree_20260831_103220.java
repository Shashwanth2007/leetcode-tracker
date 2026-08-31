// Last updated: 8/31/2026, 10:32:20 AM
1class Solution {
2    public TreeNode sortedArrayToBST(int[] nums) {
3        return build(nums, 0, nums.length - 1);
4    }
5
6    private TreeNode build(int[] nums, int l, int r) {
7        if (l > r) return null;
8
9        int mid = l + (r - l) / 2;
10        TreeNode root = new TreeNode(nums[mid]);
11
12        root.left = build(nums, l, mid - 1);
13        root.right = build(nums, mid + 1, r);
14
15        return root;
16    }
17}