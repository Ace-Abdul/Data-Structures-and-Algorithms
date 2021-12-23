import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        // replace this with your code
        ArrayList<String> ele = new ArrayList<>(Arrays.asList(list));
        ArrayList<String> ret = new ArrayList<>();



        for(int k = 0; k<ele.size(); k++){
            String current = ele.get(k);
            if (current.length() >= minLength && ! ret.contains(current)){
                ret.add(current);
            }
        }

        String[] ret2= new String [ret.size()];
        ret2 = ret.toArray(ret2);

        return ret2;
    }
}
