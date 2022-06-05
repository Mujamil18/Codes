/* You  are given array of pries[i] given stock on the ith day. You want to minimize your profit
  by choosing a single day to buy one stock and choosing a different day in the future to sell that stock
  Return the maximum profit you can achieve from this transaction, if you cannot achieve any profit, return 0 */
package practice;

import java.util.Scanner;

public class ProfitMax
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the Prices");
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        maxProfit(arr, n);

    }
    static void maxProfit(int[] arr, int n)
    {
        int profit, max=0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1 ; j<n; j++)
            {
//                temp = profit;
                profit= arr[j] - arr[i];
//                System.out.println("Profit" + profit);
//                System.out.println("max" + max);
                if(profit > max)
                {
                    max = profit;
                }
//                System.out.println(max);
            }
        }
        System.out.println("The Maximum profit is: " + max);
    }
}
