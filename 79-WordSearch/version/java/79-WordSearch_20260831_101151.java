// Last updated: 8/31/2026, 10:11:51 AM
1class Solution {
2    public List<Integer> grayCode(int n) {
3        List<Integer> ans = new ArrayList<>();
4
5        for (int i = 0; i < (1 << n); i++)
6            ans.add(i ^ (i >> 1));
7
8        return ans;
9    }
10}