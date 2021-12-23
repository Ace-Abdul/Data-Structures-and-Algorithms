import java.util.*;

public class VoteRigging {
    public int minimumVotes(int[] votes) {
        if (votes.length == 0){return 0;}
        int max = getMax(votes);
        int maxIx = getIx(votes);
        int acc = 0;
        if (votes[0] == getMax(Arrays.copyOfRange(votes,1, votes.length) )){return 1;}
        if (votes[0] >= getMax(Arrays.copyOfRange(votes,1, votes.length) )){return 0;}

        while((votes[0]!=max)){
            votes[0]++;
            votes[maxIx]--;
            acc++;
            max = getMax(votes);
            maxIx = getIx(votes);
        }
        if (votes[0] == getMax(Arrays.copyOfRange(votes,1, votes.length) )){return acc+1;}

        return acc;
    }

    public int getMax(int [] vals){
        int max = 0;

        for(int val: vals){
            if(val>max){
                max= val;
            }
        }

        return max;
    }

    public int getIx(int [] vals){
        int max = 0;
        int ret = -1;

        for(int k =0; k<vals.length;k++){
            if(vals[k]>max){
                max= vals[k];
                ret =k;
            }
        }

        return ret;
    }
}