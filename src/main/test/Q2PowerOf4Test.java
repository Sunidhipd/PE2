import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class Q2PowerOf4Test {
    Q2PowerOf4 t;

    @Before
    public void setUp() throws Exception {
        t = new Q2PowerOf4();
    }

    @Test
    public void Test_Power_4(){
        int i=64;
        int j=30;
        boolean res=t.FourPower(i);
        boolean r=t.FourPower(j);
        assertEquals(true, res);
        assertEquals(false,r);

    }

}
