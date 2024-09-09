public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode first = dummyHead;
    ListNode second = dummyHead;
    // Advance 'first' pointer so that the gap between 'first' and 'second' is n nodes apart
    for (int i = 0; i <= n; i++) {
        first = first.next;
    }
    // Move first to the end, maintaining the gap
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return dummyHead.next;
}