import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

public class Q5_test_isEven {

    Q5_isEven t;

    @Before
    public void setUp() throws Exception {
        t = new Q5_isEven();
    }

    @Test
    public void TestEven() {
        int inp = 7665;
        int val = 7666;
        int an = t.Even(inp);
        int res = t.Even(val);
        assertEquals(false, an);
        assertEquals(true, res);

    }
}