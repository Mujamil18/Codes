import java.util.Scanner;
public class TimeConversion {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String str= scanner.nextLine();
      
        //Getting the first element in string as an integer
        int h1= (int) str.charAt(0)-'0';
      
        //Getting second element in string as an integer
        int h2= (int) str.charAt(1)-'0';
      
        //Combining the first and second element in time format
        int hh= ( h1 * 10 ) + ( h2 % 10);
      
        int i;

        //if the time AM
        if(str.charAt(8)=='A')
        {
            if(hh==12){
                System.out.print("00");
                for(i=2; i<=7; i++)
                    System.out.print(str.charAt(i));}
            else {
                for(i=0; i<=7; i++)
                    System.out.print(str.charAt(i));}
        }
        //if the time PM
        if(str.charAt(8) == 'P')
        {
            if(hh==12)
            {
                for(i=0; i<=7; i++)
                    System.out.print(str.charAt(i));
            }
            else
            {
                hh += 12;
                System.out.print(hh);
                for(i=2; i<=7; i++)
                    System.out.print(str.charAt(i));
            }
        }
    }
}
