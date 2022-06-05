//Program to find all the numbers from M to N that satisfy the following conditon
//1. Take a number Z and add all its digits to get a number X.
//2.Now the reverse the number X to get Y
//3. If we multiply X and Y you should get back Z.
package practice;

import java.util.Scanner;

public class XYZNumber
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the intervals");
        int min= in.nextInt();
        int max= in.nextInt();
       XYZNumber obj= new XYZNumber();
       for(int num =min; num<=max; num++)
       {
           int sum=0, rev=0, result;
           if(num != 0)
           {
               sum = obj.sumDigits(num, sum);
               rev = obj.reverseSum(sum, rev);
               result = obj.mulNumber(sum, rev);
               if (num == result)
               {
//                   System.out.println(sum);
//                   System.out.println(rev);
//                   System.out.println(result);
//                   System.out.println("yes");
                   System.out.println(num);
               }
           }
       }
    }
    int sumDigits(int num, int sum)
    {
        int rem;
        while(num > 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        return sum;
    }
    int reverseSum(int sum, int rev)
    {
        int rem;
        while (sum > 0)
        {
            rem = sum % 10;
            rev = (rev * 10) + rem;
            sum = sum / 10;
        }
       return rev;
    }
    int mulNumber(int sum, int rev)
    {
        int result;
        result= sum * rev;
        return result;
    }
}

