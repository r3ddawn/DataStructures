import lists.Array;
import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void size() {
        Array array = new Array();
        
        assertEquals(0, array.size());
    }
    
    @Test
    public void isEmpty() {
        Array array = new Array();
        
        assertTrue(array.isEmpty());   
    }
    
    @Test
    public void add() {
        Array array = new Array();
        
        array.add("hello", 0);
        assertEquals(1, array.size());
        assertEquals("hello", array.get(0));
        
        array.add("goodbye");
        assertEquals(2, array.size());
        assertEquals("hello", array.get(0));
        assertEquals("goodbye", array.get(1));
        
        array.add("welcome", 1);
        assertEquals(3, array.size());
        assertEquals("hello", array.get(0));
        assertEquals("welcome", array.get(1));
        assertEquals("goodbye", array.get(2));

        array.add("first", 0);
        assertEquals("first", array.get(0));
        assertEquals("hello", array.get(1));
        assertEquals("welcome", array.get(2));
        assertEquals("goodbye", array.get(3));
        
        array.add("last", 4);
        assertEquals("first", array.get(0));
        assertEquals("hello", array.get(1));
        assertEquals("welcome", array.get(2));
        assertEquals("goodbye", array.get(3));
        assertEquals("last", array.get(4));
    }
    
    @Test
    public void delete() {
        Array array = new Array();
        
        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");
        array.add("5");
        
        assertEquals(5, array.size());
        assertEquals("1", array.get(0));
        assertEquals("2", array.get(1));
        assertEquals("3", array.get(2));
        assertEquals("4", array.get(3));
        assertEquals("5", array.get(4));
        
        array.delete(0);
        assertEquals(4, array.size());
        assertEquals("2", array.get(0));
        assertEquals("3", array.get(1));
        assertEquals("4", array.get(2));
        assertEquals("5", array.get(3));
        
        array.delete(2);
        assertEquals(3, array.size());
        assertEquals("2", array.get(0));
        assertEquals("3", array.get(1));
        assertEquals("5", array.get(2));
        
        array.delete(2);
        assertEquals(2, array.size());
        assertEquals("2", array.get(0));
        assertEquals("3", array.get(1));
        
        array.print();
    }
}
