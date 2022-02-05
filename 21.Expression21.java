public class Expression21 {
    public static void main(String[] args){
        int a=5, b=3, res, x;
        res= ++a - b-- ;
        System.out.println(res);
        System.out.println( a + " " + b);

        res= a % b++;
        System.out.println(res);
        System.out.println(a + " " +b);

        a *= b + 5;
        System.out.println(a);
        System.out.println(a + " " +b);

        x= 69>>>2;
        System.out.println(x);
    }

}
