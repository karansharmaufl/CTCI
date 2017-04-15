
package stacksort;
import java.util.*;


public class StackSort {

    Stack s1=new Stack();
    Stack s2=new Stack();
    int tmp;
    
    public void sort(Stack<Integer> s)
    {
        Stack<Integer> r=new Stack<Integer>();
        while(!s.isEmpty())
        {
        tmp=s.pop();
        while(!r.isEmpty() && r.peek()>tmp)
            s.push(r.pop());
        }
        r.push(tmp);
        while(!r.isEmpty())
            s.push(r.pop());
        
        
        
        while(!s.isEmpty()){
            for(int i=0;i<s.capacity();i++)
            System.out.println(s.get(i));}
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(9);
        s.push(8);
        s.push(1);
        s.push(6);
        s.push(2);
        s.push(5);
        //s.sort(s);
    }
    
}
