package linkedlist;

/**
 * @author: Dennis
 * @date: 2020/9/1 18:16
 */

public class Offer52 {
    // 找到两个链表的公共节点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode h1 = headA;
        ListNode h2 = headB;

        while(h1 != h2){
            h1 = (h1 == null)? headB : h1.next;
            h2 = (h2 == null)? headA : h2.next;
        }
        return h1;
    }
}
