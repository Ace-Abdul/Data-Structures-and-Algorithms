import java.util.*;

public class EfficientWordMarkov extends BaseWordMarkov {
    private Map<WordGram, ArrayList<String>> myMap;

    public EfficientWordMarkov(){
        this(2);
    }

    public EfficientWordMarkov(int order){
        myOrder = order;
        myMap = new HashMap<>();
    }

    @Override
    public void setTraining(String text){
        super.setTraining(text);
        myMap.clear();

        for (int index = 0; index < (myWords.length - myOrder + 1); index++){
            WordGram current = new WordGram(myWords,index,myOrder);

            if (!myMap.containsKey(current)){
                myMap.put(current, new ArrayList<>());
            }
            if (index + myOrder>= myWords.length){
                myMap.get(current).add(PSEUDO_EOS);
                break;
            }
            String val = myWords[index + myOrder];
            myMap.get(current).add(val);
        }

    }

    @Override
    public ArrayList<String> getFollows(WordGram kGram) {
        return myMap.get(kGram);
    }



}