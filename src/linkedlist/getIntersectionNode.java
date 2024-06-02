package linkedlist;

/**
 * Created by yangxiangdong on 2024/6/2.
 */
public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int lengthA = 1;
        ListNode p = headA;
        while (p.next != null){
            lengthA++;
            p = p.next;
        }
        int lengthB = 1;
        ListNode q = headB;
        while (q.next != null){
            lengthB++;
            q = q.next;

        }
        if(p != q){
            return null;
        }
        if(lengthA > lengthB){
            int t = lengthA - lengthB;
            while (t-- > 0){
                headA = headA.next;
            }
        }
        if(lengthB > lengthA){
            int t = lengthB - lengthA;
            while(t-- > 0){
                headB = headB.next;
            }
        }
        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
