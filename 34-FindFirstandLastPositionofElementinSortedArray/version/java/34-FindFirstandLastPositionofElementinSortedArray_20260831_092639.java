// Last updated: 8/31/2026, 9:26:39 AM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        Arrays.sort(candidates);
4
5        List<List<Integer>> ans = new ArrayList<>();
6        backtrack(candidates, target, 0, new ArrayList<>(), ans);
7
8        return ans;
9    }
10
11    void backtrack(int[] a, int target, int start,
12                   List<Integer> cur, List<List<Integer>> ans) {
13
14        if (target == 0) {
15            ans.add(new ArrayList<>(cur));
16            return;
17        }
18
19        for (int i = start; i < a.length; i++) {
20            if (i > start && a[i] == a[i - 1])
21                continue;
22
23            if (a[i] > target)
24                break;
25
26            cur.add(a[i]);
27            backtrack(a, target - a[i], i + 1, cur, ans);
28            cur.remove(cur.size() - 1);
29        }
30    }
31}