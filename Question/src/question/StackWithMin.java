package question;
import java.util.*;



public class StackWithMin extends Stack<Integer> {

    Stack<Integer> s;
    public StackWithMin()
    {
        s=new Stack<Integer>();
    }
    
    public void push(int value)
    {
        if(value<=min())
            s.push(value);
        super.push(value);
    }
    
    public Integer pop()
    {
        int value=super.pop();
        if(value==min()){
            s.pop();}
        System.out.println(value);
        return value;
    }
    
    public int min()
    {
        if(s.isEmpty()){
            System.out.println(Integer.MAX_VALUE);
            return Integer.MAX_VALUE;}
        System.out.println(s.peek());
        return s.peek();
    }
}
