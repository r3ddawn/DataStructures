
import lists.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void size() {
        LinkedList list = new LinkedList();

        assertEquals(0, list.size());
    }

    @Test
    public void addOne() {
        LinkedList list = new LinkedList();

        list.add("hello");

        assertEquals(1, list.size());
        assertEquals("hello", list.get(0));
    }

    @Test
    public void addMultiple() {
        LinkedList list = new LinkedList();

        list.add("hello");
        list.add("goodbye");

        assertEquals(2, list.size());
        assertEquals("hello", list.get(0));
        assertEquals("goodbye", list.get(1));
    }
    
    @Test
    public void addComplex() {
        LinkedList list = new LinkedList();
        
        list.add("hello");
        list.add("nice to see you");
        list.add("how have you been?");
        list.add("come again soon");
        list.add("goodbye");
        
        list.add("good, and yourself?", 3);
        
        assertEquals("hello", list.get(0));
        assertEquals("nice to see you", list.get(1));
        assertEquals("how have you been?", list.get(2));
        assertEquals("good, and yourself?", list.get(3));
        assertEquals("come again soon", list.get(4));
        assertEquals("goodbye", list.get(5));
        
        LinkedList list2 = new LinkedList();
        
        list2.add("hello");
        list2.add("goodbye");
        list2.add("stay", 1);
        list2.add("first", 0);
        
        assertEquals("first", list2.get(0));
        assertEquals("hello", list2.get(1));
        assertEquals("stay", list2.get(2));
        assertEquals("goodbye", list2.get(3));
        
        LinkedList list3 = new LinkedList();
        
        list3.add("hello");
        list3.add("goodbye");
        list3.add("stay", 1);
        list3.add("last");
        
        assertEquals("last", list3.get(3));
        assertEquals("hello", list3.get(0));
        assertEquals("stay", list3.get(1));
        assertEquals("goodbye", list3.get(2));
    }

    @Test
    public void deleteSimple() {
        LinkedList list = new LinkedList();

        list.add("1");

        assertEquals(1, list.size());
        assertEquals("1", list.get(0));

        list.delete(0);

        assertEquals(0, list.size());
        try {
            list.get(0);
            fail("Expected Index Out of Bounds");
        }catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void deleteComplex() {
        LinkedList list = new LinkedList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
        list.printList(list);
        
        assertEquals(5, list.size());
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("3", list.get(2));
        assertEquals("4", list.get(3));
        assertEquals("5", list.get(4));

        list.delete(3);

        assertEquals(4, list.size());
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("3", list.get(2));
        assertEquals("5", list.get(3));

        list.delete(0);

        assertEquals(3, list.size());
        assertEquals("2", list.get(0));
        assertEquals("3", list.get(1));
        assertEquals("5", list.get(2));
    }

    @Test
    public void clear() {
        LinkedList list = new LinkedList();

        list.add("Hello");
        list.add("Goodbye");

        assertEquals(2, list.size());
        assertEquals("Hello", list.get(0));
        assertEquals("Goodbye", list.get(1));

        list.clear();

        assertEquals(0, list.size());
        try {
            list.get(0);
            fail("Expected Index Out of Bounds");
        }catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void toList() {
        int[] x = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        LinkedList arrayToList = new LinkedList();
        arrayToList = arrayToList.toList(x);

        assertEquals("0", arrayToList.get(0));
        assertEquals("1", arrayToList.get(1));
        assertEquals("2", arrayToList.get(2));
        assertEquals("3", arrayToList.get(3));
        assertEquals("4", arrayToList.get(4));
        assertEquals("5", arrayToList.get(5));
        assertEquals("6", arrayToList.get(6));
        assertEquals("7", arrayToList.get(7));
        assertEquals("8", arrayToList.get(8));
        assertEquals("9", arrayToList.get(9));
    }
}
