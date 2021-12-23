public class RemoveMin {
    public ListNode remove (ListNode list) {
        int min = 99999999;
        ListNode prev = null;
        ListNode minum = list;
        ListNode ret = list;
        ListNode old = null;

        while (list != null){
            if (list.info < min) {
                min = list.info;
                minum = list;
                prev = old;
            }
            old = list;
            list=list.next;
    }
        if (minum == ret){
            ret=ret.next;
            return ret;
        }
        prev.next=minum.next;
        return ret;
    }
}