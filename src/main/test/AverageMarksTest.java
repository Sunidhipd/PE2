
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q6AverageMarksTest {
        Q6AverageMarks t;

    @Before
    public void setUp() throws Exception {
        t = new Q6AverageMarks();
    }

    @Test
    public void TestAverage() {
        double inp = t.getAverage(4,new int[] {97,89,31,33});
        double val = 62.5;
        double highest=97;
        double min=31;
        double minR=t.getMin(4,new int[] {97,89,31,33});
        double maxR=t.getMax(4,new int[] {97,89,31,33});
        assertEquals(62.5, val,0.001);
        assertEquals(min, minR,0.001);
        assertEquals(highest, maxR,0.001);

    }
}
