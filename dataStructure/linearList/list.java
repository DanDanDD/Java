package linearList;

/**
 * @author: Dennis
 * @date: 2020/3/18 20:36
 */

class ListNode{
    public int data;
    public ListNode next;
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

class MyList{
    public ListNode head;
    public MyList(){
        this.head = null;
    }

    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if (this.head == null){
            this.head = node;
        }else {
            node.next = head;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (this.head == null) {
            this.head = node;
        }else{
            cur = this.head;
            while(cur != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //在任意位置插入元素
    private int getListLength(){
        ListNode cur = this.head;
        int count = 0;
        while (cur != null){
            count ++;
            cur = cur.next;
        }
        return count;
    }

    private ListNode searchIndex(int index){
        ListNode cur = this.head;
        for (int count = 0; count < index-1; count++){
            cur = cur.next;
        }
        return cur;
    }

    public boolean addIndex(int index, int data){
        if (index < 0 || index >getListLength()){
            System.out.println("插入位置不合法");
        }
        if (index == 0){
            addFirst(data);
        }
        ListNode node = new ListNode(data);
        ListNode cur = searchIndex(index);
        node.next = cur.next;
        cur.next = node;
        return true;
    }

    //查找链表中是否存在 Key 值
    public boolean contains(int key){
        if (this.head == null){
            return false;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void display(){
        ListNode cur = this.head;
        for(cur = this.head; cur!=null; cur=cur.next){
            System.out.print(cur.data+" ");
        }
        System.out.println(" ");
    }

    //翻转链表
    public ListNode reverseList(ListNode head){
        ListNode cur = this.head;
        ListNode prev = null;
        while (cur != null) {
            ListNode curnext = cur.next;
            cur.next = prev;
            prev = cur;
            cur= curnext;
        }
        return prev;
    }
}




public class list{
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.addFirst(1);
        myList.addFirst(2);
        myList.addFirst(3);
        myList.addFirst(4);
        myList.display();
        myList.display();


    }

}
