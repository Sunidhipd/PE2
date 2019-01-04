
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Q7LongFactorialTest {

    Q7LongFactorial t;

    @Before
    public void setUp() throws Exception {
        t = new Q7LongFactorial();
    }

    @Test
    public void TestFact() {
        int inp = 5;
        int val = 13;
        int an = t.fact(inp);
        int res = t.fact(val);
        int ans = -1;
        assertEquals(ans, res);
        assertEquals(120, an);

    }
}
