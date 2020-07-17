package linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: Dennis
 * @date: 2020/7/17 23:16
 */


class Solution1{
    public static ListNode getkthFromEnd(ListNode head,int k){
        ListNode former = head;
        ListNode latter = head;
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        while (former != null){
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
public class Get_Kth_FromEnd {

}
