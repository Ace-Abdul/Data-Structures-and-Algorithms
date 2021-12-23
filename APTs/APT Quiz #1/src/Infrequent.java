import java.util.*;

public class Infrequent {
    public String find(String[] phrases){
        ArrayList<String> words = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(String sentence: phrases){
            for(String w: sentence.split(" ")){
                words.add(w.toLowerCase());
            }
        }
        for(String word: words){
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }

        int min = 999999999;
        String ret = "";

        for(String key: map.keySet()){
            int current = map.get(key);
            if(current<min){
                min = current;
                ret= key;
            }
        }


        return ret;
    }
}
