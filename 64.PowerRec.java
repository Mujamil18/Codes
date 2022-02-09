import java.util.Scanner;
public class PowerRec {
    public static int Power(int num, int pow)
    {
        if(pow!=0)
            return (num * Power(num, pow-1));
        else
            return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Enter the power");
        int pow= sc.nextInt();
        int res= Power(num, pow);
        System.out.println(num + "^" + pow + "=" + res );
    }
}
