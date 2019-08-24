import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JUnitTest {
    @Test
    public void test_findMax() {
        Finder finder = new Finder();
        int[] array = new int[]{};
        assertEquals(null, finder.findMax(array));
    }

    @Test
    public void test_findMax2() {
        Finder finder = new Finder();
        int[] array = null;
        assertEquals(null, finder.findMax(array));
    }

    @Test
    public void test_findMax3() {
        Finder finder = new Finder();
        int[] array = new int[]{1,2,3,4,5};
        int expect = 5;
        int actual = finder.findMax(array);
        assertEquals(expect, actual);
    }

    @Test
    public void test_findMin() {
        Finder finder = new Finder();
        int[] array = new int[]{};
        assertEquals(null, finder.findMin(array));
    }

    @Test
    public void test_findMin2() {
        Finder finder = new Finder();
        int[] array = null;
        assertEquals(null, finder.findMax(array));
    }

    @Test
    public void test_findMin3() {
        Finder finder = new Finder();
        int[] array = new int[]{1,2,3,4,5};
        int expect = 1;
        int actual = finder.findMin(array);
        assertEquals(expect, actual);
    }
}