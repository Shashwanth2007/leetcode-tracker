// Last updated: 8/31/2026, 9:43:40 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permuteUnique(int[] nums) {
5        List<List<Integer>> ans = new ArrayList<>();
6
7        Arrays.sort(nums);
8
9        boolean[] used = new boolean[nums.length];
10
11        backtrack(nums, used, new ArrayList<>(), ans);
12
13        return ans;
14    }
15
16    void backtrack(int[] nums, boolean[] used,
17                   List<Integer> current,
18                   List<List<Integer>> ans) {
19
20        if (current.size() == nums.length) {
21            ans.add(new ArrayList<>(current));
22            return;
23        }
24
25        for (int i = 0; i < nums.length; i++) {
26
27            if (used[i])
28                continue;
29
30            // Skip duplicates
31            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
32                continue;
33
34            used[i] = true;
35            current.add(nums[i]);
36
37            backtrack(nums, used, current, ans);
38
39            current.remove(current.size() - 1);
40            used[i] = false;
41        }
42    }
43}