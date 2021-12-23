import java.lang.reflect.Array;
import java.util.*;

public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary) {
        // you write code here
        HashSet<String> list = new HashSet<>(Arrays.asList(player));
        ArrayList<String> AL = new ArrayList<>(Arrays.asList(dictionary));
        int acc = 0;

        for(String s: list){
            if (AL.contains(s)){
                acc+= Math.pow(s.length(),2);
            }
        }
        return acc;
    }
}