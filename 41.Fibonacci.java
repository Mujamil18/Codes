import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max= sc.nextInt();
        int n1=0, n2=1;
        for(int i=1; i<=max; ++i)
        {
            System.out.print(n1 + " ");
            int sum= n1 + n2;
            n1=n2;
            n2=sum;
        }
    }
}
