package linkedlist;

/**
 * @author: Dennis
 * @date: 2020/9/1 18:42
 */
// 删除链表的节点
public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null){
            return null;
        }
        if(head.val == val){
            return head.next;
        }

        ListNode cur = head;

        while (cur != null && cur.next.val != val){
            cur = cur.next;
        }

        cur.next = cur.next.next;
        return head;
    }
}
