public class ListNode {
    int info;
    ListNode next;

    ListNode(int x){
        info = x;
    }

    public ListNode(int n, ListNode after){
        info = n;
        next= after;
    }
}
