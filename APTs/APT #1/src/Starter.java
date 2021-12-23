import java.util.*;

public class Starter {
    public int begins(String[] words, String first) {
        int acc = 0;
        HashSet<String> al = new HashSet<>(Arrays.asList(words));

        for(String w:al){
            if(w.startsWith(first)) {
                acc++;
            }
        }

        return acc;
    }
}