public class ListCount {
    public int count (ListNode list) {
        if (list == null){
            return 0;
        }
        /*if(list.next == null){
            return 1;
        }
        list = list.next;*/

        return 1 + count(list.next);
    }
}
