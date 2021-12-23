import java.util.*;

public class PellSequence {
    public String isPellLike(int[] seq){
        ArrayList<Integer> alseq=new ArrayList<>();
        boolean execute=true;
        for (int n: seq){
            alseq.add(n);
        }
        for (int k= 1; k<seq.length; k++){
            int current=seq[k];
            int prev = seq[k-1];
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