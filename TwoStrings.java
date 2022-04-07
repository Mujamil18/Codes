//Find the difference by outputting the characters that are not present in the one but in the other word.
import java.util.Scanner;

public class TwoStrings
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str1= in.nextLine();
        String str2= in.nextLine();
        String sameChar= "";
        for(int i=0; i<str1.length(); i++)
        {
            for(int j=0; j<str2.length(); j++)
            {
                if (str1.charAt(i) == str2.charAt(j))
                {
                  sameChar = sameChar + str1.charAt(i);
                }
            }
        }
        for(int i=0; i<sameChar.length(); i++)
        {
            String remove= sameChar.charAt(i)+"";
            str1= str1.replace(remove, "");
            str2=str2.replace(remove, "");
        }
       System.out.println("After removing the commom characters" + str1);
    }
}
