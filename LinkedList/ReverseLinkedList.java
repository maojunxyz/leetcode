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

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode nxt = null;

        while (head != null) {
            pre = nxt;
            nxt = head;
            head = head.next;
            nxt.next = pre;
        }
        return nxt;
    }

}
