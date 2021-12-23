public class ListSum {
    public int sum(ListNode list, int thresh) {
        int ret = 0;
        while(list!=null){
            if(list.info>thresh) {
                ret += list.info;
            }
            list = list.next;
        }
        return ret;
    }
}