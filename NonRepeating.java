//Program to find the first non-repeating character in a string
import java.util.Scanner;

public class StringProgram
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();

         for(int i=0; i<str.length() ; i++)
         {
             boolean isNotRepeating= true;
            for(int j=0; j<str.length(); j++)
            {
                System.out.println("inner loop");
                if (i!=j && str.charAt(i) == str.charAt(j))
                {
                    isNotRepeating= false;
                    break;
                }
            }
            if(isNotRepeating)
            {
                System.out.println("The first non-repeating character in the given is: " + str.charAt(i));
                break;
            }
        }
    }
}
