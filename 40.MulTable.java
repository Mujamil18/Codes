import java.util.Scanner;
public class MulTable {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to display its Multiplication Table");
        int n= sc.nextInt();
        System.out.println("Enter a number for limit");
        int m= sc.nextInt();
        for (int i = 1; i <= m; i++)
            System.out.println(n + " * " + i + " = " + n * i);
    }
}
