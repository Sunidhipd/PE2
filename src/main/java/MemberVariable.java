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

    public class Member{
        MemberVariable member = new MemberVariable();

        public String getMemberName(String name){
            member.setName(name);
            String res=member.getName();
            return res;
        }
        public int getMemberAge(int age){
            member.setAge(age);
            int res=member.getAge();
            return res;
        }

        public int getMemberSalary(int salary){
            member.setSalary(salary);
            int res=member.getSalary();
            return res;
        }
    }
}
