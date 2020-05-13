package linkList;

/**
 * @author: Dennis
 * @date: 2019/11/4 23:41
 */
class ListNode {
    public ListNode next;
    int data;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextcur = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextcur;
        }
        return prev;
    }
}

public class reverseList {
    public static void main(String[] args) {

    }
}
