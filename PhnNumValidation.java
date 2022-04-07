import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhnNumValidation
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a Phone Number");
      String phoneNumber= in.nextLine();
      Matcher num= Pattern.compile("^[+0]{0,2}(91)?[0-9]{10}$").matcher(phoneNumber);
      if(num.find())
      {
          System.out.println("Valid Phone Number");
      }
      else
      {
          System.out.println("Invalid Phone Number");
      }
    }

}

