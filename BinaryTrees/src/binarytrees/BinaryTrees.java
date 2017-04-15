
package binarytrees;

public class BinaryTrees {
    int data;
    BinaryTrees rChild;
    BinaryTrees lChild;
    BinaryTrees root=null;
    
    public void insert(int value)
    {
        BinaryTrees newNode = new BinaryTrees();
        newNode.data=value;
        
        if(root==null)
            root=newNode;
        
        else
        {
            BinaryTrees current=root;
            BinaryTrees parent;
            
            while(true)
            {
                parent=current;
                if(value<current.data)//go left
                {
                   current=current.lChild;
                   if(current==null)
                   {
                       parent.lChild=newNode;
                       System.out.println("ni");
                       return;
                   }
                }
                
                else
                {
                   current=current.rChild;
                   if(current==null)
                   {
                       parent.rChild=newNode;
                       System.out.println("ni");
                       return;
                   }
                
                }
            }
        }
    }
    
    private void inOrder(BinaryTrees localRoot) 
    {   
        //localRoot=root;
        if(localRoot != null) 
    { 
        inOrder(localRoot.lChild); 
        System.out.println(localRoot.data ); 
        inOrder(localRoot.rChild); 
    } 
    } 
    
    public void inorder()
    {
        inOrder(root);
    }
    

    public static void main(String[] args) {
        
        BinaryTrees b =new BinaryTrees();
        b.insert(3);
        b.insert(5);
        b.insert(2);
        b.insert(32);
        b.insert(8);
        b.insert(7);
        b.insert(9);
        b.insert(13);
        b.inorder();

    }
    
}
