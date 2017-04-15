
package graphroute;

public class Graph {
    private Node vertices[];
    public int count;
    
    public Graph()
    {
        vertices=new Node[6];
        count=0;
    }
    
    public void addNode(Node x)
    {
        if(count<30)
        {
            vertices[count]=x;
            count++;
        }
        
        else
            System.out.println("Graph Full");
    }
    
    public Node[] getNodes()
    {
        return vertices;
    }
    
    
}