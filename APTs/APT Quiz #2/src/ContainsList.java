import java.util.*;

public class ContainsList {
    public String check(ListNode first, ListNode second){
        while(first != null){
            if(first.info == second.info){
                ListNode temp1 = first;
                ListNode temp2 = second;

                while(temp1!=null && temp1.info==temp2.info){
                    temp1= temp1.next;
                    temp2= temp2.next;
                    if (temp2==null){return "YES";}
                }
            }
            first = first.next;
        }
        return "NO";
    }
}