
package queuestack;
import java.util.*;
public class QueueStack extends Stack {
    Stack sNew=new Stack();
    Stack sOld=new Stack();
    
    public void pushQueue(int value)
    {
       sNew.push(value); 
    }
    
    public void shift()
    {
        if(sOld.isEmpty())
        {
            while(!sNew.isEmpty())
                sOld.push(sNew.pop());
        }
    }
    
    public void peekQueue()
    {
        shift();
        System.out.println("Peek Value"+sOld.peek());
        
    }
    
    public void popQueue()
    {
        shift();
        System.out.println("Popped Value"+sOld.pop());
    }

    public static void main(String[] args) {
        
        QueueStack s=new QueueStack();
        s.pushQueue(5);
        s.pushQueue(6);
        s.pushQueue(7);
        s.pushQueue(8);
        s.pushQueue(9);
        s.peekQueue();
        s.popQueue();
        s.pushQueue(50);
        s.pushQueue(60);
        s.peekQueue();
       
    }
    
}
