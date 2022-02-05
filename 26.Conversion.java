import java.util.Scanner;
public class Conversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilometer to Miles");
        float km= sc. nextFloat();
        float mile= 0.621f * km;
        System.out.println(km + " kilometer is equal to " + mile + " miles");

        System.out.println("Centigrade to Fahrenheit");
        float C= sc.nextFloat();
        float F= (C * 1.8f) + 32;
        System.out.println(C + " celsius is equal to " + F);

        System.out.println("SquareFeet to Acre");
        float sqft= sc.nextFloat();
        float acre= sqft/43560f;
        System.out.println(sqft + " Square Feet is equal to " + acre + "Acre");

    }

}
