// Last updated: 8/31/2026, 9:04:10 AM
1class Solution {
2    public ListNode mergeKLists(ListNode[] lists) {
3        PriorityQueue<ListNode> pq =
4            new PriorityQueue<>((a, b) -> a.val - b.val);
5
6        for (ListNode node : lists)
7            if (node != null) pq.add(node);
8
9        ListNode dummy = new ListNode(0);
10        ListNode cur = dummy;
11
12        while (!pq.isEmpty()) {
13            ListNode node = pq.poll();
14            cur.next = node;
15            cur = cur.next;
16
17            if (node.next != null)
18                pq.add(node.next);
19        }
20
21        return dummy.next;
22    }
23}