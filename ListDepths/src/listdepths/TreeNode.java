
package listdepths;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    public int size=0;
    
    public TreeNode(int d)
    {
        this.data=d;
        size=1;
    }
    
    private void setLeftChild(TreeNode left)
    {
        this.left=left;
        if(left!=null)
            left.parent=this;
    }
    
    private void setRightChild(TreeNode right)
    {
        this.right=right;
        if(right!=null)
            right.parent=this;
    }
    
    public void insert(int d)
    {
        if(d<=data)
        {
            if(left==null)
                setLeftChild(new TreeNode(d));
            else
                left.insert(d);
        }
        
        else
        {
            if(right==null)
                setRightChild(new TreeNode(d));
            else
                right.insert(d);
        }
        size++;
    }
    
    public int size()
    {
        return size;
    }
    
    public static TreeNode createMinimalBST(int arr[],int start,int end)
    {
        if(end<start)
            return null;
        
        int mid=(start+end)/2;
        TreeNode n =new TreeNode(arr[mid]);
        n.left=createMinimalBST(arr,start,mid-1);
        n.right=createMinimalBST(arr,mid+1,end);
        return n;
            
    }
    public void inorder(TreeNode root)
    {
        
    }
    
    public static TreeNode createMinimalBST(int array[])
    {
        return createMinimalBST(array,0,array.length-1);
    }
}
