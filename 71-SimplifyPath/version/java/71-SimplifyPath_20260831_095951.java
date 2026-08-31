// Last updated: 8/31/2026, 9:59:51 AM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        ans.add(new ArrayList<>());
5
6        for (int x : nums) {
7            int size = ans.size();
8
9            for (int i = 0; i < size; i++) {
10                List<Integer> list = new ArrayList<>(ans.get(i));
11                list.add(x);
12                ans.add(list);
13            }
14        }
15
16        return ans;
17    }
18}