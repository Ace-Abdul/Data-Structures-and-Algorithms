import java.util.*;

public class LargestCost {
    public String [] cost(String [] words) {
        int max = 0;
        TreeSet<String> ret = new TreeSet<>();

        for (String word:words){
            int count = 0;
            for(char letter : word.toCharArray()){
                int charVal = letter;
                int acc= 0;
                if(charVal%5 == 2){
                    acc+=1;
                }
                if(charVal%5 == 3){
                    acc+=2;
                }
                if(charVal%5 == 4){
                    acc+=3;
                }
                if(charVal%5 == 0){
                    acc+=4;
                }
                if(charVal%5 == 1){
                    acc+=5;
                }
                count+= acc;

            }
            if (count>max){
                max = count;
                ret.clear();
                ret.add(word);
            }
            if(count == max){
                ret.add(word);
            }
        }
        return ret.toArray(new String[0]);

    }
}