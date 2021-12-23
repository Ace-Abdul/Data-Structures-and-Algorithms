import java.util.*;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        for (int k = 0; k < orders.length; k++) {
            if (canMake(orders[k], available)) {
                return k;
            }
        }

        return -1;
    }


    public boolean canMake(String order, String[] available) {

        String[] oArr = order.split(" ");
        HashSet<String> oSet = new HashSet<>(Arrays.asList(oArr));
        ArrayList<String> av = new ArrayList<>(Arrays.asList(available));
        int acc= 0;

        for (String s : oSet) {
            if (av.contains(s)){
                acc++;
            }
        }
        return (acc == oSet.size());
    }

}