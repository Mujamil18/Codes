import java.util.Scanner;

public class EmailValidation
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a Mail Id");
        String mailId= in.nextLine();
        String regex= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean isMatched= mailId.matches(regex);
        if(isMatched)
        {
            System.out.println("Valid Mail Id");
        }
        else
        {
            System.out.println("Invalid Mail Id");
        }
    }
}
