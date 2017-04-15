
package validatebst;
import java.util.*;

public class ValidateBst {
    int index=0;
    public void copyBst(TreeNode root , int[] a)
    {
        if(root==null)
            return;
        copyBst(root.left,a);
        a[index]=root.data;
        index++;
        copyBst(root.right,a);
        
    }
    
    public static boolean check(TreeNode root)
    {
        int[] a=new int[root.size];
        for(int i=1;i<=a.length;i++)
            if(a[i]<=a[i-1]){
                System.out.println("Not valid");
                return true;
            }
        System.out.println("Yes it is BST");
        return true;
        
            
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(10);
        t.insert(8);
        t.insert(6);
        check(t);
        
    }
    
}
