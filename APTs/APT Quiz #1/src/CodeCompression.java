import java.util.*;

public class CodeCompression {
    public String compress(String message){
        char [] letters = message.toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<>();
        String ret = "";

        for(char let: letters){
            map.putIfAbsent(let, 0);
            map.put(let, map.get(let) + 1);
            char last = let;
        }

        for(char key: map.keySet()){
            ret+= String.valueOf(key) + String.valueOf(map.get(key));
        }

        return ret;
    }
}