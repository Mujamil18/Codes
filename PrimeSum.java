//to print the prime number when its sum of digits are also a prime number.
package practice;

import java.util.Scanner;

public class PrimeSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PrimeSum obj= new PrimeSum();
        int n= sc.nextInt();
        int prime, sum, count=0;
        for(int i=1; i<n*5; i++)
        {
            if(i==1)
            {
                continue;
            }
            if(obj.checkPrime(i) != 0)
            {
                //assigning the number returned from the checkPrime method to a variable
               prime= obj.checkPrime(i);
                //assigning the number returned from the sumDigit method to variable
               sum = obj.sumDigit(prime);
                //if the sum is prime , the number will be printed and count variable is incremented
                if(obj.checkSumPrime(sum))
                {
                    System.out.print(prime + " ");
                    count++;
                }
                //if the count is equal to the n ,then break the loop
                if(count==n)
                    break;
            }
        }
    }
    //to check the given number is prime or not
    int checkPrime(int i)
    {
        int  flag=1;
        for(int j=2; j<=i/2; j++)
        {
            if(i%j == 0)
            {
                flag=0;
                break;
            }
        }
        if(flag == 1) {
            return i;
        }
        return 0;
    }
    //to sum the digits of the prime number
    int sumDigit(int n)
    {
        int rem, sum=0;
        while(n!=0)
        {
          rem = n % 10;
          sum += rem;
          n/=10;
        }
        return sum;
    }
    //to check the sum of the digits is prime or not, if it is prime , the return true
    boolean checkSumPrime(int sum)
    {
        for(int i=2; i<=sum/2 ; i++)
        {
            if(sum % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
