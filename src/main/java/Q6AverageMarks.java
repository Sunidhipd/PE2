import java.util.Scanner;

public class Q6AverageMarks {

    public double getAverage(int stud, int[] marks){
        double avg=0.0;
        for(int i=0;i<stud;i++){
            avg+=marks[i];
        }
        avg=avg/stud;
        return avg;
    }

    public double getMin(int stud, int[] marks){
        double mini=marks[0];
        for(int i=1;i<stud;i++){
            if(marks[i]<mini)
                mini=marks[i];
        }
        return mini;
    }

    public double getMax(int stud, int[] marks){
        double maxi=marks[0];
        for(int i=1;i<stud;i++){
            if(marks[i]>maxi)
                maxi=marks[i];
        }
        return maxi;
    }

    public static void main(String[] args){
        Q6AverageMarks q = new Q6AverageMarks();
        Scanner sc = new Scanner(System.in);
        int students= sc.nextInt();
        int[] mark = new int[students];
        for(int i=0;i<students;i++){
            mark[i]= sc.nextInt();
        }
        System.out.println(q.getAverage(students,mark));
        System.out.println(q.getMin(students,mark));
        System.out.println(q.getMax(students,mark));
    }
}
