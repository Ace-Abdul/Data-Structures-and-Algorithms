import java.util.*;

public class UniqueTreeValues {
    ArrayList<Integer> AL = new ArrayList<Integer>();
    public int[] unique(TreeNode root) {
        if(root==null){
            return new int[]{};
        }
        if(!AL.contains(root.info)){
            AL.add(root.info);
        }
        unique(root.left);
        unique(root.right);
        Collections.sort(AL);
        int[] ret = new int[AL.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = AL.get(i).intValue();
        }
        return ret;
    }
}