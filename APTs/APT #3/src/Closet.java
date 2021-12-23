import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        // replace this with your code
        HashSet<String> uw = hsof(list);
        ArrayList<String> w = new ArrayList<>(uw);
        Collections.sort(w);
        String ret = String.join(" ", w);

        return ret;
    }

    public HashSet hsof(String [] list){
        HashSet<String> set= new HashSet<>();

        for(String s:list){
            String [] acc = s.split(" ");
            for(String s2: acc){
                set.add(s2);
            }
        }
        return set;
    }
}