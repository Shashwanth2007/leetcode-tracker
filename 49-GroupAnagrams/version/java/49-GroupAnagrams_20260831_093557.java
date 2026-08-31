// Last updated: 8/31/2026, 9:35:57 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap<>();
4
5        for (String s : strs) {
6            char[] ch = s.toCharArray();
7            Arrays.sort(ch);
8
9            String key = new String(ch);
10
11            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
12        }
13
14        return new ArrayList<>(map.values());
15    }
16}