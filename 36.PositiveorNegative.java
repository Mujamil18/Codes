import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        if(n>0)
            System.out.println("The number is Positive");
        else if(n<0)
            System.out.println("The number is Negative");
        else
            System.out.println(n + " is neither positive nor negative");
    }
}
