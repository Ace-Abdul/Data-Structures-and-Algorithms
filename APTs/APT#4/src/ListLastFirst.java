public class ListLastFirst {
    public ListNode move(ListNode list) {
        if (list == null){
            return null;
        }

        ListNode First = list;
        while(list.next!= null){
            if(list.next.next == null){
                ListNode Last =list.next;
                list.next= null;
                Last.next= First;
                return Last;
            }
            list=list.next;
        }
        return list;
    }
}