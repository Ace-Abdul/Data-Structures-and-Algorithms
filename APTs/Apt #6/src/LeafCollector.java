import java.util.*;

public class LeafCollector {
    ArrayList<String> ret = new ArrayList<>();
    public String[] getLeaves(TreeNode tree) {
        while(!isLeaf(tree)){
            ArrayList<String> list = new ArrayList<>();
            collectAndRemove(tree, list);
            ret.add(String.join(" ",list));
        }
        ret.add(""+tree.info);
        return ret.toArray(new String[0]);
    }

    public boolean isLeaf(TreeNode t){
        return (t!=null && (t.left == null && t.right == null));
    }

    private void collectAndRemove(TreeNode tree, List<String> list){
        if (tree==null){
            return;
        }
        if(isLeaf(tree.left)){
            list.add("" + tree.left.info);
            tree.left = null;
        }

        collectAndRemove(tree.left,list);


        if(isLeaf(tree.right)){
            list.add("" + tree.right.info);
            tree.right = null;
        }
        collectAndRemove(tree.right,list);
    }


}