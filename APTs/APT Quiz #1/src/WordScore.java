import java.util.*;

public class WordScore {
    public int[] score(String[] words, String want, String avoid) {
        int [] ret = new int [words.length];
        HashSet<Character> uniwant = new HashSet<>();
        HashSet<Character> uniavoid = new HashSet<>();

        for (char w:want.toCharArray()){
            uniwant.add(w);
        }
        for (char a:avoid.toCharArray()){
            uniavoid.add(a);
        }

        for( int k = 0; k<words.length; k++) {
            String currentWord = words[k];
            int acc = 0;
            for (char letter : currentWord.toCharArray()) {
                if (uniwant.contains(letter)) {
                    acc++;
                }
                if (uniavoid.contains(letter)) {
                    acc--;
                }
                //ret[k] = acc;
            }
            ret[k] = acc;

        }
        return ret;
    }
}

