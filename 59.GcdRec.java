import java.util.Scanner;
public class GcdRec {
    public static void main(String[] args)
    {
        int num, a, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        a= sc.nextInt();
        b= sc.nextInt();
        num= (Math.max(a,b))/2;
        System.out.println("GCD of the numbers is " + findgcd(a, b,num ));
    }
    public static int findgcd(int a, int b, int num)
    {
        if(a%num==0 && b%num==0){
            return num;}
        else{
           return findgcd(a, b, num-1);}
    }
}
