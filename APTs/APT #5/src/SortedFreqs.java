import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(data));
        TreeSet<String> set = new TreeSet<>(list);
        int [] ret = new int [set.size()];
        int n = 0;

        for(String s:set){
            int current = Collections.frequency(list, s);
            ret[n] = current;
            n++;
        }

        return ret;
    }
}