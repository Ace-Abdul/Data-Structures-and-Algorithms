import java.util.*;

public class PopularCelestialBodies {
    public String[] superStars(String[] favs){
        TreeSet<String> set = new TreeSet<>();
        int size = favs.length;
        for(String phrase: favs){
            for(String word:phrase.split(" ")){
                set.add(word);
            }

        }
        for(String phrase: favs){
            ArrayList<String> al = new ArrayList<>();
            for(String word:phrase.split(" ")){
                al.add(word);}

            set.retainAll(al);

        }


        return set.toArray((new String[0]));
    }
}