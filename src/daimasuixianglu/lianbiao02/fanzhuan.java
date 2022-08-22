package daimasuixianglu.lianbiao02;

public class fanzhuan {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode pre=null,cur=head,tmp=cur.next;
        while(cur!=null){
            tmp=cur.next;
            if(tmp!=null){
                cur.next=pre;
                cur=tmp;
                pre=cur;
            }

        }
        cur.next=pre;
        head=cur;
        return head;
    }
}
