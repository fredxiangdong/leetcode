package linkedlist;

/**
 * Created by yangxiangdong on 2024/6/4.
 */
public class sortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode right = sortList(temp);
        ListNode left = sortList(head);
        ListNode h = new ListNode(0);
        ListNode dump = h;
        while (left != null && right != null){
            if(left.val < right.val){
                h.next = left;
                left = left.next;
            }else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left == null ? right : left;
        return dump.next;
    }
}