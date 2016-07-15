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
    
    
}
