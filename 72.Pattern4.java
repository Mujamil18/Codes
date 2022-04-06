public class Pattern4 {
    public static void main(String[] args) {
        int n=9,i, j, k;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++)
            {
                System.out.print(j +" ");
            }
            for (k = j - 2; k > 0; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
