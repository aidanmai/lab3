import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testPrepend() {
        LinkedList list = new LinkedList();
        list.prepend(5);
        list.prepend(6);
        assertEquals("6 5", list.toString());
    }
}