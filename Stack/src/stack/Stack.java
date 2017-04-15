
package stack;

import java.util.EmptyStackException;

public class Stack {
    public int data;
    public Stack top;
    public Stack next;
    
    
    
    public int pop()
    {
        if(top==null)
            throw new EmptyStackException();
        
        
        int item=top.data;
        top=top.next;
        System.out.println(item);
        
         return item;  
    }
    
    public void push(int item)
    {
        Stack s=new Stack();
        s.data=item;
        s.next=top;
        top=s;
        
    }
    
    public void display()
    {
        while(top!=null)
        {
            System.out.println(top.data);
            top=top.next;
        }
    }
    
    public int peek()
    {
        if(top==null)
            System.out.println("Err");
        else
        System.out.println(top.data);
        return top.data;
    }

    public static void main(String[] args) {
       
        
      Stack s=new Stack();
      s.push(5);
      s.push(6);
      s.push(7);
      s.push(3);
      s.push(4);
      s.push(9);
      //s.peek();
      s.pop();
    }
    
}
