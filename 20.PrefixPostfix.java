public class PrefixPostfix {
    public static void main(String[] args)
    {
        int a= 10 ,b=8, num;
        System.out.println("Post and pre Increment");
        num = a++ + 5;
        System.out.println(num);
        System.out.println(a);
        num =  ++a + 5;
        System.out.println(num);
        System.out.println(a);

        System.out.println("Post and Pre Decrement");
        num= b-- + 6;
        System.out.println(num);
        System.out.println(b);
        num= --b + 6;
        System.out.println(num);
        System.out.println(b);

    }
}
