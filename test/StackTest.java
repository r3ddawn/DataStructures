import org.junit.Test;
import lists.StacksAndQueues.Stack;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author ericjohnson
 */
public class StackTest {
     @Test
     public void push() {
         Stack stack = new Stack();
         
         stack.push("Hello");
         stack.push("Goodbye");
         stack.push("Pop Me");

         stack.print();
     }
     
     @Test
     public void pushAndPop() {
        Stack stack = new Stack();
         
        stack.push("Hello");
        stack.push("Goodbye");
        stack.push("Pop Me");
        
        stack.print();
        
        assertEquals("Pop Me", stack.pop());
        assertEquals("Goodbye", stack.pop());
        stack.print();
     
     }
}
