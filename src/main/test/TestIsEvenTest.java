import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q5TestIsEvenTest {

    Q5TestIsEven t;

    @Before
    public void setUp() throws Exception {
        t = new Q5TestIsEven();
    }

    @Test
    public void TestEven() {
        int inp = 7665;
        int val = 7666;
        boolean an = t.Even(inp);
        boolean res = t.Even(val);
        assertEquals(false, an);
        assertEquals(true, res);

    }
}
