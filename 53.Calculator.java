import java.util.Scanner;
import java.lang.String;

public class Calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float a, b, res;
        System.out.println("Enter two numbers");
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println("Enter the Operation");
        String op= sc.next();

        switch(op)
        {
            case "add" :
                res= a+b;
                System.out.println("a= " + a + " + " + "b= " + b + " = " + res);
                break;
            case "Subtract" :
                res= a-b;
                System.out.println("a= " + a + " - " + "b= " + b + " = " + res );
                break;
            case "multiply" :
                res=a*b;
                System.out.println("a= " + a + " * "  + "b= " + b + " = " + res );
                break;
            case "divide" :
                res=a/b;
                System.out.println("a= " + a + " / " + "b= " + b + " = " + res );
                break;
            default:
                System.out.println("Enter Add/ Subtract/ Multiply/ Divide");
        }
    }
}
