package linkList;

/**
 * @author: Dennis
 * @date: 2019/11/25 23:49
 */
class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode MergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val > l2.val) {
            l2.next = MergeTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = MergeTwoLists(l1.next, l2);
            return l1;
        }
    }
}

public class mergeTwoLists {
    public static void main(String[] args) {
        Solution.ListNode l1 = new Solution.ListNode(2);
        Solution.ListNode l2 = new Solution.ListNode(1);
        System.out.println(Solution.MergeTwoLists(l1, l2));
    }
}
