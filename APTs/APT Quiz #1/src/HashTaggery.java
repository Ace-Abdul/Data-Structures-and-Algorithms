import java.util.*;

public class HashTaggery {
    public String maxTag(String[] tags, String[] messages) {
        HashSet<String> HashWords = new HashSet<>();
        double count = 0;
        double size = messages.length;

        for(String word : tags){
            for(char letter:word.toCharArray()){
                if(letter == '#'){
                    HashWords.add(word);
                }
            }
        }

        for(String phrase : messages){
            for(String wor: phrase.split(" ")){
                if (wor.charAt(0) == '#'){
                    if (HashWords.contains(wor)){
                        count+= 1.0;
                        break;
                    }
                }
            }
        }

        if(count/size >= 0.75){
            return "tagged";
        }


        return "missed";
    }
}