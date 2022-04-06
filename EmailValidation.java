import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a Mail Id");
        String mailId= in.nextLine();
        mailId= mailId.toLowerCase();
        Matcher isCorrect= Pattern.compile("[a-z_@.]").matcher(mailId);
        if(isCorrect.find())
        {
            System.out.println("Valid Mail Id");
        }
        else
        {
            System.out.println("Invalid Mail Id");
        }
    }
}
