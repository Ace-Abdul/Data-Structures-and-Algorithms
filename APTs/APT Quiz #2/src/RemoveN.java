public class RemoveN {
    public ListNode move(ListNode list, int remove, int n) {
        // replace statement below with code you write
        ListNode First = list;
        ListNode target = null;
        ListNode att= null;
        while(list!=null & target == null){
            if (list.info==remove){
                target = list;
                att= target.next;
                break;
            }
            list=list.next;
        }
        while(target!=null & (list!=null && n!=0)){
            list= list.next;
            n-=1;
        }
        if(target!=null & list!=null){
            target.next= list.next;
            list.next= null;
            while(target.next!=null){
                target=target.next;
            }
            target.next=att;
        }
        return First;
    }
}