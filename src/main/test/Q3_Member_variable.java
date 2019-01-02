
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Q3_Member_variable {

    MemberVariable mv;

    @Before
    public void setup() throws Exception{
        mv=new MemberVariable();
    }


    @Test
    public void getNameSuccess(){
        String name="amrit";
        mv.setName("amrit");
        assertEquals(name,mv.getName());

    }

    @Test
    public void getNameFail(){

        String namefail="amrit";
        mv.setName("amt");
        assertNotEquals(namefail,mv.getName());

    }

    @Test
    public void getSalarySuccess(){
        int salary=50000;
        mv.setSalary(50000);
        assertEquals(salary,mv.getSalary());

    }

    @Test
    public void getSalaryFailure(){
        int salaryfail=5000;
        mv.setSalary(50000);
        assertNotEquals(salaryfail,mv.getSalary());

    }

    @Test
    public void getAgeSuccess(){
        int age=30;
        mv.setAge(30);
        assertEquals(age,mv.getAge());


    }

    @Test
    public void getAgeFail(){
        int agefail=30;
        mv.setAge(300);
        assertNotEquals(agefail,mv.getAge());
    }



}