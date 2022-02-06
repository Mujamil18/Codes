import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int  num=0, rem, sum=0, count=0;
        num=n;
        while(n!=0)
        {
            n= n/10;
            count++;
        }
        n=num;
        while(n!=0)
        {
            rem = n%10;
            sum = sum+ (int)Math.pow(rem, count);
            n=n/10;
        }
        if(num==sum)
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is not an Armstrong Number");

    }

}
