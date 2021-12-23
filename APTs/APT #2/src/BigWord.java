import java.util.*;


public class BigWord {
    public String most(String[] sentences) {
        // you write code heref
        ArrayList<String> list = new ArrayList<>();
        int max = 0;
        String ret= "";



        for(int k=0; k< sentences.length; k++){
            String [] store = sentences[k].split(" ");

            for(String s: store){
                list.add(s.toLowerCase());
            }
        }
        for(String word : list){
            int count = Collections.frequency(list,word);
            if( count>max){
                max=count;
                ret = word;
            }
        }
        return ret;
}
}