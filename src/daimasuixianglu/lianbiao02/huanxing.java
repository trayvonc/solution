package daimasuixianglu.lianbiao02;

public class huanxing {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        //检测相交节点
        ListNode fast=head,slow=head;
        Boolean flag=false;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) {
                flag=true;
                break;
            }
        }
        fast=head;
        //从头节点和交节点出发寻找相遇节点
        if(flag){
            while(fast!=null){
                if(fast==slow)return fast;
                fast=fast.next;
                slow=slow.next;
            }
        }
        return null;
    }
}
