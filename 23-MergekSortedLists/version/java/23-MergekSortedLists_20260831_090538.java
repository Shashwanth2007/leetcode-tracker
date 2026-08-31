// Last updated: 8/31/2026, 9:05:38 AM
1class Solution {
2    public ListNode swapPairs(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode cur = dummy;
7
8        while (cur.next != null && cur.next.next != null) {
9            ListNode a = cur.next;
10            ListNode b = a.next;
11
12            a.next = b.next;
13            b.next = a;
14            cur.next = b;
15
16            cur = a;
17        }
18
19        return dummy.next;
20    }
21}