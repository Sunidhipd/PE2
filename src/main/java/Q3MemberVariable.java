import java.util.Scanner;

public class Q3MemberVariable {

    String name;
    int salary;
    int age;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

    public void setSalary(int s){
        salary=s;
    }
    public int getSalary(){
        return salary;
    }
    public void setAge(int a){
        age= a;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        Q3MemberVariable q = new Q3MemberVariable();
        Scanner sc = new Scanner(System.in);
        String namei = sc.nextLine();
        q.setName(namei);
        System.out.println(q.getName());
        int salaryi = sc.nextInt();
        q.setSalary(salaryi);
        System.out.println(q.getSalary());
        int agei = sc.nextInt();
        q.setAge(agei);
        System.out.println(q.getAge());
    }
}
