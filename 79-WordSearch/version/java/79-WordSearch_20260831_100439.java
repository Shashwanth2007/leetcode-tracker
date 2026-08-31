// Last updated: 8/31/2026, 10:04:39 AM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode cur = head;
4
5        while (cur != null && cur.next != null) {
6            if (cur.val == cur.next.val)
7                cur.next = cur.next.next;
8            else
9                cur = cur.next;
10        }
11
12        return head;
13    }
14}