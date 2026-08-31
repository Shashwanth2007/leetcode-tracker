// Last updated: 8/31/2026, 10:12:26 AM
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        Arrays.sort(nums);
4
5        List<List<Integer>> ans = new ArrayList<>();
6        backtrack(nums, 0, new ArrayList<>(), ans);
7
8        return ans;
9    }
10
11    void backtrack(int[] nums, int start,
12                   List<Integer> list,
13                   List<List<Integer>> ans) {
14
15        ans.add(new ArrayList<>(list));
16
17        for (int i = start; i < nums.length; i++) {
18            if (i > start && nums[i] == nums[i - 1])
19                continue;
20
21            list.add(nums[i]);
22            backtrack(nums, i + 1, list, ans);
23            list.remove(list.size() - 1);
24        }
25    }
26}