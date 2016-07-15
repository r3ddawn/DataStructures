package lists;

public interface List /*extends Iterable*/ {
    /**
     * @return Size of list
     */
    int size();
    
    /**
     * @return True if the list is empty; otherwise, false.
     */
    boolean isEmpty();
    
    /**
     * @param index
     * @return Value at index
     */
    String get(int index);
    
    /**
     * Add value at index.
     * 
     * @param value 
     * @param index
     */
    void add(String value, int index);
    
    /**
     * Add value at end.
     * 
     * @param value 
     */
    void add(String value);
    
    /**
     * Delete value at index
     * 
     * @param index 
     */
    void delete(int index);
    
    /**
     * Empty the list
     */
    void clear();   
}
