
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

public class Q7_longFactorial {

    Q7_longFactorial t;

    @Before
    public void setUp() throws Exception {
        t = new Q7_longFactorial();
    }

    @Test
    public void TestFact() {
        int inp = 5;
        int val = 13;
        int an = t.fact(inp);
        int res = t.fact(val);
        String ans="out of range";
        assertEquals(ans, res);
        assertEquals(120, an);

    }
}