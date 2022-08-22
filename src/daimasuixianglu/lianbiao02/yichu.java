package daimasuixianglu.lianbiao02;

public class yichu {
    public ListNode removeElements(ListNode head, int val) {

        while(head!=null&&head.val==val){
            head=head.next;
        }
        if(head==null) return head;
        ListNode pre=head,cur=head.next;
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }else{
                pre=cur;
            }
            cur=cur.next;
        }
        return head;

    }
}
