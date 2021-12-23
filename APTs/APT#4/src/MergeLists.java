
public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        if(a == null){
            return null;
            }
        ListNode afta= a.next;
        ListNode aftb= b.next;
        a.next= b;
        b.next= weave(afta,aftb);
        return a;
    }
}
