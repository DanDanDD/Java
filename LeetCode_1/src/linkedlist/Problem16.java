package linkedlist;

/**
 * @author: Dennis
 * @date: 2020/7/23 13:05
 */

public class Problem16 {
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead == null){
            return pHead;
        }

        ListNode head = new ListNode(0);
        head.next = pHead;

        ListNode prev = head;
        ListNode last = pHead;

        while (last != null){
            while (last.next != null && last.val != last.next.val){
                // 两个节点的值不相等时，都后移
                prev = prev.next;
                last = last.next;
            }
            while (last.next != null && last.val == last.next.val){
                last = last.next;
            }
            if (prev.next != last){
                prev.next = last.next;
            }
            last = last.next; // 去重之后 last 节点也向后移动
        }
        return head.next;
    }
}
