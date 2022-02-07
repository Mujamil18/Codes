import java.util.Scanner;
public class PrimeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max, flag;
        System.out.println("Enter the Intervals ");
        min = sc.nextInt();
        max = sc.nextInt();

        System.out.println("The Prime Numbers between " + min + " and " + max + " are ");
        for (int i = min; i <= max; i++) {
            if (i == 1 || i == 0)
                continue;

            flag = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
                if (flag == 1)
                    System.out.print(i+ " ");
        }
    }
}
