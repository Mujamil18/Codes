import java.util.Scanner;
public class QuoRem {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Dividend");
        int a= sc.nextInt();
        System.out.println("Enter Divisor");
        int b= sc.nextInt();

        int quo= a/b;
        System.out.println("Quotient is " + quo);

        int rem= a%b;
        System.out.println("Remainder is  " + rem);

    }

}
