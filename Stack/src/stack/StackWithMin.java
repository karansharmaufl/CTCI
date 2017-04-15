
package stack;


public class StackWithMin extends Stack {
    
    Stack s;
    int value;
    public StackWithMin()
    {
        s=new Stack();
    }
    
    public void push(int value)
    {
        if(value<=min())
            s.push(value);
        super.push(value);
            
    }
    
    public int pop()
    {
        int value=super.pop();
        if(value==min())
            s.pop();
        System.out.println(value);
        return value;
    }

    public int min() {
        //if(top==null)
          //  return value;
         return s.peek();
    }
    
    public static void main(String[] args)
    {
      StackWithMin s=new StackWithMin();
      s.push(5);
      s.push(6);
      s.pop();
    }
}
