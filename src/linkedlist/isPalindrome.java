package linkedlist;

/**
 * Created by yangxiangdong on 2024/6/2.
 */
public class isPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tail = revert(slow);
        while(head != slow){
            if(head.val != tail.val){
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }

    private ListNode revert(ListNode node){
        if(node == null || node.next == null){
            return node;
        }
        ListNode tail = revert(node.next);
        node.next.next = node;
        node.next = null;
        return tail;
    }
}