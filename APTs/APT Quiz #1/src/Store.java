import java.util.*;

public class ig {
    public String isPellLike(int[] seq){
        ArrayList<Integer> alseq = new ArrayList<>();
        boolean execute = true;

        for (int n: seq){
            alseq.add(n);
        }

        for (int k= 1; k < seq.length; k++){
            int current = seq[k];
            int prev = seq[k-1];
            if (k==1){
                if(current != prev +  1 ){
                    execute = false;
                    break;
                }

            }
            if (k>1){
                if((current != (2 * prev +  seq[k-2]))){
                    execute = false;
                    break;
                }

            }
        }
        if(execute){
            return "Yes";
        }
        return "No";
    }
}







import java.util.*;

public class FavoriteDinosaur {
    public String theBest(String[] dinos) {
        TreeMap <String, ArrayList<String>> map = new TreeMap<>();
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
                max = size;
                ret= key;
            }
        }

        String retString = ret;

        ArrayList<String> names = map.get(ret);
        Collections.sort(names);
        for(String name:names){
            retString +=  " " + name;
        }


        return retString;
    }
}