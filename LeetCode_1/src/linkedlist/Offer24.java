package linkedlist;

/**
 * @author: Dennis
 * @date: 2020/9/1 22:41
 */

public class Offer24 {
    
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode curnext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curnext;
        }
        return prev;
    }
}