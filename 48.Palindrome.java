import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0, rem,n=num;
        while(num!=0)
        {
            rem=num%10;
            rev= rev * 10 + rem;
            num = num/10;
        }
        if(n==rev)
            System.out.println("The number is a Palindrome");
        else
            System.out.println("The number is not a palindrome");

    }
}
