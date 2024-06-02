package linkedlist;

/**
 * Created by yangxiangdong on 2024/6/2.
 */
public class detectCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null && fast != slow){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast == slow){
            slow = head;
            while (slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}