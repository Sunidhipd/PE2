import java.util.Scanner;

public class Q1Palindrome {

    public boolean palindrome(int k){
        long revn=0, rem, sum=0;
        long temp = k;
        while(temp!=0){
            rem= temp%10;

            if(rem%2==0)
                sum+=rem;

            revn= revn*10 + rem;
            temp= temp/10;
        }

        if(k!=revn)
            return false;
        else
            return true;
    }

    public static void main(String[] args){
        Q1Palindrome q = new Q1Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        if(q.palindrome(n)==true)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
