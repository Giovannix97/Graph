package graph;

import java.util.logging.Logger;

/**
 * Represents a generic node
 * 
 * @author Giovanni
 * @version 1.0
 * @since 1.0
 */
public class Node {
    
    //Instance Variable
    private String label;
    
    //Constructor
    public Node(String label) {
        this.label = label;
    }
    
   
    //Getters and Setters
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    
    
    
}
