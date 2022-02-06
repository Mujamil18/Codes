import java.util.Scanner;
public class PrimeorNot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        for(int i=2; i<=num/2; ++i) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
            }
        }
        System.out.println(num + " is a Prime Number");
        }
    }

