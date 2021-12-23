import java.util.*;
public class LeafTrails {
    TreeMap<Integer, String> myMap = new TreeMap<>();
    public String[] trails(TreeNode tree) {
        doWork(tree,"");
        ArrayList<String>al = new ArrayList<>();
        String [] ret = new String [myMap.values().size()];
        int acc = 0;

        for(String p:myMap.values()){
            ret[acc]=p;
            acc++;
        }
        return ret;
    }

    public void doWork(TreeNode tree, String path){
        if (tree==null) return;
        if (tree.left == null && tree.right ==null){
            myMap.put(tree.info,path);
        }

        else{
            doWork(tree.left, path + "0");
            doWork(tree.right, path +"1");
        }
    }
}