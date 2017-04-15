
package linkedlist;

import java.util.*;

public class LinkedList {
    public int val;
    public LinkedList next;
    public LinkedList head=null;
    
    
    
    public void insert(int val)
    {
        LinkedList l=new LinkedList();
        l.val=val;
        l.next=head;
        head=l;
    }
    
    public LinkedList del(int val)
    {
        LinkedList prev=head;
        LinkedList curr=head;
        
        while(curr.val!=val)
        {
            if(curr.next==null)
                return null;
            
            else
            {
                prev=curr;
                curr=curr.next;
            }
        }
        
        if(curr==head)
            head=head.next;
        
        else
            prev.next=curr.next;
        
        return curr;
    }
    
    public void delDups()
    {
        HashSet<Integer> h = new HashSet<Integer>();
        LinkedList prev=head;
        LinkedList curr=head;
        
        while(curr!=null)
        {
            if(h.contains(curr.val))
                prev.next=curr.next;
            
            else
            {
                h.add(curr.val);
                prev=curr;
                
            }
            
            curr=curr.next;
        }
        //System.out.println(h);
    }
    
    public void retkLast(int k)
    {
        LinkedList p1=head;
        LinkedList p2=head;
        
        for(int i=0;i<k;i++)
            p1=p1.next;
        
        while(p1.next!=null)
        {
            p1=p1.next;
            p2=p2.next;
        }
        System.out.println("Kth to last :"+p2.val);
    }
    
    public void display()
    {
        LinkedList curr=head;
        while(curr!=null)
        {
            System.out.print(curr.val+" ");
            curr=curr.next;
        }        
    }
    
    public LinkedList partition(int x)
    {
        LinkedList bs=null;
        LinkedList be=null;
        LinkedList as=null;
        LinkedList ae=null;
        LinkedList node=head;
        
        while(node!=null)
        {
            LinkedList p=node.next;
            node.next=null;
           if(node.val<x)
           {
            if(bs==null)
            {
                bs=node;
                be=bs;
            }
            else
            {
                be.next=node;
                be=node;
            }
           }
           
           else
           {
              if(as==null)
              {
                  as=node;
                  ae=as;
              }
              
              else
              {
                  ae.next=node;
                  ae=node;
              }
           }
           node=p;
        }
        if(bs==null)
            return as;
        
        be.next=as;
        while(bs!=null)
        {
            System.out.print(bs.val+ " ");
            bs=bs.next;
        }
        return bs;
        
    }
    
    
    
    
    
    

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insert(10);
        l.insert(5);
        l.insert(60);
        l.insert(40);
       // l.insert(40);
        l.insert(30);
        l.insert(50);
        //l.insert(20);
        //l.insert(30);
        //l.delDups();
       // l.display();
        //l.retkLast(2);
       l.partition(40);
       
         
        
        
        
    }
    
}
