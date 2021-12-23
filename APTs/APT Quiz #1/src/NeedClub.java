import java.util.*;

public class NeedClub {
    public int howmany(String[] names, String[] clubs, String[] sports) {
        // change this code
        HashSet<String> active = new HashSet<>(Arrays.asList(clubs));
        HashSet<String> un = new HashSet<>(Arrays.asList(names));
        active.addAll(Arrays.asList(sports));
        int acc = 0;

        for(String name:un){
            if(! active.contains(name)){
                acc++;
            }
        }

        return acc;
    }
}