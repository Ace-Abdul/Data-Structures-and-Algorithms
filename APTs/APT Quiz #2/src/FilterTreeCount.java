public class FilterTreeCount {
    public int count(TreeNode tree, int low, int high) {
        if (tree==null){
            return 0;
        }
        int ret= 0;
        if ((tree.info>=low) && (tree.info<=high)){
            ret=1;
        }
        return ret + count(tree.left,low, high) + count(tree.right,low,high);
    }
}