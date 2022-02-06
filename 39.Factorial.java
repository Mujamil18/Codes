import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int  fac=1;
        while(num>=1)
        {
            fac = fac * num;
            num--;
        }
        System.out.println("Factorial of the above is " + fac);
    }
}
