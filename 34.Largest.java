public class LargestNumber {
    public static void main(String[] args){
        int a=10, b=80, c=30,big;
        big= a>b ? a : Math.max(b, c);
        System.out.println("The Largest Number among three is " + big);

        if(a>b && a>c)
                System.out.println("a is the largest");
        else if(b>c)
            System.out.println("b is the largest");
        else
            System.out.println("c is the largest");

    }
}
