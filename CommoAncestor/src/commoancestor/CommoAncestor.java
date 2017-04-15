
package commoancestor;

public class CommoAncestor {
    public static TreeNode commonAncestor(TreeNode p, TreeNode q)
    {
        int delta=depth(p)-depth(q);
        TreeNode first=delta>0?q:p;
        TreeNode second=delta>0?p:q;
        second=goUpBy(second,Math.abs(delta));
        
        while(first!=null && second!=null && first!=second)
        {
            first=first.parent;
            second=second.parent;
        }
        return first==null||second==null?null:first;
        
    }
    
    public static int depth(TreeNode n)
    {
        int depth=0;
        while(n!=null)
        {
            n=n.parent;
            depth++;
        }
        return depth;
    }
    public static TreeNode goUpBy(TreeNode node , int delta) // Send deeper node to level of first node
    {
        while(delta>0 && node!=null)
        {
            node=node.parent;
            delta--;
        }
        return node;
    }

    public static void main(String[] args) {
        TreeNode t=new TreeNode(20);
        t.insert(10);
        t.insert(30);
        TreeNode t1=t.find(10);
        TreeNode t2=t.find(30);
        TreeNode t3=commonAncestor(t1,t2);
        System.out.println(t3.data);
        
        
        
    }
    
}
