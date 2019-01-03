import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Q1PalindromeTest {

    Q1Palindrome t;

    @Before
    public void setUp() throws Exception {
        t = new Q1Palindrome();
    }

    @Test
    public void TestPalindrome() {
        int inp = 7665;
        int val = 7667;
        boolean an = t.palindrome(inp);
        boolean res = t.palindrome(val);
        assertEquals(false, an);
        assertEquals(true, res);

    }
}