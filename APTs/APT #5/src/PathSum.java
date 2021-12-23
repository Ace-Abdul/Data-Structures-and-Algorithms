public class PathSum {
    public int hasPath(int target, TreeNode tree){
        // replace with working code
        if(tree==null){
            return 0;
        }
        target -= tree.info;
        if(target==0 && (tree.left == null && tree.right == null)){
            return 1;
        }
        return hasPath(target,tree.left) + hasPath(target,tree.right);
    }
}