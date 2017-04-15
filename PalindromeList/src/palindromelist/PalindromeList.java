package palindromelist;
import java.util.*;

public class PalindromeList
{
    int data;
    PalindromeList head=null;
    PalindromeList next;
    
    public void add(int val)
    {
        PalindromeList p=new PalindromeList();
        //p=head;
        p.data=val;
        p.next=head;
        head=p;
       
    }
    
    public void display()
    {
        PalindromeList node;
        node=head;
        while(node!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
    }
    
    public void rev(PalindromeList p)
    {
        PalindromeList head=null;
        PalindromeList q=new PalindromeList();
        while(p!=null)
        {
            
            q.add(p.data);
            q.next=head;
            head=q;
            p=p.next;
        }
        while(p!=null && q!=null)
        {
            System.out.print(p.data);
            p=p.next;
            System.out.print(q.data);
            q=q.next;
        }
        
        //return head;
    }
    
    public boolean isEqual(PalindromeList p, PalindromeList q)
    {
        while(p!=null && q!=null)
        {
       
            if(p.data!=q.data)
            {
                System.out.println("Not a palindrome");
                return false;
            }    
            p=p.next;
            q=q.next;
        }
        System.out.println("Yes");
        return true;
    }
    
    /*private boolean isPalindrome(PalindromeList head)
    {
        PalindromeList reversed=rev(head);
        return isEqual(head,reversed);
    }*/
    
    
    public static void main(String args[])
    {
        PalindromeList p=new PalindromeList();
        p.add(5);
        p.add(6);
        p.add(7);
        p.rev(p);
    }
    
}