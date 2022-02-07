public class Pattern7 {
    public static void main(String[] args){
        int i,j, k,n=9;
        for(i=9; i>=1; i--)
        {
            for(k=i-1; k<n; k++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
