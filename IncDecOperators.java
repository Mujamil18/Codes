public class IncDecOperators {
    public static void main(String[] args)
    {
        int m= 10, n=20;
        int x= m++ + ++n; //m is 10 and n is 21 (10+21=31)
        System.out.println(x);
        System.out.println(m + " " + n); // m is incremented here

        int a= 10, b=20;
        int y= a-- + --b; //a is 10 and b is 19
        System.out.println(y);
        System.out.println(a + " " + b); // a is decremented here

    }
}
