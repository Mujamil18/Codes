import java.util.Scanner;
public class MinMaxG {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        long  max = a[0];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            if (a[i] > max)
                max = a[i];


        }
        System.out.print(max + " ");

        long min=a[0];
        for (int i = 0; i < n; i++)
        {
            if (a[i] < min)
                min = a[i];
        }
        System.out.print(min);
    }
}

