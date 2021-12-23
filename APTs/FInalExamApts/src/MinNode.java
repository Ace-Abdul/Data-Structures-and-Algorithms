import java.util.*;

public class MinNode{
    String ret = "";
    int min = 100000;
    public String locate(TreeNode root){
        doWork(root,"");
        return ret;
    }

    public void doWork(TreeNode root, String path){

        if (root==null) {return;}

        if (root.info < min){
            min = root.info;
            ret = path;
        }

        doWork(root.left, path + "0");
        doWork(root.right, path + "1");
    }
}