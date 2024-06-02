package linkedlist;

/**
 * Created by yangxiangdong on 2024/6/2.
 */
public class reverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tail = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return tail;
    }
}
