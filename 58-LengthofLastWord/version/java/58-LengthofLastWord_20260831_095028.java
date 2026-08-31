// Last updated: 8/31/2026, 9:50:28 AM
1class Solution {
2    public String getPermutation(int n, int k) {
3        List<Integer> nums = new ArrayList<>();
4        int fact = 1;
5
6        for (int i = 1; i <= n; i++) {
7            nums.add(i);
8            if (i < n) fact *= i;
9        }
10
11        k--;
12
13        StringBuilder ans = new StringBuilder();
14
15        for (int i = n; i >= 1; i--) {
16            int index = k / fact;
17            ans.append(nums.remove(index));
18
19            k %= fact;
20            if (i > 1) fact /= (i - 1);
21        }
22
23        return ans.toString();
24    }
25}