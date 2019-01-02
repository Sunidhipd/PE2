
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
        double inp[] = t.getAverage(4,new double[](97,89,31,33));
        double val = 62.5;
        double highest=97;
        double min=31;
        double minR=t.getMin(inp);
        double maxR=t.getMax(inp);
        assertEquals(62.5, val);
        assertEquals(min, minR);
        assertEquals(highest, maxR);

    }
}