import java.util.Scanner;
public class Oct2DecVV {
    public static void main(String[] args)
    {
        //int rem, i=0, dec=0;
        Scanner sc= new Scanner(System.in);
        /*System.out.println("Octal to decimal");
        System.out.println("Enter a number");
        int oct= sc.nextInt();
        while(oct!=0)
        {
            rem = oct%10;
            dec= dec + (rem * (int) Math.pow(8,i));
            i++;
            oct = oct/10;
        }
        System.out.println(dec + " is the Decimal Value");*/
        int rem, i=1, oct=0;
        System.out.println("Decimal to Octal");
        System.out.println("Enter a number");
        int dec= sc.nextInt();
        while(dec!=0)
        {
            rem = dec % 8;
            oct = oct + i * rem;
            dec = dec/8;
            i = i* 10;
        }
        System.out.println("Octal Value is " + oct);
    }
}
