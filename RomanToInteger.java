import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanInt
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Roman Number");
        String roman= sc.nextLine();
        int n= roman.length();
        int num=0;
        Map<Character, Integer> romanInt= new HashMap<>();
        romanInt.put('I', 1);
        romanInt.put('V', 5);
        romanInt.put('X', 10);
        romanInt.put('L', 50);
        romanInt.put('C', 100);
        romanInt.put('D', 500);
        romanInt.put('M', 1000);
        for(int i=0; i<n; i++)
        {
            if (i > n-1 && romanInt.get(roman.charAt(i)) > romanInt.get(roman.charAt(i + 1)))
            {
                num = num + romanInt.get(roman.charAt(i));
            }
            else {
                num = num + romanInt.get(roman.charAt(i+1)) - romanInt.get(roman.charAt(i));
                i++;
            }
        }
        System.out.println("Number form of " + roman + " is: " + num);
    }
}
