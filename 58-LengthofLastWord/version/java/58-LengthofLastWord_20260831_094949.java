// Last updated: 8/31/2026, 9:49:49 AM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int i = s.length() - 1;
4
5        while (i >= 0 && s.charAt(i) == ' ') i--;
6
7        int count = 0;
8        while (i >= 0 && s.charAt(i) != ' ') {
9            count++;
10            i--;
11        }
12
13        return count;
14    }
15}