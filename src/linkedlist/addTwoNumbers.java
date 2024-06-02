package linkedlist;

/**
 * Created by yangxiangdong on 2024/6/2.
 */
public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode node = head;
        int carry = 0;
        while(carry != 0 || l1 != null || l2 != null){
            int v1 = 0;
            if(l1 != null){
                v1 = l1.val;
                l1 = l1.next;
            }
            int v2 = 0;
            if(l2 != null){
                v2 = l2.val;
                l2 = l2.next;
            }
            int ret = v1 + v2 + carry;
            ListNode temp = new ListNode(ret % 10);
            carry = ret /10;
            node.next = temp;
            node = temp;
        }
        return head.next;
    }
}
