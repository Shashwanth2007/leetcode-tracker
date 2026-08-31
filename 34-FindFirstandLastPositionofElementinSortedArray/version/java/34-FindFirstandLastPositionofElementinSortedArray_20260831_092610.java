// Last updated: 8/31/2026, 9:26:10 AM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        backtrack(candidates, target, 0, new ArrayList<>(), ans);
5        return ans;
6    }
7
8    void backtrack(int[] a, int target, int start,
9                   List<Integer> cur, List<List<Integer>> ans) {
10
11        if (target == 0) {
12            ans.add(new ArrayList<>(cur));
13            return;
14        }
15
16        for (int i = start; i < a.length; i++) {
17            if (a[i] > target) continue;
18
19            cur.add(a[i]);
20            backtrack(a, target - a[i], i, cur, ans);
21            cur.remove(cur.size() - 1);
22        }
23    }
24}