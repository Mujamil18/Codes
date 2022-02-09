import java.util.Scanner;
public class Polynomial {
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner sc= new Scanner(System.in);
        System.out.print("a= ");
        a= sc.nextInt();
        System.out.print("b= ");
        b= sc.nextInt();
        System.out.print("c= ");
        c= sc.nextInt();

        int d= b*b - 4 * a * c;

        if(d>0.0)
        {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1= " + x1 + " x2= " + x2);
            System.out.println("Roots are real and distinct");
        }
        else if(d==0.0)
        {
            double x1= -b/(2.0 * a);
            System.out.println("x1= " + x1);
            System.out.println("Roots are real and identical");
        }
        else {
            System.out.println("Roots are not real");
        }
    }
}
