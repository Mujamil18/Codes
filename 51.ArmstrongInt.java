import java.util.Scanner;
public class ArmstrongInt {
    public static void main(String[] args) {
        int  min, max, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Intervals ");
        min = sc.nextInt();
        max = sc.nextInt();
        System.out.println("The Armstrong Numbers between the given intervals are:");
        for (int num = min+1; num < max; ++num) {
            int count = 0;
            int sum = 0;
            int n = num;

            while (n != 0) {
                n = n / 10;
                ++count;
            }
            n = num;
            while (n != 0) {
                rem = n % 10;
                sum = sum + (int) Math.pow(rem, count);
                n = n / 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
