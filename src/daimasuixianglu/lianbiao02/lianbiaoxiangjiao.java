package daimasuixianglu.lianbiao02;

public class lianbiaoxiangjiao {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0,lenB=0;
        ListNode curA=headA,curB=headB;
        while(curA!=null){
            lenA++;
            curA=curA.next;
        }
        while(curB!=null){
            lenB++;
            curB=curB.next;
        }
        curA=headA;curB=headB;
        if(lenA>lenB){
            int delta=lenA-lenB;
            while (delta-->0){
                curA=curA.next;
            }
        }else {
            int delta=lenB-lenA;
            while (delta-->0){
                curB=curB.next;
            }
        }
        while (curA!=null){
            if(curA!=curB){
                curA=curA.next;
                curB=curB.next;
            }
            else{
                return curA;
            }
        }
        return null;


    }
}
