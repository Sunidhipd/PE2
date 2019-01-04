import java.util.Scanner;

public class Q5TestIsEven {

    public boolean Even(int n){
        if(n%2==0)
            return true;
        else return false;
    }

    public static void main(String[] args){
        Q5TestIsEven q = new Q5TestIsEven();
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        if(q.Even(m))
            System.out.println("Even");
        else
            System.out.println("Not even");
    }
}
