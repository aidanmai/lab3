import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test 
	public void testFilter() {
        
        class LengthFilter implements StringChecker {
            public boolean checkString(String s) {
                return s.length() > 5;
            }
        }

        LengthFilter filter = new LengthFilter();
        String[] inputArray = {"hello", "looooooong", "ayo????", "gaming", "nah"};
        ArrayList<String> input = new ArrayList<String>(Arrays.asList(inputArray));
        List<String> output = ListExamples.filter(input, filter);
        String[] outputArray = output.toArray(new String[output.size()]);
        assertArrayEquals(new String[]{"looooooong", "ayo????", "gaming"}, outputArray);

    }

    @Test
    public void merge() {
        String[] inputArray1 = {"aaaa", "bbbb",};
        String[] inputArray2 = {"cccc", "dddd", "eeee"};
        ArrayList<String> input1 = new ArrayList<String>(Arrays.asList(inputArray1));
        ArrayList<String> input2 = new ArrayList<String>(Arrays.asList(inputArray2));
        List<String> output = ListExamples.merge(input1, input2);
        String[] outputArray = output.toArray(new String[output.size()]);
        assertArrayEquals(new String[]{"aaaa", "bbbb", "cccc", "dddd", "eeee"}, outputArray);
    }
}
