import java.util.Scanner;
public class LcmofTwo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int lcm= Math.max(a,b);
        while(lcm>0) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM of the numbers is " + lcm);
                break;
            }
            ++lcm;
        }
    }
}
