// Last updated: 8/31/2026, 9:30:38 AM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        backtrack(nums, new ArrayList<>(), ans);
5        return ans;
6    }
7
8    void backtrack(int[] nums, List<Integer> cur,
9                   List<List<Integer>> ans) {
10
11        if (cur.size() == nums.length) {
12            ans.add(new ArrayList<>(cur));
13            return;
14        }
15
16        for (int n : nums) {
17            if (cur.contains(n)) continue;
18
19            cur.add(n);
20            backtrack(nums, cur, ans);
21            cur.remove(cur.size() - 1);
22        }
23    }
24}