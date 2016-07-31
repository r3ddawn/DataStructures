import lists.StacksAndQueues.Queue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ericjohnson
 */
public class QueueTest {
    @Test
    public void pop() {
        Queue queue = new Queue();
        
        queue.push("Hello");
        queue.push("GoodBye");
        queue.push("PopMe");
        queue.print();
        
        assertEquals("Hello", queue.pop());
        assertEquals("GoodBye", queue.pop());
        assertEquals("PopMe", queue.pop());
        
    }
}
