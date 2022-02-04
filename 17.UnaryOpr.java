public class UnaryOpr {
    public static void main(String[] args){
        int a= 10;
        System.out.println(a);
        System.out.println("Unary Minus operator");
        a=-a;
        System.out.println(a);
        a= 10 - a;
        System.out.println(a);
        System.out.println("Post Increment and Pre Increment");
        a++;
        System.out.println(a);
        a = ++a + 1;
        System.out.println(a);
        System.out.println("Post Decrement and pre Decrement");
        a--;
        System.out.println(a);
        a = --a + 1;
        System.out.println(a);
        

    }
}
