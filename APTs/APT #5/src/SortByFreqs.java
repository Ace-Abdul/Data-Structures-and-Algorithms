import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data){
        ArrayList<String> list = new ArrayList<>(Arrays.asList(data));
        TreeSet<String> set = new TreeSet<>(list);
        ArrayList<String> list2 = new ArrayList<>(set);

        int [] ret = new int [set.size()];
        int n = 0;

        for(String s:set){
            int current = Collections.frequency(list, s);
            ret[n] = current;
            n++;
        }
        ArrayList<Integer> counts = new ArrayList<>();
        for(int l: ret){
            counts.add(l);
        }
        ArrayList<Integer> maxes = new ArrayList<>(counts);
        Collections.sort(maxes,Collections.reverseOrder());

        String [] ret2 = new String[set.size()];
        for(int k=0; k<set.size();k++){

            ret2[k]= list2.get(counts.indexOf(maxes.get(k)));
            counts.set(counts.indexOf(maxes.get(k)), -1);
            maxes.set(k,-1);
        }

        return ret2;
    }
}