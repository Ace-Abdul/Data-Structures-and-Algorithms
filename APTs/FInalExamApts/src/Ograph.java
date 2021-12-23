import java.util.*;

public class Ograph {
    HashMap<String, HashSet<String>> map = new HashMap<>();
    public int[] components(String[] data) {
        ArrayList<String> allEntries = new ArrayList<>();
        for(String k: data){
            for (String number:k.split(" ")){
                allEntries.add(number);
            }
        }

        String first = allEntries.get(0);
        map.put(first, new HashSet<String>());
        map.get(first).add(allEntries.get(1));
        for(int k = 2; k<allEntries.size(); k+=2){
            String p1= allEntries.get(k);
            String p2= allEntries.get(k+1);
            boolean add = true;
            for (String key : map.keySet()){
                if(p1.equals(key)||p2.equals(key) || map.get(key).contains(p1) || map.get(key).contains(p2)){
                    map.get(key).add(p1);
                    map.get(key).add(p2);
                    add= false;
                }
            }
            if(add){
                map.putIfAbsent(p1, new HashSet<String>());
                map.get(p1).add(p2);
            }

        }

        int [] ret = new int [map.keySet().size()];
        int o=0;
        for( String key: map.keySet()){
            int n = map.get(key).size();
            ret[o]= n;
            o++;
        }

        Arrays.sort(ret);
        return ret;
    }
}