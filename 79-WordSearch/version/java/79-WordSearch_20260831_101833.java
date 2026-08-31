// Last updated: 8/31/2026, 10:18:33 AM
1class Solution {
2    List<String> ans = new ArrayList<>();
3
4    public List<String> restoreIpAddresses(String s) {
5        backtrack(s, 0, 0, "");
6        return ans;
7    }
8
9    void backtrack(String s, int index, int parts, String path) {
10        if (parts == 4) {
11            if (index == s.length())
12                ans.add(path.substring(1));
13            return;
14        }
15
16        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
17            String part = s.substring(index, index + len);
18
19            if (part.length() > 1 && part.charAt(0) == '0')
20                continue;
21
22            int val = Integer.parseInt(part);
23            if (val > 255) continue;
24
25            backtrack(s, index + len, parts + 1,
26                      path + "." + part);
27        }
28    }
29}