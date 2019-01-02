import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Q1_PalindromeTest {

    Q1_palindrome t;

    @Before
    public void setUp() throws Exception {
        t = new Q1_palindrome();
    }

    @Test
    public void TestPalindrome() {
        int inp = 7665;
        int val = 7667;
        int an = t.palindrome(inp);
        int res = t.palindrome(val);
        assertEquals(2, an);
        assertEquals(1, res);

    }
}