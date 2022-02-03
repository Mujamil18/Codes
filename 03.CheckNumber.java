import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        int a= s.nextInt();
        long b= s.nextLong();
        if(a==b)
            System.out.println(a + " and " + b + " are same");
        else
            System.out.println(a + " and " + b + " are not same");
    }
}
