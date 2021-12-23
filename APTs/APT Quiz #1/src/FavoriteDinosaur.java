import java.util.*;

public class FavoriteDinosaur {
    public String theBest(String[] dinos) {
        Map <String, ArrayList<String>> map = new TreeMap<>();
        int max = 0;
        String ret = "";
        for(String list: dinos){
            String name = list.split(":") [0];
            String dino = list.split(":") [1];
            map.putIfAbsent(dino, new ArrayList<>());
            map.get(dino).add(name);
        }
        for(String key :map.keySet()){
            int size = map.get(key).size();
            if (size> max){
                max=size;
                ret=key;
            }
        }
        String retString= ret;
        ArrayList<String> names = map.get(ret);
        Collections.sort(names);
        for(String name:names){
            retString += " " + name;
        }
        return retString;
    }
}