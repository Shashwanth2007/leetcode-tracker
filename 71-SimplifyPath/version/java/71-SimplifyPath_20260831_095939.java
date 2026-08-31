// Last updated: 8/31/2026, 9:59:39 AM
1class Solution {
2    List<List<Integer>> ans = new ArrayList<>();
3
4    public List<List<Integer>> combine(int n, int k) {
5        backtrack(1, n, k, new ArrayList<>());
6        return ans;
7    }
8
9    void backtrack(int start, int n, int k, List<Integer> list) {
10        if (list.size() == k) {
11            ans.add(new ArrayList<>(list));
12            return;
13        }
14
15        for (int i = start; i <= n; i++) {
16            list.add(i);
17            backtrack(i + 1, n, k, list);
18            list.remove(list.size() - 1);
19        }
20    }
21}