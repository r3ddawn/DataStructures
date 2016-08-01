package lists.StacksAndQueues;

/**
 *
 * @author ericjohnson
 */
public interface StacksAndQueues {
    /**
     *  @return True if list is empty; otherwise, false.
     */
    boolean isEmpty();
    
    /**
     *  @return value stored as string
     */
    String pop();
    
    /**
     *  Add Value to list
     * 
     *  @param value
     */
    void push(String value);
    
    /**
     *  Empty the list
     */
    void clear();
}
