import  java.util.Scanner;
public class CylinderArea {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Height= ");
        int h= sc.nextInt();
        System.out.println("Radius= ");
        int r= sc.nextInt();
        float area= 2 * 3.14f * r * (h + r);
        System.out.println("Area of the Cylinder is " +area);

    }
}
