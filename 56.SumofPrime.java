import java.util.Scanner;
public class SumofPrime {
    public static boolean Prime(int n) {
        int p;
        for (p = 2; p <= n / 2; p++) {
            if (n % p == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i = 2; i < num / 2; i++) {
            if (Prime(i) && Prime(num - i)) ;
            {
                System.out.println(num + " is a sum of two prime numbers");
                return;
            }
        }
        System.out.println(num + " is not a sum of prime numbers");
    }
}
