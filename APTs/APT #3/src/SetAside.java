import java.lang.reflect.Array;
import java.util.*;

public class SetAside {
    public String common(String[] list) {
        // replace this with your code
        ArrayList<String> newList= new ArrayList<>(Arrays.asList(list));
        ArrayList<ArrayList> ALOFAL = new ArrayList<>();
        HashSet<String> uw= hsof(list);
        ArrayList<String> ret = new ArrayList<>();

        for (String s: newList){
            String [] ArrWords = s.split(" ");
            ArrayList<String> acc = new ArrayList<>(Arrays.asList(ArrWords));
            ALOFAL.add(acc);
        }
        boolean add = true;

        for(String word : uw){
            for(ArrayList wordA : ALOFAL){
                if(! (wordA.contains(word))){
                    add = false;
                    break;
                }
                else{
                    add = true;
                }

            }
            if(add){
                ret.add(word);
            }

        }
        Collections.sort(ret);

        return String.join(" ", ret);
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