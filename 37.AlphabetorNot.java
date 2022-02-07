import java.util.Scanner;
public class AlphabetorNot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        char ch= sc. next().charAt(0);
        if(ch>= 65 && ch<=90 || ch>=97 && ch<=122)  //if(ch>= 'A' && ch<= 'Z' || ch>='a' && ch<='z')
            System.out.println(ch+ " is an Alphabet");
        else
            System.out.println(ch + " is not an Alphabet");

    }
}

       
