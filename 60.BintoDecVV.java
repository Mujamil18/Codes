import java.util.Scanner;
public class BintoDecVV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*int i = 0;
        long rem, dec = 0;
        System.out.println("Binary to Decimal");
        System.out.println("Enter a Binary number");
        long bin = sc.nextLong();

        while (bin > 0) {
            rem = bin % 10;
            dec += last * Math.pow(2, i++);
            bin = bin / 10;
        }
        System.out.print("The Decimal number is " + dec); */

        System.out.println("Decimal to Binary");
        System.out.println("Enter a Decimal number");
        int dec= sc.nextInt();
        long bin=0, rem, i=1;
        while (dec!=0)
        {
            rem = dec%2;
            bin = bin + rem * i;
            dec= dec/2;
            i= i* 10;
        }
        System.out.println("The Binary number is " + bin);
    }
}
