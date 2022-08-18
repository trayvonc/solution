package kaoshi.lianbiao;

import lianbiao02.ListNode;

public class kgeyizufanzhuanlianbiao {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode pre=dummy;
        ListNode end=dummy;
        while(end.next!=null){
            for(int i=0;i<k&&end!=null;i++)end=end.next;
            if(end==null) break;
            ListNode start=pre.next;
            ListNode next=end.next;
            end.next=null;
            pre.next=reverse(start);
            start.next=next;

            pre=start;
            end=start;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode current=head;
        while(current!=null){
            ListNode next=current.next;
            current.next=pre;
            pre=current;
            current=next;

        }
        return pre;

    }
}
