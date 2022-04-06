public class Pattern5 {
    public static void main(String[] args){
        int n=9, i, j, k;
        for(i=n; i>=1; i--)
        {
            for(j=1; j<i*2-1; j++)
            {
                System.out.print(" ");
            }
            for(k=i; k<=n; k++)
            {
                System.out.print(k+ " ");
            }
            for(j=n-1;j>=i; j--)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
}
