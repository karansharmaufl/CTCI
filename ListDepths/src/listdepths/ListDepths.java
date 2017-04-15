
package listdepths;
import java.util.*;

public class ListDepths {
    
    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root)
    {
        ArrayList<LinkedList<TreeNode>> result=new ArrayList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> current=new LinkedList<TreeNode>();
        if(root!=null)
            current.add(root);
        while(current.size()>0)
        {
            result.add(current);
            LinkedList<TreeNode> parents=current;
            current=new LinkedList<TreeNode>();
            for(TreeNode p: parents)
            {
                if(p.left!=null)
                    current.add(p.left);
                if(p.right!=null)
                    current.add(p.right);
            }
        }
        return result;
    }
    public static void printResult(ArrayList<LinkedList<TreeNode>> result){
		int depth = 0;
		for(LinkedList<TreeNode> entry : result) {
			Iterator<TreeNode> i = entry.listIterator();
			System.out.print("Link list at depth " + depth + ":");
			while(i.hasNext()){
				System.out.print(" " + ((TreeNode)i.next()).data);
			}
			System.out.println();
			depth++;
		}
	}
	

    public static void main(String[] args) {
        TreeNode t=new TreeNode(5);
        t.insert(4);
        t.insert(3);
        t.insert(6);
        ArrayList<LinkedList<TreeNode>> list = createLevelLinkedList(t);
        printResult(list);
    }
    
}
