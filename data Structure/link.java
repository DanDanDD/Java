package linkList;

/**
 * @author: Dennis
 * @date: 2019/10/30 17:52
 */
class ListNode{              //结点类
    public int date;
    public ListNode next;
    public ListNode(int date)
    {
        this.date = date;
        this.next = null;
    }
}

class Mylist{
    public ListNode head;
    public Mylist(){
        this.head=null;
    }

    public void addFirst(int date){                     //头插法
        ListNode node = new ListNode(date);
        if(this.head==null)                            //判断是否第一次插入
            {
            this.head=node;
        }
        else {
            node.next=head;
            this.head=node;
        }
    }

    public void addLast(int date){                    //尾插法
        ListNode node=new ListNode(date);
        ListNode cur=this.head;
        if(this.head==null)
        {
            this.head=node;
        }
        else
            while(cur.next!=null)
            {
                cur=cur.next;
            }
        cur.next=node;
    }
    public void display(){
        ListNode cur=this.head;
        for(cur=this.head;cur!=null;cur=cur.next){
            System.out.print(cur.date+" ");
        }
        System.out.println(" ");
    }

    public boolean contains(int key){             //查找链表中有无key结点
        ListNode cur=this.head;
        while(cur!=null)
        {
            if(cur.date==key)
            {
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    public int getlength(){
        ListNode cur=this.head;
        int count=0;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        return count;
    }

    private ListNode searchIndex(int index){           //找到index-1的位置
        ListNode cur = this.head;
        //cur -> index - 1
        int count = 0 ;
        while (count < index-1){
            count++;
            cur = cur.next;
        }
        return cur;
    }

    public boolean addIndex(int index,int date)
    {
        if(index<0 || index > this.getlength())
        {
            System.out.println("index不合法！");
            return false;
        }
        if(index==0)
        {
            addFirst(date);
            return true;
        }
        //找到index-1 的位置
        ListNode cur = searchIndex(index);
        ListNode node=new ListNode(date);
        node.next = cur.next;
        cur.next = node;
        return true;
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode nextcur = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextcur;
        }
        return prev;
    }
}




public class link {
    public static void main(String[] args) {
        Mylist list=new Mylist();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.display();
        int count=list.getlength();
        System.out.println("链表长度："+count);
        list.addIndex(4,66);
        list.display();
        list.reverseList();
    }

}
