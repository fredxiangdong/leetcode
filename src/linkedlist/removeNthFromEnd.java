package linkedlist;

/**
 * Created by yangxiangdong on 2024/6/2.
 */
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        int length = 0;
        ListNode first = head;
        while (first != null){
            first = first.next;
            length++;
        }
        int index = length - n;
        first = dummy;
        while (index > 0){
            first = first.next;
            index--;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}
