
package minimaltree;

public class MinimalTree {
    

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        MinimalTree m=new MinimalTree();
      //  m.createMinimalBST(array);
        System.out.println("Root? " + root.data);
       
    }
    
}
