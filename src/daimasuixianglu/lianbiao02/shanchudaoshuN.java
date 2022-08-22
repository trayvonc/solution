package daimasuixianglu.lianbiao02;

public class shanchudaoshuN {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode=new ListNode(-1);
        dummyNode.next=head;
        ListNode pre=dummyNode,fast=head,low=head;
        while(n-->0){
            fast=fast.next;
        }
        while(fast!=null){
            pre=low;
            low=low.next;
            fast=fast.next;
        }
        pre.next=low.next;
        return dummyNode.next;//不能返回head，如果是1个节点会报错
    }
}
