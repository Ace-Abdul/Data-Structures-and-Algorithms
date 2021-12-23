public class TreeTighten {
    TreeNode att;
    TreeNode tright;
    public TreeNode tighten(TreeNode t) {
        if(t!=null && (t.left==null && t.right==null)){
            return t;
        }
        if(t!=null && (t.left!=null && t.right==null)){
            return tighten(t.left);
        }
        if(t!=null && (t.right!=null && t.left==null)){
            return tighten(t.right);
        }

        t.left= tighten(t.left);
        t.right= tighten(t.right);
        return t;
    }
}