class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/**
 * MiddleLinkedList.java
 *
 * Finds the node in the middle of a linked list.
 */
class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        // Loops while fast hasn't reached node before last.
        // Slow trails behind at half the speed, thus storing the middle node.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}