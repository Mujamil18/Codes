import java.util.Scanner;
public class SentenceRev {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Write Something");
        String  str= sc.nextLine();
        int len= str.length();
        char[] a= new char[len];
        for(int i=0; i<len; i++)
        {
            a[i]= str.charAt(i);
        }
        System.out.println(Reverse(a, 0, len-1));
    }
    public static char[] Reverse(char[] st, int i, int n)
    {
        if(i<n) {
            char temp;
            temp = st[i];
            st[i] = st[n];
            st[n] = temp;
            Reverse(st, i + 1, n - 1);
        }
        return st;

    }
}
