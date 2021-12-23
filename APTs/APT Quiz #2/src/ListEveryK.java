public class ListEveryK {
    public int sumTheKth(ListNode list, int k){
        int ret = 0;
        int temp= k*1;
        ListNode First= list;

        while (list!=null){
            temp-=1;
            if(temp==0){
                ret+= list.info;
                temp =k;
            }
            list = list.next;
        }
        return ret;
    }
}