package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(4, node3);
        ListNode node5 = new ListNode(5, node4);

        ListNode node = reverseList(node5);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    /**
     * Use iteratively search Time: O(n) Space: O(1)
     * 
     * @param nums
     * @param targetk
     * @return indices of the nums
     */
    public static ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode curr = null;

        while (head != null) {
            prev = curr;
            curr = head;
            head = head.next;
            curr.next = prev;
        }
        return curr;
    }

    /**
     * Use recursively search Time: O(n) Space: O(n)
     * 
     * @param nums
     * @param targetk
     * @return indices of the nums
     */
    public static ListNode reverseList(ListNode head) {
        return rev(head, null);
    }

    public static ListNode rev(ListNode head, ListNode prev) {
        if (head == null) {
            return prev;
        }

        ListNode temp = head.next;
        head.next = prev;
        return rev(temp, head);
    }

}
