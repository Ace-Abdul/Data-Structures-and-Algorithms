import java.util.*;

public class PairDown {
    public int[] fold(int[] list) {
        // change this code
        int retSize = (int) ((list.length +1)/2);
        int[] ret = new int[retSize];
        int acc = 0;

        for(int k = 0; k < list.length; k+=2){

            if ((list.length % 2 == 1) && (k == list.length - 1)){
                ret[acc] = list[k];
            }

            else{
                ret[acc] = list[k] + list[k+1];
                acc++;
            }

        }

        return ret;
    }
}