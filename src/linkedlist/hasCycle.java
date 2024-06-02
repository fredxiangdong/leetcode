package linkedlist;

/**
 * Created by yangxiangdong on 2024/6/2.
 */
public class hasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null && slow != fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow == fast){
            return true;
        }
        return false;
    }
}
