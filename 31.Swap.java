import java.util.Scanner;
public class SwapTwoNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc. nextInt();
        System.out.println("a= " + a + " b= " + b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Numbers are Swapped");
        System.out.println("a= " + a + " b= " + b);
    }
}
