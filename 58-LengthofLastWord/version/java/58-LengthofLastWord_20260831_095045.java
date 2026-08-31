// Last updated: 8/31/2026, 9:50:45 AM
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        if (head == null || head.next == null || k == 0)
4            return head;
5
6        int n = 1;
7        ListNode tail = head;
8
9        while (tail.next != null) {
10            tail = tail.next;
11            n++;
12        }
13
14        k %= n;
15        if (k == 0) return head;
16
17        tail.next = head;
18
19        int steps = n - k;
20        while (steps-- > 0)
21            tail = tail.next;
22
23        ListNode newHead = tail.next;
24        tail.next = null;
25
26        return newHead;
27    }
28}