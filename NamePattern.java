
public class PatternName {
    public static void main(String[] args) {
        char[] n = {'M', 'U', 'J', 'A', 'M', 'I', 'L'};
        for (int i = 0; i <=n.length; i++)
        {
            for(int k=i; k<n.length; k++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++)
            {
                System.out.print(n[j]+ " ");
            }
      /*  for(int i= 1; i<=n; i++)
        {
            for (int j = i; j < n; j++)
            {
                System.out.print("@");
            }
            for(int k=1; k<=i*2-1; k++)
            {
                System.out.print("%");
            }
            for(int j= i; j<n; j++)
            {
                System.out.print("@");
            }
            System.out.println(); */
            System.out.println();
        }
    }
}
