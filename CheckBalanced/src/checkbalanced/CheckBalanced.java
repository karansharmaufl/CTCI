
package checkbalanced;
import java.util.*;
import java.math.*;


public class CheckBalanced {
    public int getHeight(TreeNode root)
    {
        if(root==null)
            return -1;
        return Math.max(getHeight(root.left), getHeight(root.right))+1;
        
    }
    
    public boolean isBalanced(TreeNode root)
    {
        if(root==null)
        {
            System.out.println("Balanced");
            return true;
        }
        int hdiff=getHeight(root.left)-getHeight(root.right);
        if(Math.abs(hdiff)>1)
        {
            System.out.println("Not balanced");
            return false;
        }
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(5);
        t.insert(3);
        t.insert(6);
        CheckBalanced c=new CheckBalanced();
        c.isBalanced(t);
        
    }
    
}
