import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i, sum = 0;
        for (i= 1; i<=n; i++)
        {
            System.out.print(" " + i);
            sum = sum + i;
        }
        System.out.println("\nSum of the numbers is " + sum);
    }

}
