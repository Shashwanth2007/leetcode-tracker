// Last updated: 8/31/2026, 10:10:38 AM
1class Solution {
2    HashMap<String, Boolean> memo = new HashMap<>();
3
4    public boolean isScramble(String s1, String s2) {
5        if (s1.equals(s2)) return true;
6
7        String key = s1 + "#" + s2;
8        if (memo.containsKey(key)) return memo.get(key);
9
10        int n = s1.length();
11        int[] count = new int[26];
12
13        for (int i = 0; i < n; i++) {
14            count[s1.charAt(i) - 'a']++;
15            count[s2.charAt(i) - 'a']--;
16        }
17
18        for (int x : count)
19            if (x != 0) {
20                memo.put(key, false);
21                return false;
22            }
23
24        for (int i = 1; i < n; i++) {
25            if ((isScramble(s1.substring(0, i), s2.substring(0, i)) &&
26                 isScramble(s1.substring(i), s2.substring(i))) ||
27                (isScramble(s1.substring(0, i), s2.substring(n - i)) &&
28                 isScramble(s1.substring(i), s2.substring(0, n - i)))) {
29                memo.put(key, true);
30                return true;
31            }
32        }
33
34        memo.put(key, false);
35        return false;
36    }
37}