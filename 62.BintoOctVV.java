import java.util.Scanner;
public class BintoOctVV {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        /*long oct=0, dec=0, i=0;
        System.out.println("Binary to Octal");
        System.out.println("Enter a Binary number");
        long bin= sc.nextInt();
         while(bin!=0)
         {
             dec= dec + (bin % 10) * (int) Math.pow(2, i);
             i++;
             bin = bin/10;
         }
         i=1;
         while(dec!=0)
         {
             oct = oct + (dec % 8) * i;
             dec = dec / 8;
             i= i*10;
         }
         System.out.println("Octal value is " + oct); */
        long bin=0,dec=0, rem, i=0;
        System.out.println("Octal to Binary");
        System.out.println("Enter a Number");
        int oct= sc.nextInt();
         while(oct!=0)
         {
             rem = oct%10;
             dec= dec + (rem * (int) Math.pow(8,i));
             ++i;
             oct = oct/10;
         }
         i=1;
         while(dec!=0)
         {
             rem = dec%2;
             bin = bin + rem * i;
             dec= dec/2;
             i= i* 10;
         }
         System.out.println(bin);

    }
}

