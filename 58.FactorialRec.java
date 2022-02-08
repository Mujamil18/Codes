import java.util.Scanner;
public class FactorialRec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Factorial of the number is " + Factorial(num));
    }

    public static int Factorial(int num) {
        if(num>=1)
            return num * Factorial(num - 1);
        else
            return 1;
        }
    }


