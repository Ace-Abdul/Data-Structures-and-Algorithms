public class DoubleList {
    public ListNode bigify(ListNode list) {
        if (list == null){
            return list;
        }
        ListNode copy = new ListNode(list.info);
        ListNode after = list.next;
        ListNode first = list;
        list.next = copy;
        copy.next= after;
        list= list.next;
        list.next = bigify(list.next);
        return first;
    }
}