import java.util.*;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        //StringBuilder sb = new StringBuilder("");
        ArrayList<String> acc = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        ArrayList<String> ret = new ArrayList<>();

        for(String s: phrases){
            char [] cArr= s.toLowerCase().toCharArray();
            Arrays.sort(cArr);
            StringBuilder sb = new StringBuilder();
            for(char c: cArr){
                ;
                if (! (c==' ')){
                    sb.append(c);
                }

            }
            String sortedLet = sb.toString();
            acc.add(sortedLet);

        }
        for(int k=0; k< phrases.length; k++){
            String current = acc.get(k);
            int num = Collections.frequency(acc, current);
            if((! (set.contains(current))) && num>=1){
                set.add(current);
                ret.add(phrases[k]);
            }

        }
        String [] ans = ret.toArray(new String[0]);

        // fill in code here
        /*ArrayList< Integer []> count= new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for(String s: phrases){
            count.add(getCounts(s));
        }
        for(int k = 0; k< phrases.length< k++){
            int acc = Collections.frequency(count, count[k]);
            if(acc>=2){
                result.add(phrases[k]);
                for(Integer [] i: count){
                    if (i.equals(count[k]))

                        count.remove(i);
                }

            }
        }
        return phrases;



    }
    public Integer [] getCounts (String s){
        Integer [] counts = new Integer [123];
        char [] arr= s.toLowerCase().toCharArray();
        for(char ch: arr){
            counts[ch] ++;
        }
        return counts;
    }*/
    return ans;}
}