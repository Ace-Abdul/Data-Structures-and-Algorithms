import java.util.*;

public class FruitPageant {
    public String[] theBest(String[] votes){
        ArrayList <String> allFruits = new ArrayList();
        ArrayList <String> ret = new ArrayList();
        int max = 0;

        for (String vote:votes){
            allFruits.add(vote.split(":") [1]);
        }

        for(String fruit: allFruits){
            int current = Collections.frequency(allFruits,fruit);
            if(current>max){
                max=current;
            }
        }

        for(String fruit: allFruits){
            int current = Collections.frequency(allFruits,fruit);
            if(current == max & !ret.contains(fruit)){
                ret.add(fruit);
            }
        }
        Collections.sort(ret, Comparator.comparing(String::length).
                                thenComparing(Comparator.naturalOrder()));

        return ret.toArray(new String[0]);
    }
}