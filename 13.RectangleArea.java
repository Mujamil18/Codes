import java.util.Scanner;
public class RectangleArea {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Length= ");
        int l= s.nextInt();
        System.out.println("Breadth= ");
        int b= s.nextInt();
        System.out.println("Area of Rectangle is " + l*b);
    }
}
