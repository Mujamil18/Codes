import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int pow=sc.nextInt();

        double n= Math.pow(num, pow);
        System.out.println(n);

      //  int n=1;
        //while(num!=0)
        //{
        //  n= n * num;
        //pow--;
        //}
        //System.out.println(num+ " power of " +pow + "is " + n);
    }
}

