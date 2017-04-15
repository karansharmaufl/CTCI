
package graphroute;

public class Node {
    private Node adjacent[];
    public int adjacentCount;
    private String str;
    public GraphRoute.State state;
    
    public Node(String vertex , int adjacentLength)
    {
        this.str=vertex;
        adjacentCount=0;
        adjacent=new Node[adjacentLength];
    }
    
    public void addAdjacent(Node x)
    {
        if(adjacentCount<30)
        {
            this.adjacent[adjacentCount]=x;
            adjacentCount++;
        }
        else
        {
            System.out.println("No more adjacent can be added");
        }
    }
    
    public Node[] getAdjacent()
    {
        return adjacent;
    }
    
    public String getVertex()
    {
        return str;
    }
    
}
