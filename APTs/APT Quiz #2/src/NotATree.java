import java.util.*;

public class NotATree {
    public String check(TreeNode root){
        String cond = "is a tree";
        if (root == null){
            return "not a tree";
        }
        if(root.left != null && root.right != null){
            return cond;
        }
        
        if(check(root.left).equals(cond) || check(root.right).equals(cond)){
            return cond;
        }
        return "not a tree";
    }
}