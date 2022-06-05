/*Program to print each number from 1 to n on a new line.
  For each multiple of 3, print "Rat" instead of the number, Similarly for multiple of 5, print "Tat".
  For numbers which are multiples of both 3 and 5, print "RatTat". */
package practice;

import java.util.Scanner;

public class RatTat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Limit");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(i % 3 ==0 && i % 5== 0)
            {
                System.out.println("RatTat");
            }
            else if(i % 3 ==0)
            {
                System.out.println("Rat");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Tat");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
