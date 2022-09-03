package kaoshi.oppo;

import daimasuixianglu.lianbiao02.ListNode;

public class lianbiaopaixu {
    public ListNode combineTwoDisorderNodeToOrder (ListNode node1, ListNode node2) {
        // write code here
        ListNode p=sortList(node1);
        ListNode q=sortList(node2);
        return merge(p,q);

    }

    public ListNode merge(ListNode node1, ListNode node2){
        ListNode pre=new ListNode(0);
        ListNode q=pre;
        while(node1!=null&&node2!=null){
            if(node1.val<=node2.val){
                q.next=node1;
                node1=node1.next;
            }else{
                q.next=node2;
                node2=node2.next;
            }
            q=q.next;
        }
        q.next=node1==null?node2:node1;
        return pre.next;

    }
    public ListNode sortList(ListNode root){
/*
        ArrayList<ListNode> list=new ArrayList<>();
        ListNode p=node;
        while(p!=null){
            list.add(p);
            p=p.next;
        }
        Collections.sort(list, (o1, o2) -> o1.val-o2.val);
        ListNode res=list.get(0);
        p=res;
        for(int i=0;i<list.size();i++){
            p.next=list.get(i);
            p=p.next;
        }
        p=null;
        return res;
*/
        if(root==null)return root;
        int len=0;
        ListNode node=root;
        while(node!=null){
            len++;
            node=node.next;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=root;
        for(int sub=1;sub<len;sub*=2){
            ListNode pre=dummy,cur=dummy.next;
            while(cur!=null){
                //得到一个部分
                ListNode tmp=cur;
                for(int i=1;i<sub&&cur.next!=null;i++){
                    cur=cur.next;
                }
                //得到第二个部分
                ListNode tmp2=cur.next;
                cur.next=null;
                cur=tmp2;
                for(int i=1;i<sub&&cur!=null&&cur.next!=null;i++){//防止第一段就小于sub  cur!=null
                    cur=cur.next;
                }
                //保存下一个位置并将第二部分截断
                ListNode next=null;
                if(cur!=null){
                    next=cur.next;
                    cur.next=null;
                }

                //合并有序链表
                ListNode m=merge(tmp,tmp2);
                pre.next=m;
                //移到尾巴
                while(pre.next!=null){
                    pre=pre.next;
                }
                //指向下一个
                cur=next;
            }
        }
        return dummy.next;

    }
}
