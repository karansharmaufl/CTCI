
package threestacks;

public class ThreeStacks {
    private int numStacks=3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;
    
    public ThreeStacks(int stackSize)
    {
        stackCapacity=stackSize;
        values=new int[numStacks*stackSize];
        sizes=new int[numStacks];
    }
    
    public boolean isEmpty(int stackNum)
    {
        return sizes[stackNum]==0;
    }
    
    public boolean isFull(int stackNum)
    {
        return sizes[stackNum]==stackCapacity;
    }
    
    public int indexOfTop(int stackNum)
    {
        int offset=stackNum*stackCapacity;
        int size=sizes[stackNum];
        return offset+size-1;
    }
    
    public void push(int stackNum , int value)
    {
        if(isFull(stackNum))
            System.out.println("Stack full");
        sizes[stackNum]++;
        values[indexOfTop(stackNum)]=value;
    }
    
    public int pop(int stackNum)
    {
        if(isEmpty(stackNum))
            System.out.println("Empty Stack");
        
        int topIndex=indexOfTop(stackNum);
        int value=values[topIndex];
        values[topIndex]=0;
        sizes[stackNum]--;
        System.out.println(value);
        return value;
    }
    
    public int peek(int stackNum)
    {
        if(isEmpty(stackNum))
            System.out.println("Empty Stack");
        
        int a=values[indexOfTop(stackNum)];
        System.out.println(a);
        return values[indexOfTop(stackNum)];
    }
        
        

    
    public static void main(String[] args) {
        ThreeStacks s=new ThreeStacks(3);
        s.push(0,2);
        s.push(0,3);
        s.push(0,4);
        //s.push(1,5);
        //s.push(1,6);
        s.push(2,7);
        s.push(2,8);
        s.push(2,9);
        s.peek(2);
        s.pop(1);
        
        
                
        
    }
    
}
