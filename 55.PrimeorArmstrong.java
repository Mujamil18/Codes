import java.util.Scanner;
public class PrimeorArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        Armstrong(n);
        Prime(n);
    }

    public static void Armstrong(int n)
    {
        int num = 0, rem, sum = 0, count = 0;
        num = n;
        while (n != 0)
        {
            n = n / 10;
            count++;
        }
        n = num;
        while (n != 0)
        {
            rem = n % 10;
            sum = sum + (int) Math.pow(rem, count);
            n = n / 10;
        }
        if (num == sum)
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is not an Armstrong Number");
    }
    public static void Prime(int n)
    {
        int count=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==2)
            System.out.println(n + "is a Prime number");
        else
            System.out.println(n + " is not a Prime number");
    }
}



