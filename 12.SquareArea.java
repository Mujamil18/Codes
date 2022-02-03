import java.util.Scanner;
public class SquareArea {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int side= sc.nextInt();
        int area;
        area= side*side;
        System.out.println("Area of Square " + area);
    }
}
