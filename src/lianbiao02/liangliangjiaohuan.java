package lianbiao02;

public class liangliangjiaohuan {

    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode=new ListNode(0);
        dummyNode.next=head;
        ListNode pre=dummyNode,tmp;
        while(pre.next!=null&&pre.next.next!=null){
            tmp=head.next.next;
            pre.next=head.next;
            head.next.next=head;
            head.next=tmp;
            pre=head;
            head=head.next;
        }
        return dummyNode.next;
    }


}
