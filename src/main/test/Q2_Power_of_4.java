import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class Q2_Power_of_4 {
    Q2_power_of_4 t;

    @Before
    public void setUp() throws Exception {
        t = new Q2_power_of_4();
    }

    @Test
    public void Test_Power_4(){
        int i=64;
        int j=30;
        boolean res=t.4_power(i);
        boolean r=t.4_power(j);
        assertEquals(true, res);
        assertEquals(false,r);

    }

}
