public class Expression23 {
    public static void main(String[] args){
        int x= 5;
        x = x++ * 2 + 3 * --x; //25
        System.out.println(x);
    }
}
