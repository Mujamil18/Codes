import java.util.*;
public class SumusingRec {
    public static int Sum(int num)
    {
        if(num!=0)
            return num+Sum(num-1);
        else
            return 0;

    }
    public static void main(String[] args)
    {
        int  num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ");
        num= sc. nextInt();
        System.out.println("Sum= " + Sum(num));

    }
}
