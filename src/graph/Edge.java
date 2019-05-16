package graph;

/**
 *
 * Represents an edge, a link between two nodes.
 * @author Giovanni
 * @version 1.0
 * @since 1.0
 */
public class Edge {
    
    //Instance variables
    private Node nodeU,nodeV;
    
    //Constructor
    public Edge(Node nodeU, Node nodeV) {
        this.nodeU = nodeU;
        this.nodeV = nodeV;
    }
    
    //Getters and Setters

    public Node getNodeU() {
        return nodeU;
    }

    public void setNodeU(Node nodeU) {
        this.nodeU = nodeU;
    }

    public Node getNodeV() {
        return nodeV;
    }

    public void setNodeV(Node nodeV) {
        this.nodeV = nodeV;
    }
    
    
    
    
}
