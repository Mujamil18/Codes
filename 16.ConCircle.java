import java.util.Scanner;
public class ConCircle {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of Outer Circle");
        int r1= s.nextInt();
        System.out.println("Enter the radius of Inner Circle");
        int r2= s.nextInt();
        float area= (3.14f * r1* r1) - (3.14f * r2 * r2);
        System.out.println("Area of Concentric Circle is " + area);
    }
}
