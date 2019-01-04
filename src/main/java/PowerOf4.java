import java.util.Scanner;

public class Q2PowerOf4 {

    public boolean FourPower(int n){
        if(n == 0)
            return false;
        while(n != 1)
        {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }

    public static void main(String[] args){
        Q2PowerOf4 q = new Q2PowerOf4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(q.FourPower(n))
            System.out.println("Is power of 4");
        else
            System.out.println("Is not power of 4");
    }
}
