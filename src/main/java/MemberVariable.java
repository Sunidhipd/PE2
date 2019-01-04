public class MemberVariable {

    private String Name;
    private int Salary;
    private int Age;

    public void setName(String name){
        Name=name;
    }
    public void setAge(int age){
        Age=age;
    }
    public void setSalary(int salary){
        Salary=salary;
    }

    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return Name;
    }

    public int getAge(){
        return Age;
    }
}
