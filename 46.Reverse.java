import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int  rev=0, rem;
        int num= sc.nextInt();
        while(num!=0)
        {
            rem= num%10;
            rev=  rev * 10 + rem;
            num=num/10;
        }
        System.out.println("Reversed Number is " + rev);
    }

}
