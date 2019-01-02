
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

    public class Q6_AverageMarksTest {
        Q6_AverageMarks t;

    @Before
    public void setUp() throws Exception {
        t = new Q6_AverageMarks();
    }

    @Test
    public void TestAverage() {
        int inp = 7;
        int val = 7666;
        int an = t.Even(inp);
        int res = t.Even(val);
        assertEquals(false, an);
        assertEquals(true, res);

    }
}