// Last updated: 8/31/2026, 10:17:52 AM
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode prev = dummy;
7
8        for (int i = 1; i < left; i++)
9            prev = prev.next;
10
11        ListNode cur = prev.next;
12
13        for (int i = 0; i < right - left; i++) {
14            ListNode next = cur.next;
15            cur.next = next.next;
16            next.next = prev.next;
17            prev.next = next;
18        }
19
20        return dummy.next;
21    }
22}